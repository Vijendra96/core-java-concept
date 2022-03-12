class W 
{
	W()
	{
		this(90);
		System.out.println("W()");
	}
	W(int i)
	{
		this();
		System.out.println("W(90)");
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("-------------");
		W w2 = new W();
	}
}


/*

W.java:5: error: recursive constructor invocation
                this(90);
                ^
1 error

*/