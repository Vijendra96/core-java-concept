class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("body with begin with " + i);
			if(i == 4)
			{
				break; //loop getting terminated
				i++;
			}
			System.out.println("body end with " + i);
		}
		System.out.println("main end");
	}
}
