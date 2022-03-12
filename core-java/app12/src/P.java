class P 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
			System.out.println("if block - stmt-1");
			System.out.println("if block - stmt-2");
			System.out.println("if block - stmt-3");
			System.out.println("if block - stmt-4");
		System.out.println("main end: ");
	}
}


/*

here, condition if is false and it is not proper a if block. in this case first SOP will considered as if block statement.
and then from SOP to last SOP that is print same as it is.

output:

main begin
if block - stmt-2
if block - stmt-3
if block - stmt-4
main end:


*/