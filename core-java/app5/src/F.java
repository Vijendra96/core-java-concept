class F 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = i++  +   i  +  i++  +  i;
		//      5    +   6  +  6    +  7  = 24
		System.out.println(i);  //7
		System.out.println(j);  //24
	}
}
