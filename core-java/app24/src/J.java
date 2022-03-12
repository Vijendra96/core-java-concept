class J 
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println(J.a);	//0
		J.a = 20;
		System.out.println(J.a);	//20	
		J.a = 40;
		System.out.println(J.a);	//40
	}
}
