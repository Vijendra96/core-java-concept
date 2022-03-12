class K
{
	public static void main(String[] args)
	{
		int i = 125;
		String s1 = "1111101";
		System.out.println("binary format for " + i + " is " + Integer.toBinaryString(i));
		System.out.println("decimal format for " + s1 + " is " + Integer.parseInt(s1, 2));
	}
}
