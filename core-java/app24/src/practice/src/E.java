class E
{
	static int i = 5, j = 15, k;
	public static void main(String[] args) 
	{
		System.out.println("@a:" + i);  //5
		int i = 20;
		System.out.println("@b:" + i);  //20
		i = 30;
		System.out.println("@c:" + i);  //30
		E.i = 300;
		System.out.println("@d:" + i);  //30
		System.out.println("@e:" + E.i);  //300
	}
}
