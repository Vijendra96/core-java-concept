class Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("test method output " + test());
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
test method output 200
main end:

*/