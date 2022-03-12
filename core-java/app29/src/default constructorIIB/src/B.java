class B
{
	public static void main(String[] args)
	{
		B b1 = new B(10);
		B b2 = new B(20);
		B b3 = new B(1, 30);
		System.out.println("done");
	}
}
/*
error: constructor B in class B cannot be applied to given types;
 B b1 = new B(10);
 ^
error: constructor B in class B cannot be applied to given types;
 B b2 = new B(20);
 ^
error: constructor B in class B cannot be applied to given types;
 B b3 = new B(1, 30);
 ^
*/