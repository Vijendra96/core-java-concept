class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		if(i++ == 11 || i++ == 11) 
		{
			System.out.println("if block - begin = " + i); //12
			i++;
			System.out.println("if block - end = " + i); //13
			i+=5; //18
		}
		System.out.println("main end: " + i);//18
	}
}

/*  

as we seening, there is a Logical OR in side the if. so in the Logical OR, from the both conditions, there is one 
condition should be true to getting the result "true". if the first condition is true then second condition will not 
going to check, otherwise if the first condition is false then the second condition will check.

let me check the condition, here first condition is false becouse of applying value of i is 10, now lets check the second 
condition, here second condition is true becouse applying value of i is 11. then if block will be executed.
so the result of line number 9 i is getting updated value and that is 12. 
in the line number 10 i is increasing by 1.
so the line number 11, i will 13.
and here line number 12, i will become i = i+5 = 18
and the in the last SOP will be 18.

output:
main begin
if block - begin = 12
if block - end = 13
main end: 18

*/