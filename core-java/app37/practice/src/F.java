interface F
{
	void test1();
	abstract void test2();
	abstract public void test3();
	public abstract void test4();
	public void test5();
}




/*
	1. every method of an interface is public and an abstract by default.
	2. interface allows only abstract methods in case of non static. Thats why abstract keyword is very optional.
*/