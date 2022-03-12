class M 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if block");
			System.out.println("if block");
			System.out.println("if block");
			System.out.println("if block");
		}
		System.out.println("main end: ");
	}
}

/*
inside the if, condition is false, so if block will not going to execute. 

output:

main begun
main end
*/