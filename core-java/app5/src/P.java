class P 
{
	public static void main(String[] args) 
	{	
		int i = 1;
		int j = ++i + i + ++i + i + i++;
		//	  2   2     3   3   3

		System.out.println(i + ", " + j);  // 4, 13
	}
}
