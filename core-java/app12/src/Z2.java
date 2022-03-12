class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(i++ == 10  &&  i++ == 12) 
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

as we seening, there is a Logical AND in side the if. so in th Logical AND, both the conditions should be true to getting
the result "true". if the first condition is true the second condition will check, otherwise if the first condition is 
false then the second condition will not check.
let me check the condition, here first condition is true becouse of applying value of i is 10, now lets check the second 
condition, here second condition false. in this condition if block will not be executed. but the i valuse will update.

and in the last SOP i is getting updated value and is 12.

output:
main begin
main end: 12

*/