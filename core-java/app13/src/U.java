class U 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("if1 begin");
			if(true)
			{
				System.out.println("if2 begin");
				if(true)
				System.out.println("if3");
				System.out.println("if2 end");
			}
			System.out.println("if1 end");
		}
		System.out.println("main end");
	}
}


/*

output:

main begin
if1 begin
if2 begin
if3 
if2 end
if1 end
main end

*/