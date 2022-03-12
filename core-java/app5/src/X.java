class X 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = ++i  +  i  +   i++  + i;
		//        6     6      6       7

		System.out.println(i); //7
		System.out.println(j); //25
	}
}
