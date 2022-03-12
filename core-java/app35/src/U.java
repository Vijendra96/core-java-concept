interface A
{
	void test();
}
interface B
{

}

abstract interface C
{
}

class U 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		System.out.println("done");
	}
}


/*

E:\dec-batch-dev\app35\src>javac -d ../classes U.java
U.java:18: error: A is abstract; cannot be instantiated
                A a1 = new A();
                       ^
U.java:19: error: B is abstract; cannot be instantiated
                B b1 = new B();
                       ^
U.java:20: error: C is abstract; cannot be instantiated
                C c1 = new C();
                       ^
3 errors

*/