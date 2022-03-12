class O
{
	O()
	{
		super();
		System.out.println("O()");
	}
	O(int i)
	{
		super();
		System.out.println("O()");
		this();
	}
	public static void main(String[] args)
	{
		O obj1 = new O(90);
		System.out.println("Hello World!");
	}
}

/*

O.java:12: error: call to this must be first statement in constructor
                this();
                    ^
1 error

*/