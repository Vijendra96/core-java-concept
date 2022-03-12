package practicePackage;

class A
{
	private A()
	{

	}
}

class I extends A
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}

/*

practicePackage\I.java:11: error: A() has private access in A
class I extends A
^
1 error

*/