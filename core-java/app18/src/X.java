class X
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		byte i = 100;
		switch(i)
		{
			case 5:
				System.out.println("case 5");
				break;
			case 15:
				System.out.println("case 15");
				break;
			case 100:
				System.out.println("case 100");
				break;
			case 120:
				System.out.println("case 120");
				break;
			default:
				System.out.println("i am from default");
				System.out.println("i am from default");
				System.out.println("i am from default");
		}
		System.out.println("main end");
	}
}