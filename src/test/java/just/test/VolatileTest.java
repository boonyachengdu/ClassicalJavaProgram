package just.test;

import org.junit.Test;
/**
 * <b>应用volatile变量的四个原则：</b>
 * <li>   (1)写入变量不依赖此变量的值，或者只有一个线程修改此变量</li>
 * <li>   (2)变量的状态不需要与其它变量共同参与不变约束</li>
 * <li>   (3)访问变量不需要加锁</li>
 * <li>   (4)由于使用volatile屏蔽掉了VM中必要的代码优化，所以在效率上比较低，因此一定在必要时才使用此关键字。</li>
 * @package justtest.VolatileTest
 * @date   2016年12月2日  下午3:11:39
 * @author pengjunlin
 * @comment   
 * @update
 */
public class VolatileTest {
	
	public static volatile int race = 0;  
	  
    public static void increase() {  
        race++;  
    }  
  
    public static int THREADS_COUNT = 20;  
  
    /**
     * 我们的预期是输出200000，但大多数情况下输出的值都比200000小
     * @MethodName: test 
     * @Description: 
     * @throws
     */
    @Test
    public void test(){
    	  Thread[] threads = new Thread[THREADS_COUNT];  
          for (int i = 0; i < THREADS_COUNT; i++) {  
              threads[i] = new Thread(new Runnable() {  
                  public void run() {  
                      for (int i = 0; i < 10000; i++) {  
                          increase();  
                      }  
                  }  
              });  
              threads[i].setName("Thread-"+i);
              threads[i].start();              
    
          }  
          while (Thread.activeCount() > 1) {              
              Thread.yield();  
              System.out.println(Thread.currentThread().getName()+"\t"+race);  
          }  
    }

}
