class S 
{
	public static void main(String[] args) 
	{
		char c1, c2, c3 = 'a';
		c1 = c2 ='b';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		c1 = c2 = c3 ='c';
		System.out.println(c3);
		System.out.println(c3);
		System.out.println(c3);
	}
}
