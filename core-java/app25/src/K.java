class A 
{
	static int i;
	static
	{
		System.out.println("From SIB-A");
	}
}
class K
{
	static
	{
		System.out.println("From SIB-K");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("main end");
	}
}

/*
From SIB-K
main begin
From SIB-A
0
main end
*/