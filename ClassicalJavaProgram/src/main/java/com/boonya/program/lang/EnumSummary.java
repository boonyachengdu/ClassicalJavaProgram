package com.boonya.program.lang;

/*
 
>>>原理分析<<<

enum 的语法结构尽管和 class 的语法不一样，但是经过编译器编译之后产生的是一个class文件。该class文件经过反编译可以看到实际上是生成了一个类，

该类继承了java.lang.Enum<E>。EnumDay 经过反编译(javap com.boonya.program.lang.EnumDay 命令)之后得到的内容如下：

public class com.boonya.program.lang.EnumDay extends java.lang.Enum{
public static final com.boonya.program.lang.EnumDay MON;
public static final com.boonya.program.lang.EnumDay TUE;
public static final com.boonya.program.lang.EnumDay WED;
public static final com.boonya.program.lang.EnumDay THU;
public static final com.boonya.program.lang.EnumDay FRI;
public static final com.boonya.program.lang.EnumDay SAT;
public static final com.boonya.program.lang.EnumDay SUN;
static {};
public int getValue();
public boolean isFree();
public static com.boonya.program.lang.EnumDay[] values();
public static com.boonya.program.lang.EnumDay valueOf(java.lang.String);
com.boonya.program.lang.EnumDay(java.lang.String, int, int, com.hmw.test.EnumTest);
}
所以，实际上 enum 就是一个 class，只不过 java 编译器帮我们做了语法的解析和编译而已。

>>>总结<<<<

可以把 enum 看成是一个普通的 class，它们都可以定义一些属性和方法，不同之处是：enum 不能使用 extends 关键字继承其他类，因为 enum 已经继承了 java.lang.Enum（java是单一继承）。
*/
public class EnumSummary {

}
