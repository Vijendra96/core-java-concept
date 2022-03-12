class T
{
	T()
	{
		this();
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
/*
T.java:3: error: recursive constructor invocation
        T()
        ^
1 error
*/

/*
1.	this() ==> treat as this calling statement
	this(90) ==> treat as this calling statement
2.	this calling statement is used to call one constructor from another constructor of the same class. 

	this() ==> its a calling statement to no argument constructor of the same class.
	this(10) ==> its a calling statement to int argument constructor of the same class.
	this(10, 20) ==> its a calling statement to two int argument constructor of the same class.
	this(10, 1.5) ==> its a calling statement to the constructor of the same class which is taking int and double arguments.

3.	by default only one constructor will execute for one object creation.But by using this calling statement we can
	achieve multiple constructors execution.
4.	this calling statement should be as a first statement in the constructor body. should not be after first statement.
5.	this calling statement should not be inside a method body.
6.	we cant achieve recursive/cyclic invocation through this calling statement. if we provide cyclic invocation, 
	then compilation error. 
*/