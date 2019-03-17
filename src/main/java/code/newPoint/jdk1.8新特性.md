##1，接口的默认方法和静态方法
1.8之前，每当接口新增一个方法，接口的实现类都需要重写此方法，
**1.8新增接口的默认方法为了解决接口的修改与接口实现类不兼容的问题，作为代码向前兼容的一个方法。**
那么问题来了，java中一个类可以实现接口，多个接口中可能会存在重名的方法，这类冲突如何解决？
###_这种问题会在编译时指出，inherits unrelated defaults for run……必须重写重名的方法_
##2，函数式接口FunctionInterface与lambda表达式
###2.1函数式思想，也就是说函数可以作为另一个函数的参数
**函数式接口，要求接口中有且仅有一个抽象方法，因此经常使用的Runnable，Callable接口就是典型的函数式接口。
可以使用@FunctionalInterface注解，声明一个接口是函数式接口。**

可以使用@FunctionalInterface 进行显示申明。FunctionalInterface中有且只能有一个抽象方法，其他的方法（默认方法，静态方法）无限制
另外，任何被Object实现的方法都不能当作是抽象方法

###2.2 lambda表达式
lambda表达式是函数式编程的核心，lambda表达式即匿名函数，是一段没有函数名的函数体，可以作为参数直接传递给相关的调用者。
lambda表达式极大的增加了Java语言的表达能力。lambda的语法结构为：
(parameters) -> expression
或
(parameters) ->{ statements; }
复制代码


**可选类型声明**：不需要声明参数类型，编译器可以统一识别参数值。


**可选的参数圆括号**：一个参数无需定义圆括号，但多个参数需要定义圆括号。


**可选的大括号**：如果主体包含了一个语句，就不需要使用大括号。


**可选的返回关键字**：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。

##3，方法引用
####3.1什么时候可以使用
当lambda表达式调用了一个已经存在的方法
####3.2使用方式
继续简化lambda写法，可以直接写；
静态方法引用：ClassName::methodName;
实例上的实例方法引用：instanceName::methodName;
超类上的实例方法引用：supper::methodName;
类的实例方法引用：ClassName:methodName;
构造方法引用Class:new;
数组构造方法引用::TypeName[]::new

##4，Stream
Java8中有一种新的数据处理方式，那就是流Stream，结合lambda表达式能够更加简洁高效的处理数据。
Stream使用一种类似于SQL语句从数据库查询数据的直观方式，对数据进行如筛选、排序以及聚合等多种操作。
####4.1什么是Stream
Stream是一个来自数据源的元素队列并支持聚合操作，更像是一个更高版本的Iterator,原始版本的Iterator，只能一个个遍历元素并完成相应操作。而使用Stream，只需要指定什么操作，如“过滤长度大于10的字符串”等操作，Stream会内部遍历并完成指定操作。
Stream中的元素在管道中经过中间操作（intermediate operation）的处理后，最后由最终操作（terminal operation）得到最终的结果。

数据源：是Stream的来源，可以是集合、数组、I/O channel等转换而成的Stream；
基本操作：类似于SQL语句一样的操作，比如filter,map,reduce,find,match,sort等操作。
####4.1.1Stream的流程
获取数据源-->转换成Stream-->执行操作，返回一个新的Stream-->再以新的Stream继续执行操作--->直至最后操作输出最终结果。

##5，Optional
####5.1什么是optional
Optional可以理解成一个数据容器，甚至可以封装null，并且如果值存在调用isPresent()方法会返回true
####5.2创建optional
Optional.empty():通过静态工厂方法Optional.empty，创建一个空的Optional对象；
Optional of(T value):如果value为null的话，立即抛出NullPointerException；
Optional ofNullable(T value)：使用静态工厂方法Optional.ofNullable，你可以创建一个允许null值的Optional对象。
##6，Date/time API的改进
##7，其他改进
##8，

