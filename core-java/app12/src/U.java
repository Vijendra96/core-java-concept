class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(false)
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

in this program i is a local variable for main method, so we can use i anywhere inside the program. 
here the if condition is false, so if block will not execute.
so the final value of i will 10.

output:
main begin 
main end: 10
*/