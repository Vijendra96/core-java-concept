class D 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = i--;					//5

		System.out.println("===================");

		System.out.println(i);			//4
		System.out.println(j);			//5
		System.out.println(i);			//4
		System.out.println(j);			//5
		System.out.println(i);			//4
		System.out.println(j);			//5
	}
}
