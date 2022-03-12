class J 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i++  +  ++i   +   --i   +  i--   +  i;
			//  1     3         2      2        1

		System.out.println(i + ", " + j);  // 1 , 9
		
	}
}
