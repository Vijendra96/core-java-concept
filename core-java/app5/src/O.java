class O 
{
	public static void main(String[] args) 
	{
		int i = 1;
        	int j = ++i + ++i + i + --i + --i;
		//        2     3   3     2     1

		System.out.println(i + ", " + j); // 1,11
		
	}
}
