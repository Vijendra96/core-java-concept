class B 
{
	public static void main(String[] args) 
	{
		String s1 = "abc"; // storing into the string content pool
		String s2 = new String("abc"); //storing outside the string content pool
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}


/*
		false
		true
*/
