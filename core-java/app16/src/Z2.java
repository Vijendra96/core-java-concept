class Z2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if");
		}
		else if(false)
		{
			System.out.println("if inside an else");
		}
		else if(false)
		{
			System.out.println("innermost if");
		}
		else
		{
			System.out.println("innermost else");
		}
		System.out.println("main end");
	}
}

/*
output:
main begin
innermost else
main end
*/