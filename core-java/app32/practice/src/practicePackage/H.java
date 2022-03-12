package practicePackage;
class A
{
	private int i;
}
class H extends A
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println(a1.i);
	}
}


/*
	even from the sub class also we cant access the private members of a super class
*/


/*

practicePackage\H.java:11: error: i has private access in A
                System.out.println(a1.i);
                                     ^
1 error

*/