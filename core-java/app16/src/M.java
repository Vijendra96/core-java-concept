class M 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if");
		}
		else
		{
			if(false)
			{
				System.out.println("if inside an else");
			}
			else
			{
				System.out.println("else for an if inside an else begin");
				if(true)
				{
					System.out.println("innermost if");
				}
				System.out.println("else for an if inside an else end");
			}
		  }
		  System.out.println("main end");
	}
}

/*

output:
main begin
else for an if inside an else begin
innermost if
else for an if inside an else end
main end

*/