class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 5;
		switch(i)
		{
			case 1:
				System.out.println("case 1");
				System.out.println("case 1");
				System.out.println("case 1");
				break;

			case 3:
				System.out.println("case 3");
				System.out.println("case 3");
				System.out.println("case 3");
				break;

			case 9:
				System.out.println("case 9");
				break;

			case 10:
				int j = 20;
				System.out.println("case 10:" + j);
				j++;
				System.out.println("case 10:" +j);
				break;

				default:
					System.out.println("I am from default");
		}
		System.out.println("main end");
	}
}
