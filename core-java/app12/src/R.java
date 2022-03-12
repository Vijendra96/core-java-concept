class R 
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
			System.out.println("if block - stmt-5- " + i); // 11
		}

		System.out.println("main end: ");
	}
}


/*

in this program if condition is true so if block will execute.
from SOP-1 to SOP-4 will print same as it is.
but in the line number 13 there is i is increasing by 1 and applying value is 10.
so the line number 14, i will get updated value and that is 11.


output:

main begin
if block - stmt-1
if block - stmt-2
if block - stmt-3
if block - stmt-4
if block - stmt-5- 11
main end:

*/