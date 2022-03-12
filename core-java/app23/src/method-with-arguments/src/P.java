class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		int j = test(i++ + i++ + i);
	//  int j = test(1   +  2   + 3)  
	//  int j = test(6)  
		System.out.println("main end : " + i + " and " + j); 
	}
	static int test(int i)
	{
		System.out.println("I am from test : " + i); //6
		return ++i;
	}
}


/*

main begin
I am from test : 6
main end : 3, 7

*/