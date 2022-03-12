class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if block");
		}
		else
		{
			int i = 10;
			System.out.println("else block - stmt1 : " + i);
			System.out.println("else block - stmt2");
			System.out.println("else block - stmt3");
			i++;
			System.out.println("else block - stmt4 : " + i);
		}
	    System.out.println("main end : " + i);
	}
}
