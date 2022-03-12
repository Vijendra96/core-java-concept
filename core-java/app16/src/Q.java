class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("if");
		}
		else if(true)
		{
			System.out.println("if inside an else");
		}
		else if(true)
		{
			System.out.println("innermost if");
		}
		System.out.println("main end");
	}
}

/*
output:
main begin
if
main end
*/