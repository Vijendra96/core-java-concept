class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("body : " + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end");
	}
}

/*


the internal execution of "for loop" and "while loop" is same, structure is different from one and another.
while do-while loop is completely different from "for loop" and "while loop", in internel execution and structure as well.

1.	The Java do-while loop is executed at least once because condition is checked after loop body.
2.	you can initialize a variable outside the do-while body. if you initialize a variable inside the do-while body and 
	than will go to use in boolean condition. it will give an comppile time error.
3.	do-while body terminated with the semicollon(;).

*/