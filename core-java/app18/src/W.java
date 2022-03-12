class W
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = 100;
		switch(i)
		{
			case 5:
				System.out.println("case 5");
			default:
				System.out.println("i am from default");
				break;
			case 15:
				System.out.println("case 15");
			default:
				System.out.println("i am from default");
				System.out.println("i am from default");
				System.out.println("i am from default");
				System.out.println("i am from default");
				System.out.println("i am from default");
				System.out.println("i am from default");
		}
		System.out.println("main end");
	}
}