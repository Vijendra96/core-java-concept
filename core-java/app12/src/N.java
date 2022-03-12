class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false);
		{
			System.out.println("if block-1");
			System.out.println("if block-2");
			System.out.println("if block-3");
			System.out.println("if block-4");
		}
		System.out.println("main end: ");
	}
}

/*

in this program condition if is terminating with semicollon(;).
so it will become a ordinary block. there is not going to have any effect on the { and } block. it will print all the statements same as it is. 

output
main begin
if block-1
if block-2
if block-3
if block-4
main end:

*/