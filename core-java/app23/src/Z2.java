class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();
		System.out.println("-----------");
		System.out.println("test method output@1 : " + i);
		System.out.println("-----------");
		System.out.println("test method output@2 : " + test());
		System.out.println("-----------");
		int j = i + test();
		System.out.println("-----------");
		System.out.println("test method output@3 : " + j  + test());
		System.out.println("-----------");
		System.out.println("test method output@4 : " + (j  + test()));
		System.out.println("------------");
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
-----------
test method output@1 : 200
-----------
from test
test method output@2 : 200
-----------
from test
-----------
from test
test method output@3 : 400200
-----------
from test
test method output@4 : 600
------------
main end:

*/