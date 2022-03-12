class I 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i++   +   ++i    +   i++  +  i--   +   i;
		    //  1           3        3       4         3

		System.out.println(i+ " , " +j); // 3 , 14
	}
}
