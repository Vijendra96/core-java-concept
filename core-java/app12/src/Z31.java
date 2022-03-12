class Z31 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		if(true)
		{
			int i = 0;
			System.out.println("if stmt1");
			System.out.println("if stmt2");
			System.out.println("if stmt3");
			System.out.println("if stmt4");
			i ++;
			i = i + 9;
		}
		System.out.println("main end:" + i);
	}
}


/*
it will give compile time error becouse i is a local variable for if block, we can use it inside the if block.
In the last SOP i is used outside the if block. so it will give a compile time error.
*/