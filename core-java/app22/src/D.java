class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		do
		{
			int i = 1;
			System.out.println("body : " + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end");
	}
}


/*

getting an error becouse of initialization should be outside the do-while body. 
local member of variable can not used in boolean condition.

*/