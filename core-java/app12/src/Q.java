class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			int i = 10;
			System.out.println("if block - stmt-1");
			System.out.println("if block - stmt-2");
			System.out.println("if block - stmt-3");
			System.out.println("if block - stmt-4");
			i++;
			System.out.println("if block - stmt-5 " + i);
		}

		System.out.println("main end: ");
	}
}

/*

inthis program if condition is false so it is not going to execute.

output:

main begin 
main end:
 
*/
