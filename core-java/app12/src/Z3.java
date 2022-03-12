class Z3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(i++ == 10  &&  i++ == 11) 
		{
			System.out.println("if block - begin = " + i);//12 
			i++;
			System.out.println("if block - end = " + i); //13
			i+=5; // i= i + 5 = 18
		}
		System.out.println("main end: " + i);
	}
}


/*  

as we seening, there is a Logical AND in side the if. so in th Logical AND, both the conditions should be true to getting
the result "true". if the first condition is true the second condition will check, And if the first condition is 
false then the second condition will not be checked.
let me check the condition, here first condition is true becouse of applying value of i is 10, now lets check the second 
condition, here second condition is also true becouse of applying value of i is 11. then if block will be executed.
so the result of line number 9 is 12. 
in the line number 10 i is incresing by 1.
so the line number 11, i will 13.
and here line number 12, i will become i = i+5 = 18
and the in the last SOP will be 18.

output:
main begin
if block - begin = 12
if block - end = 13
main end: 18

*/