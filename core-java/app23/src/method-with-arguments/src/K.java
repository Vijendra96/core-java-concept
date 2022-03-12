class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		int j = test(i++);
		System.out.println("main end : " + i + ", " + j);
	}
	static int test(int i)
	{
		System.out.println("I am from test : " + i );
		return i++ + i;
	}
}


/*

maim begin
I am from test : 0
main end : 1, 1 

*/