class C
{
	C(int i)
	{
	}
	public static void main(String[] args)
	{
		C c1 = new C();
		System.out.println("done");
	}
}
/*
Output:
error: constructor C in class C cannot be applied to given types;
 C c1 = new C();
 ^
 */
