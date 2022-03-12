class Z33 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(false)
		{
			System.out.println("if stmt1");
			System.out.println("if stmt2");
			System.out.println("if stmt3");
			System.out.println("if stmt4");
			i ++;  
			i = i + 9; 
		}
		System.out.println("main end:" + i); // i = 0
	}
}


