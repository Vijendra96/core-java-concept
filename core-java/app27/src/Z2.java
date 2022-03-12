class Z2 
{
	int i;
	static void test(X obj)
	{
		System.out.println(obj.i);
		obj.i = 20;
	}
	public static void main(String[] args)
	{
		test(new X());
		System.out.println("end");
	}
}

/*
0
end
*/