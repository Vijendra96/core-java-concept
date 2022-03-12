class D 
{
	public static void main(String[] args) 
	{
		String s1 = "ja";
		String s2 = "va";
		String s3 = s1 + s2;
		String s4 = "ja" + s2;
		String s5 = s1 + "va";
		String s6 = "ja" + "va";
		System.out.println(s3 == s4); 
		System.out.println(s3 == s5); 
		System.out.println(s3 == s6); 
		System.out.println(s4 == s5); 
		System.out.println(s4 == s6); 
		System.out.println(s5 == s6); 
	}
}


/*

false
false
false
false
false
false

*/