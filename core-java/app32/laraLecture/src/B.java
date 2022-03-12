class A
{
	private int i;
}
class B
{
	public static void main(String[] args) 
	{ 
		A a1 = new A();
		System.out.println(a1.i);
	}
}

/*
1.  private members cna't use outside the same class.
2.  it is a most restricted one.
*/

/*
B.java:10: error: i has private access in A
                System.out.println(a1.i);
                                     ^
1 error
*/