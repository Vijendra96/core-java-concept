class A
{
	int i;
	A()
	{
		System.out.println("A():" + this.i);
		this.i = 20;
	}
	public static void main(String[] args)
	{
		A ref1 = new A();
		System.out.println(ref1.i);
		System.out.println("----");
		A ref2 = new A();
		System.out.println(ref2.i);
		System.out.println("----");
	}
}
/*
A(): 0
20
------
A(): 0
20
-----
*/