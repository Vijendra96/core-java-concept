class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(3);
		System.out.println("main end : " );
	}
		static void test(int i)
		{
			System.out.println("test begin : " + i);
			if(i == 1)
			{	
				return;
			}
			i--;
			test(i);
		System.out.println("test end : " + i );
	}
}


/*

main begin
test begin : 3
test begin : 2
test begin : 1
test end : 1
test end : 2
main end :

*/