class L 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i + i++ + --i + i++ + i++ + ++i;
		    //  1    1      1   1      2      4

		System.out.println(i +", " +j); // 4 , 10
	}
}
