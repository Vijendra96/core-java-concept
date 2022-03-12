class H 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = i++ + i++ + i++ + i-- + i;
		//      1      2    3     4     3
		System.out.println(i);	//3
		System.out.println(j);	//13
		System.out.println(i + " , " + j);	//3, 13
	}
}
