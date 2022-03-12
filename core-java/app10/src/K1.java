class K1
{
	public static void main(String[] args)
	{
		System.out.println(65 << 1); // left shift by 1
		System.out.println(65 << 2); // left shift by 2
		System.out.println(65 >> 1); // right shift by 1
		System.out.println(65 >> 2); // right shift by 2
		System.out.println("============================"); 
		System.out.println(65 >>> 2); // right shift by 2
	}
}






/*

65 : 1000001 (binary)
left shift by 1 : 10000010 = 130
left shift by 2 : 100000100 = 260


65 : 1000001
right shift by 1 : 0100000 = 32
right shift by 2 : 0010000 = 16

*/
