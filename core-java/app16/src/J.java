class J 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("if");
		}
		else if(false)
		{
			System.out.println("if inside an else");
		}
		else
		{
			System.out.println("else for an if inside an else");
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