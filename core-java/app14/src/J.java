class J 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(i++ == 0 || i++ == 1)
		{
			i += 5;
		}
		else
		{
			i += 10;
		}
		System.out.println("main end : " + i);
	}
}
