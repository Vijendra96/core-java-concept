interface H
{
	H()
	{
	}

	void test1()
	{
	}

	{
	}

	static
	{
	}
}
/*
1. construcor not allowed in the interface.
2. IIB not allowed in the interface.
3. SIB not allowed in the interface.
4. non static method with an implementation not allowed in the interface.
5. interface can have only constants and an abstract methods. no concrete member (with a defination) allowed in an interface.
6. But in JDK1.8 new features introduced to an interface.
	1. defined static methods can be incorporated.
	2. defined non static with default methods can be incorporated.

*/
