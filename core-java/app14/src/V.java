class V 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(i++ == 0 && i++ == 1)
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
