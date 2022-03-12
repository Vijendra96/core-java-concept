class Z23 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(false && i++ == 1) //false
		{
			i++;
			System.out.println("if stmt1");
			System.out.println("if stmt2");
			System.out.println("if stmt3");
		}
		System.out.println("main end:" + i);  //i = 0
	}
}