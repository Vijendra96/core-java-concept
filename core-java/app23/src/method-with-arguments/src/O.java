class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		int j = test(i++  + i);
	//  int j = test(1   +  2)  
	//  int j = test(3)  
		System.out.println("main end : " + i + " and " + j); 
	}
	static int test(int i)
	{
		System.out.println("I am from test : " + i); //3
		return i++;
	}
}


/*

main begin
I am from test : 3
main end : 2, 3

*/