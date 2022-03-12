class Z25 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(i++ == 0 && ++i == i++) //true
		 // 0     0      2      2
		{
			i++;
			System.out.println("if stmt1");
			System.out.println("if stmt2");
			System.out.println("if stmt3");
		}
		System.out.println("main end:" + i);  //i = 4
	}
}