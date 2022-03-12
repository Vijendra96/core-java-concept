class O 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 20;
		switch(i)
		{
			case 1:
			System.out.println("from case1");
			break;
			case 3:
			System.out.println("from case3");
			System.out.println("from case3");
			break;
			case 7:
			{
			System.out.println("from case7");
			break;
			}
			case 10:
			System.out.println("from case10");
			break;
			default:
				System.out.println("20 is out of range........ ");
		}
		System.out.println("main end");
		
	}
}
