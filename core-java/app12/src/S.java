class S
{
	public static void main(String[] args) 
	{
	System.out.println("main begin");
		if(true)
		{
			int i = 10;
			System.out.println("if block - stmt-1");
			System.out.println("if block - stmt-2");
			System.out.println("if block - stmt-3");
			System.out.println("if block - stmt-4");
			i++;
			System.out.println("if block - stmt-5- " + i);
		}

		System.out.println("main end: " + i); // compile time error
	}
}

/*

this program will give "compile time error", becouse i is a local variable for if block, so if and only if we can use i
inside the if block. we can not use i out side the if block

*