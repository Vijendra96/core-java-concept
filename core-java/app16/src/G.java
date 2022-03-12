class G 
{
	public static void main(String[] args) 
	{
		System.out.println("=== main begin ===");
		if(true)
		{
			System.out.println("=== if-1 body ===");
		}
		else if(true)
		{
			System.out.println("=== if-2 body ===");
			System.out.println("=== if-2 body ===");
			System.out.println("=== if-2 body ===");
			System.out.println("=== if-2 body ===");
		}	
		System.out.println("=== main end ===");
	}
}

/*

In this program there is a four type of statement.

1.	the "main begin" and "main end" will be executed without any condition.
2.	the outer if body(System.out.println("=== if-1 body ===");) needed one condition to execute and that is condition should be "true".
3.	to execute else body, there is one condition will be needed and that is if should be "false".
4.	and now to execute if body which is inside the else, there is two conditions would be needed. else should be "false" while if should be "true". 

*/