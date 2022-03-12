class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(i++ == 11 || i++ == 12) 
		{
			System.out.println("if block - begin = " + i); 
			i++;
			System.out.println("if block - end = " + i); 
			i+=5; 
		}
		System.out.println("main end: " + i);//12
	}
}

/*  

as we seening, there is a Logical OR in side the if. so in th Logical OR, in the both the conditions, there is one condition should be true 
to getting the result "true". if the first condition is true then second condition will not going to check, 
otherwise if the first condition is false then the second condition will check.
let me check the condition in the program, here first condition is false becouse of applying value of i is 10, 
now lets check the second condition, here second condition is also false. then if block will not be executed.
but i is updating.
so in the last SOP i will getting updated value and is 12.

output:
main begin
main end: 12
*/