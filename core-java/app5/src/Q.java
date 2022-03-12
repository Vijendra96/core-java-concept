class Q 
{
	public static void main(String[] args) 
	{	
		int i = 1;
		int j = ++i + ++i + ++i + i++ + --i;
		//        2     3     4    4      4

		System.out.println(i+ ", " +j);		//4 , 17
	}
}
