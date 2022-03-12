class Z35 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(false);
			System.out.println("if stmt1 : " + i++); // i = 0
			System.out.println("if stmt2 : " + i++); // i = 1
			System.out.println("if stmt3 : " + i++); // i = 2
			System.out.println("if stmt4 : " + i++); // i = 3
			System.out.println("if stmt5 : " + i++); // i = 4
		System.out.println("main end:" + i); // i = 5
	}
}


