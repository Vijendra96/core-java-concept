class A
{
	private A()
	{

	}
}

class L extends A 
{
	public static void main(String[] args) 
	{ 
		System.out.println("Hello World!");
	}
}



/*

class L constructor having super() statement that is calling class A constructor, so there is a compilation error. 

*/


/*

L.java:9: error: A() has private access in A
class L extends A
^
1 error

*/


