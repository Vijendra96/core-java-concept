class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test());
		System.out.println("main end: " );
	}
	public static int test() 
	{
		System.out.println("from test ");
		return 200;	
	}
}


/*

main begin
from test
200
main end:

*/