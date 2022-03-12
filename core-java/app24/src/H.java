class H 
{
	static int i;
	public static void main(String[] args) 
	{
		System.out.println(i); //0
		i = 1;
		System.out.println(i);  //1
		int i = 2;
		System.out.println(H.i);  //1
		H.i = 3;
		System.out.println(i);  //2
		System.out.println(H.i);//3
	}
}
