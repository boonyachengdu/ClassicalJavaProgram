package com.boonya.program.lang.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import com.boonya.program.lang.reflect.beans.Circle;
import com.boonya.program.lang.reflect.beans.User;
/**
 * 反射测试
 * 参考地址：http://blog.csdn.net/javazejian/article/details/70768369
 * @package com.boonya.program.lang.reflect.ReflectSample
 * @date   2017年5月9日  下午3:21:06
 * @author pengjunlin
 * @comment   
 * @update
 */
public class ReflectSample {
	
	/*
	*//** 
	  *    修饰符、父类、实现的接口、注解相关 
	  *//*
	//获取修饰符，返回值可通过Modifier类进行解读
	public native int getModifiers();
	//获取父类，如果为Object，父类为null
	public native Class<? super T> getSuperclass();
	//对于类，为自己声明实现的所有接口，对于接口，为直接扩展的接口，不包括通过父类间接继承来的
	public native Class<?>[] getInterfaces();
	//自己声明的注解
	public Annotation[] getDeclaredAnnotations();
	//所有的注解，包括继承得到的
	public Annotation[] getAnnotations();
	//获取或检查指定类型的注解，包括继承得到的
	public <A extends Annotation> A getAnnotation(Class<A> annotationClass);
	public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass);

	*//** 
	  *   内部类相关
	  *//*
	//获取所有的public的内部类和接口，包括从父类继承得到的
	public Class<?>[] getClasses();
	//获取自己声明的所有的内部类和接口
	public Class<?>[] getDeclaredClasses();
	//如果当前Class为内部类，获取声明该类的最外部的Class对象
	public Class<?> getDeclaringClass();
	//如果当前Class为内部类，获取直接包含该类的类
	public Class<?> getEnclosingClass();
	//如果当前Class为本地类或匿名内部类，返回包含它的方法
	public Method getEnclosingMethod();

	*//** 
	  *    Class对象类型判断相关
	  *//*
	//是否是数组
	public native boolean isArray();  
	//是否是基本类型
	public native boolean isPrimitive();
	//是否是接口
	public native boolean isInterface();
	//是否是枚举
	public boolean isEnum();
	//是否是注解
	public boolean isAnnotation();
	//是否是匿名内部类
	public boolean isAnonymousClass();
	//是否是成员类
	public boolean isMemberClass();
	//是否是本地类
	public boolean isLocalClass(); */

	/**
	 * 反射构造器获取对象
	 * 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @MethodName: constructor 
	 * @Description: 
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws
	 */
	@SuppressWarnings("rawtypes")
	public void constructor() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> clazz = null;

		// 获取Class对象的引用
		clazz = Class.forName("com.boonya.program.lang.reflect.beans.User");

		// 第一种方法，实例化默认构造方法，User必须无参构造函数,否则将抛异常
		User user = (User) clazz.newInstance();
		user.setAge(20);
		user.setName("Rollen");
		System.out.println(user);

		System.out.println("--------------------------------------------");

		// 获取带String参数的public构造函数
		Constructor cs1 = clazz.getConstructor(String.class);
		// 创建User
		User user1 = (User) cs1.newInstance("xiaolong");
		user1.setAge(22);
		System.out.println("user1:" + user1.toString());

		System.out.println("--------------------------------------------");

		// 取得指定带int和String参数构造函数,该方法是私有构造private
		Constructor cs2 = clazz.getDeclaredConstructor(int.class, String.class);
		// 由于是private必须设置可访问
		cs2.setAccessible(true);
		// 创建user对象
		User user2 = (User) cs2.newInstance(25, "lidakang");
		System.out.println("user2:" + user2.toString());

		System.out.println("--------------------------------------------");

		// 获取所有构造包含private
		Constructor<?> cons[] = clazz.getDeclaredConstructors();
		// 查看每个构造方法需要的参数
		for (int i = 0; i < cons.length; i++) {
			// 获取构造函数参数类型
			Class<?> clazzs[] = cons[i].getParameterTypes();
			System.out.println("构造函数[" + i + "]:" + cons[i].toString());
			System.out.print("参数类型[" + i + "]:(");
			for (int j = 0; j < clazzs.length; j++) {
				if (j == clazzs.length - 1)
					System.out.print(clazzs[j].getName());
				else
					System.out.print(clazzs[j].getName() + ",");
			}
			System.out.println(")");
		}
	}
	
	/**
	 * 反射构造器本身的类的方法
	 * 
	 * @MethodName: clazz 
	 * @Description: 
	 * @throws ClassNotFoundException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws
	 */
	@SuppressWarnings("rawtypes")
	public void clazz() throws ClassNotFoundException, NoSuchMethodException, SecurityException{
		Class<?> clazz = null;

		// 获取Class对象的引用
		clazz = Class.forName("com.boonya.program.lang.reflect.beans.User");
	        
		Constructor cs3=clazz.getDeclaredConstructor(int.class,String.class);

		System.out.println("-----getDeclaringClass-----");
		Class uclazz=cs3.getDeclaringClass();
		//Constructor对象表示的构造方法的类
		System.out.println("构造方法的类:"+uclazz.getName());

		System.out.println("-----getGenericParameterTypes-----");
		//对象表示此 Constructor 对象所表示的方法的形参类型
		Type[] tps=cs3.getGenericParameterTypes();
		for (Type tp:tps) {
		    System.out.println("参数名称tp:"+tp);
		}
		System.out.println("-----getParameterTypes-----");
		//获取构造函数参数类型
		Class<?> clazzs[] = cs3.getParameterTypes();
		for (Class claz:clazzs) {
		    System.out.println("参数名称:"+claz.getName());
		}
		System.out.println("-----getName-----");
		//以字符串形式返回此构造方法的名称
		System.out.println("getName:"+cs3.getName());

		System.out.println("-----getoGenericString-----");
		//返回描述此 Constructor 的字符串，其中包括类型参数。
		System.out.println("getoGenericString():"+cs3.toGenericString());
	}
	
	/**
	 * 反射字段
	 * 
	 * @MethodName: field 
	 * @Description: 
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws
	 */
	public void field() throws NoSuchFieldException, SecurityException, ClassNotFoundException{
		 Class<?> clazz = Class.forName("com.boonya.program.lang.reflect.beans.Student");
	        //获取指定字段名称的Field类,注意字段修饰符必须为public而且存在该字段,
	        // 否则抛NoSuchFieldException
	        Field field = clazz.getField("age");
	        System.out.println("field:"+field);

	        //获取所有修饰符为public的字段,包含父类字段,注意修饰符为public才会获取
	        Field fields[] = clazz.getFields();
	        for (Field f:fields) {
	            System.out.println("f:"+f.getDeclaringClass());
	        }

	        System.out.println("================getDeclaredFields====================");
	        //获取当前类所字段(包含private字段),注意不包含父类的字段
	        Field fields2[] = clazz.getDeclaredFields();
	        for (Field f:fields2) {
	            System.out.println("f2:"+f.getDeclaringClass());
	        }
	        //获取指定字段名称的Field类,可以是任意修饰符的自动,注意不包含父类的字段
	        Field field2 = clazz.getDeclaredField("desc");
	        System.out.println("field2:"+field2);
	}
	
	/**
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * 反射方法
	 * 
	 * @MethodName: method 
	 * @Description: 
	 * @throws ClassNotFoundException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void method() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		Class clazz = Class.forName("com.boonya.program.lang.reflect.beans.Circle");

        //根据参数获取public的Method,包含继承自父类的方法
        Method method = clazz.getMethod("draw",int.class,String.class);

        System.out.println("method:"+method);

        //获取所有public的方法:
        Method[] methods =clazz.getMethods();
        for (Method m:methods){
            System.out.println("m::"+m);
        }

        System.out.println("=========================================");

        //获取当前类的方法包含private,该方法无法获取继承自父类的method
        Method method1 = clazz.getDeclaredMethod("drawCircle");
        System.out.println("method1::"+method1);
        //获取当前类的所有方法包含private,该方法无法获取继承自父类的method
        Method[] methods1=clazz.getDeclaredMethods();
        for (Method m:methods1){
            System.out.println("m1::"+m);
        }
        
        
        //创建对象
        Circle circle = (Circle) clazz.newInstance();

        //获取指定参数的方法对象Method
        method = clazz.getMethod("draw",int.class,String.class);

        //通过Method对象的invoke(Object obj,Object... args)方法调用
        method.invoke(circle,15,"圈圈");

        //对私有无参方法的操作
        method1 = clazz.getDeclaredMethod("drawCircle");
        //修改私有方法的访问标识
        method1.setAccessible(true);
        method1.invoke(circle);

        //对有返回值得方法操作
        Method method2 =clazz.getDeclaredMethod("getAllCount");
        Integer count = (Integer) method2.invoke(circle);
        System.out.println("count:"+count);
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		ReflectSample sample=new ReflectSample();
		sample.constructor();
		
		/*sample.clazz();
		
		sample.field();
		
		sample.method();*/
	}

}
