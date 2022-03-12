class Y 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i++  +  i  +  i++  +  ++i  +  i  +  ++i  +  i++  +  ++i  +  i++  + i;
		//      1       2     2         4     4       5     5         7      7     8

		System.out.println(i);	//8
		System.out.println(j);	//45
	}
}
