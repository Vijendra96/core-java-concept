abstract class A
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{

}

class M 
{
	public static void main(String[] args) 
	{
		//A a = new A();
		B b = new B();
		System.out.println("Hello World!");
	}
}

//every class have minimum one constructor including abstract class.
//any number of constructor can be develop inside the abstract class.

/*
				A()
				 Hello World!
*/