class I 
{
	public static void main(String[] args) 
	{

		System.out.println(Integer.toBinaryString(451));
		System.out.println(Integer.toBinaryString(175));

		System.out.println("===============================");

		System.out.println(451 | 175);
		System.out.println(451 & 175);
		System.out.println(451 ^ 175);
	
		System.out.println("===============================");

		System.out.println(451 << 1);
		System.out.println(451 << 2);
		System.out.println(451 >> 1);
		System.out.println(451 >> 2);

		System.out.println("===============================");

		System.out.println(175 << 1);
		System.out.println(175 << 2);
		System.out.println(175 >> 1);
		System.out.println(175 >> 2);
		

	}
}

/* 

451		:		111000011
175		:		010101111
--------------------------
bitwise or      111101111
bitwise and     010000011
bitwise xor     101101100


==============================

451			:		 111000011
451 << 1	:		1110000110
451 << 2	:	   11100001100
451 >> 1	:		 011100001
451 >> 2	:		 001110000

================================
175			:		  010101111
175 >> 1	:		 0101011110
175 >> 2	:		01010111100
175 >> 1	:		  001010111
175 >> 2	:		  000101011


*/