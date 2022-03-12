class A 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = 5;
		System.out.println(i++);//0
		System.out.println(i);//1
		System.out.println(i);//1
		System.out.println(i);//1
		System.out.println("---------");
		System.out.println(j--);//5
		System.out.println(j--);//4
		System.out.println(j--);//3
		System.out.println(j--);//2
		System.out.println(j--);//1
	}
}
