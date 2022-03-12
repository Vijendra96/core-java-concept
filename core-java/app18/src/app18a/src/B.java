class B
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		String s1 = "hello";
		switch(s1)
		{
			case "abc":
				System.out.println("case abc");
				break;
			case "xyz":
				System.out.println("case xyz");
				break;
			case "hello":
				System.out.println("case hello");
				break;
			default:
				System.out.println("i am from default");
		}
		System.out.println("main end");
	}
}