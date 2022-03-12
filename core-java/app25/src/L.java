class A 
{
	static int i;
	static
	{
		System.out.println("From SIB-A");
	}
}
class L
{
	static
	{
		System.out.println("From SIB-L");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("-------------");
		System.out.println(A.i);
		System.out.println("-------------");
		System.out.println(A.i);
		System.out.println("---------------");
		System.out.println(A.i);
		System.out.println("main end");
	}
}

/*
From SIB-L
main begin
From SIB-A
0
-------------
0
-------------
0
---------------
0
main end
*/