class B
{
	int i = 1;
	B()
	{
		System.out.println("B():" + this.i);
		this.i = 20;
	}
	public static void main(String[] args)
	{
		B ref = new B();
		System.out.println("main:" + ref.i);
	}
}

/*
B(): 1
main: 20
*/