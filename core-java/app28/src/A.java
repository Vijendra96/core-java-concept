// usage of non static members inside the static method

class A 
{
	void test()
	{
		System.out.println(" from test : " + this);
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("from main : " + a1);
		a1.test();
		//test();
		//A.test();
	}
}

/*

from main : A@452b3a41		//address of the object
from test : A@452b3a41
 
*/

/*

key points :
1.	calling test() by using a1, a1 is going to test method.
2.	a1 is reference variable to main method while "this" is also a reference variable but to test method.
3.	every non-static defination block having "this".
4.	"this" is an optional, if you not write "this" inside the non-static defination, control internally 
	execute the code with "this". keyword. 
5.	by default "this" is available in non-static defination block.
6.	"this" is not having static defination block becouse static members are object members. 

*/