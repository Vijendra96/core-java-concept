class T
{
	public static void main(String[] args) 
	{
	System.out.println("main begin");
		
		{
			int i = 10;
			System.out.println("if block - stmt-1");
			System.out.println("if block - stmt-2");
			System.out.println("if block - stmt-3");
			System.out.println("if block - stmt-4");
			i++;
			System.out.println("if block - stmt-5- " + i);
		}

		System.out.println("main end: " + i);
	}
}

/* i is a local variable for block {}, so we can use i inside the block {} . we can not use i outside the  block */
/* local members of the any same block if and only if use in the same block */
