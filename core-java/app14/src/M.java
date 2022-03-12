class M 
{
	public static void main(String[] args) 
	{
		System.out.println("====== main begin ======");
		if(false)
		{
			System.out.println("if body");
		}
		else
		{
			int i = 0;
			System.out.println("else ");
			System.out.println("else ");
			System.out.println("else ");
			System.out.println("else : " + i);
			i++;
			System.out.println("else ");
			System.out.println("else : " + i);
		}
		System.out.println("====== main end ======");
	}
}
