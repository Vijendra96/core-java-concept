class O
{
	O()
	{
		this(90);
		System.out.println("O()");
	}
	O(int i)
	{
		System.out.println("O(int)");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		O ref1 = new O();
		System.out.println("------------");
		O ref2 = new O(20);
		System.out.println("main end");
	}
}
/*
main begin
O(int)
O()
--------
O(int)
main end
*/