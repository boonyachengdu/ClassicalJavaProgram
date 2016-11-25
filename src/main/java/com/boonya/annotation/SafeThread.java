package com.boonya.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
/**
 * 安全的线程注解,参考地址：http://www.cnblogs.com/peida/archive/2013/04/24/3036689.html
 * 
 * <br/><br/>Java5.0定义的元注解：<br/>
 * <li>1.@Target</li>
 * <li>2.@Retention</li>
 * <li>3.@Documented</li>
 * <li>4.@Inherited </li>
 * >>>>>>>>>>ElementType取值:<<<<<<<<<<<<<<br/>
 * <li>1.CONSTRUCTOR:用于描述构造器</li>
 * <li>2.FIELD:用于描述域</li>
 * <li>3.LOCAL_VARIABLE:用于描述局部变量</li>
 *　<li>4.METHOD:用于描述方法</li>
 *　<li>5.PACKAGE:用于描述包</li>
 *　<li>6.PARAMETER:用于描述参数</li>
 *　<li>7.TYPE:用于描述类、接口(包括注解类型) 或enum声明</li>
 * @package com.boonya.annotation.SafeThread
 * @date   2016年11月25日  下午4:58:34
 * @author pengjunlin
 * @comment   
 * @update
 */
@Target(value=ElementType.TYPE)
@Documented
public @interface SafeThread {

}
