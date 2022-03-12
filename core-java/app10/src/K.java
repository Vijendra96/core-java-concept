class K 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(70));
		System.out.println(70 << 1);
		System.out.println(70 << 2);
		System.out.println(70 << 3);
		System.out.println(70 >> 1);
		System.out.println(70 >> 2);
		System.out.println(70 >> 3);
	}
}


/*

				70 ===>		   1000110   

				70 << 1		  10001100   ====>  140
				70 << 2		 100011000   ====>  280
				70 << 3		1000110000   ====>  560


				70 >> 1		  0100011   ====>   35
				70 >> 2		  0010001   ====>   17
				70 >> 3		  0001000   ====>    8


*/