class U 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();
		System.out.println("main end " + i);
	}
	public static int test() 
	{
		System.out.println("from test end");
		return 10;
	}
}


/*

main begin
from test end
main end 10

*/