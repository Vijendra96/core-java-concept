class D 
{
	static int i = 5;
	static int j = 15;
	static int k;
	public static void main(String[] args) 
	{
		System.out.println(i + ", " + j + ", " + k);
		i = 10;
		j = 20;
		k = i + j + 120;
		System.out.println(i + ", " + j + ", " + k);
		i = j = k = 1200;
		System.out.println(i + ", " + j + ", " + k);
	}
}
