class I 
{
	static int a;
	public static void main(String[] args) 
	{
		int a = 10;
		System.out.println(a);		//10
		System.out.println(I.a);	//0
		a = 100;
		I.a = 20;
		System.out.println(a);		//100
		System.out.println(I.a);	 //20
	}
}
