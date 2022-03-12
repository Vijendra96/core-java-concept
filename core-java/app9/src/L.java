class L
{
	public static void main(String[] args)
	{
	System.out.println("binary value for 723 is " + Integer.toBinaryString(723));
	System.out.println("decimal value for 1011010011 is " + Integer.parseInt("1011010011", 2));
	}
}


/*
	binary
	---------

		723 / 2 = 361 + r1
		361 / 2 = 180 + r1
		180 / 2 = 90 + r0
		90 / 2 = 45 + r0
		45 / 2 = 22 + r1
		22 / 2 = 11 + r0
		11 / 2 = 5 + r1
		 5 / 2 = 2 + r1
		 2 / 2 = 1 + r0
		 1 / 2 = 0 + r1
	binary string for 723 : 1011010011


	decimal
	-------
	1011010011

				(2 power 0) * 1		=	1
				(2 power 1) * 1		=	2		
				(2 power 2) * 0		=	0
				(2 power 3) * 0		=	0
				(2 power 4) * 1		=	16
				(2 power 5) * 0		=	0
				(2 power 6) * 1		=	64
				(2 power 7) * 1		=	128
				(2 power 8) * 0		=	0
				(2 power 9) * 1		=	512
									   ------
									   	723
*/