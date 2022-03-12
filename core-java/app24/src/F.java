class F 
{
	static int i, j;
	public static void main(String[] args) 
	{
		System.out.println(i + ", " + j);
		i = 1;
		j = 2;
		System.out.println(i + ", " + j);
		i = j = 20;
		System.out.println(i + ", " + j);
	}
}
