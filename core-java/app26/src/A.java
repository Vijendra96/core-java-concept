class A 
{
	static int i;
	static int j;
	static
	{
		System.out.println(i);   //direct read
		System.out.println(j);	 //direct read
		System.out.println(A.i);   //indirect read
		System.out.println(A.j);   //indirect read
		i = 1;	//direct write
		j = 1;	//direct write
		A.i = 1;	//indirect write
		A.j = 1;	//indirect write
		test();
	}
	static void test()
	{
		System.out.println(i);   //indirect read
		System.out.println(j);	 //indirect read
		System.out.println(A.i);   //indirect read
		System.out.println(A.j);   //indirect read
		i = 1;	//direct write
		j = 1;	//direct write
		A.i = 1;	//indirect write
		A.j = 1;	//indirect write
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}



/*

1.	taking the value from the variable is read operation.
2.	assigning the value to the variable is write operation.
3.	inside the initializer, you can using the variable directlyis "direct read operation".
4.	and using along with class name  is "indirect read operation".
5.	inside the initializer, in the method whichever way you are using, they all are indirect.
6.	direct read is not allowing before JVM notifying.

*/



