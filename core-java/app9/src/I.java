class I 
{
	public static void main(String[] args) 
	{
		String s1 = "123";
		String s2 = "10000111";

		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2, 2);

		System.out.println(i);
		System.out.println(j);
	}
}


/*

10000111 = (2 power 0) * 1 = 1
		   (2 power 1) * 1 = 2
		   (2 power 2) * 1 = 4
	           (2 power 3) * 0 = 0
		   (2 power 4) * 0 = 0
		   (2 power 5) * 0 = 0
		   (2 power 6) * 0 = 0
		   (2 power 7) * 1 = 128
		   =======================
							 135

*/