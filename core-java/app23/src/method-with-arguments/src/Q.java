class Q
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		int j = test(i++ + ++i + i) + i++ + i;
	//  int j = test(1   +  3  + 3) + 3   + 4; 
	//  int j = test(7)  + 7
	//  int j = 24  + 7;
	//  int j = 31;
		System.out.println("main end : " + i + " and " + j); 
	}
	static int test(int i)
	{
		System.out.println("I am from test : " + i); //7
		return i++ + i++ + i;
	//	return  7  + 8   + 9;
	//	return  24;
	}
}


/*

main begin
I am from test : 7
main end : 4, 31

*/