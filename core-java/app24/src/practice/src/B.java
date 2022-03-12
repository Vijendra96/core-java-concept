class B
{
	static int i = 5;
	public static void main(String[] args)
	{
		System.out.println(i);
		i = 20;
		System.out.println(i);
		i = 30;
		System.out.println(i);
		i = 50;
		System.out.println(i++);
		System.out.println(i);
	}
}