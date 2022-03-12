class G 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		switch(i)
		{
			case 1:
				System.out.println("case 1");
				System.out.println("case 1");
				System.out.println("case 1");

			case 3:
				System.out.println("case 3");
				System.out.println("case 3");
				System.out.println("case 3");

			case 9:
				System.out.println("case 9");
				break;

			case 10:
				int j = 20;
				System.out.println("case 10:" + j);
				j++;
				System.out.println("case 10:" +j);
		}
		System.out.println("main end");
	}
}
