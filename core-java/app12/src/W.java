class W
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(i++ == 10)
		{
			System.out.println("if block - stmt-1");
			System.out.println("if block - stmt-2");
			System.out.println("if block - stmt-3");
			System.out.println("if block - stmt-4");
			i++;
			System.out.println("if block - stmt-5- " + i);//12
		}

		System.out.println("main end: " + i);//12
	}
}

/*

in this program i is a local variable for main maithod so we can use i anywhere inside the program.
now inside the if, condition is comparing with i, and the condition is true becouse of applying value of i is 10.
so if block will going to execute. and i will update. from line number 9 to 12, statements will print sane as it is.
and now line number 13, i is increasing by 1 and applying value of i is 11.
and line number 14, i will getting updated value of i  and that is 12.

and at the end, last SOP has also i = 12. 

*/