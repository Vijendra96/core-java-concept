class J 
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		System.out.println(s1); //abc
		s1.concat("xyz");  //abcxyz
		System.out.println(s1); //abc
	}
}

//abcxyz not assinging back to s1


/*
abc
abc
*/