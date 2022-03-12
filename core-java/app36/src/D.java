class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 20;
		assert i > 10 : "something went wrong";
		System.out.println("main end");
	}
}


/*

difference between assert and throw
1.	we can enabling and disabling assertion explicitely while throw executing everytime there is no need of enabling 
	and desabling.
2.	throw should be the last statement of the current block while assert statement can be anywhere.
3.	by using throw, we can specify any Exception eventhough any Error, while assert is only for AssertionError.

*/