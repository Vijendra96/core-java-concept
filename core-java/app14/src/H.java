class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(true)
		{
			i =+ 5;
			System.out.println("if block");
		}
		else
		{
			System.out.println("else block - stmt1 : " + i);
			System.out.println("else block - stmt2");
			System.out.println("else block - stmt3");
			i++;
			System.out.println("else block - stmt4 : " + i);
		}
	    System.out.println("main end : " + i);
	}
}
