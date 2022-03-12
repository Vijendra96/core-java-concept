class S 
{
	S()
	{
		System.out.println("S()");
	}
	S(int i)
	{
		this(9, 8);
		System.out.println("S(int)");
	}
	S(int i, int j)
	{
		System.out.println("S(int, int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		S s1 = new S();
		System.out.println("----------");
		S s2 = new S(20);
		System.out.println("----------");
		S s3 = new S(20, 30);
		System.out.println("----------");
		System.out.println("main end");
	}
}
/*
main begin
S()
----------
S(int, int)
S(int)
----------
S(int, int)
----------
main end*/