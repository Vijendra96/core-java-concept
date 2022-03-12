package practicePackage;
class A
{
	private int i = 5;
}
class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a = new A();
		System.out.println(a.i);
		System.out.println("main end");
	}
}



/*

		practicePackage\D.java:12: error: i has private access in A
						System.out.println(a.i);
											^
		1 error

*/