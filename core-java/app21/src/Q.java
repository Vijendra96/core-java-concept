class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i <= 5)
		{
		System.out.println("while loop begin with :" + i);
		for(int j = 200; j <= 205; j++)
		{
		System.out.println("from inner loop begin with " + i + ", " + j);
		System.out.println("from inner loop end with " + i + ", " + j);
		}
		System.out.println("while loop end :" + i);
		i++;
		}
		System.out.println("main end:" + i);
	}
}
