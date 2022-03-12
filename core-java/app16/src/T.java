class T 
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
		System.out.println("main end");

	}
}

/*
output:
main begin
main end
*/