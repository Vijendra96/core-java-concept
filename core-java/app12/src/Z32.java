class Z32 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(true)
		{
			System.out.println("if stmt1");
			System.out.println("if stmt2");
			System.out.println("if stmt3");
			System.out.println("if stmt4");
			i ++;  //0
			i = i + 9; // i = 1 + 9 = 10
		}
		System.out.println("main end:" + i); // i = 10
	}
}


