class C 
{
	public static void main(String[] args) 
	{
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2); // == operator checking the memory location
		System.out.println(s1.equals(s2)); //equals method checking the content
	}
}



/*

false
true

*/