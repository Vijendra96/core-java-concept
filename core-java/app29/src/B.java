class B 
{
	B()
	{
		System.out.println("I am from constructor");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("--------------");
		B b2 = new B();
		System.out.println("--------------");
		B b3 = new B();
		System.out.println("--------------");
		B b4 = new B();
		System.out.println("--------------");
		B b5 = new B();
		System.out.println("--------------");
	}
}
/*
I am from constructor
--------------
I am from constructor
--------------
I am from constructor
--------------
I am from constructor
--------------
I am from constructor
--------------
*/