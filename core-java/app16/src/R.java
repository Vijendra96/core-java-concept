class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
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
if inside an else
main end
*/