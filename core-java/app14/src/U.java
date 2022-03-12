class U 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(true)
		{
			System.out.println("if body");
			i ++;
		}
		else
		{
			System.out.println("else-block");
			i = i + 10;
		}			
		System.out.println("main end : " + i);
	}
}
