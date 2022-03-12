class X
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(i++ == 10 || i++ == 11) 
		{
			System.out.println("if block - begin = " + i); //11
			
			i++;
			System.out.println("if block - end = " + i); //12
			i+=5; //  i = i+5
		}

		System.out.println("main end: " + i);//17
	}
}

/*  

as we seening, there is a Logical OR in side the if. so in the Logical OR, from the both conditions, there is one 
condition should be true to getting the result "true". if the first condition is true then second condition will not 
going to check, otherwise if the first condition is false then the second condition will check.

let me check the condition, here first condition is true becouse of applying value of i is 10, and then the second condition
is not goind to check but i is updating. if block will execute.
so the result of line number 9 i is getting updated value and that is 11. 
in the line number 10 i is increasing by 1.
so the line number 11, i will 12.
and here line number 12, i will become i = i+5 = 17
and the in the last SOP will be 17.

*/