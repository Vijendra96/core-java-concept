class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(true)
		{
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

/*

in this program i is a local variable for main maithod so we can use i anywhere inside the program.
now inside the if, condition is true.
so if block will going to execute.
and now line number 13, i is increasing by 1 and applying value of i is 10.
and line number 14, i will getting updated value of i  and that is 11.

and at the end, last SOP has also i = 11. 

*/