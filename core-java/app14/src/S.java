class S 
{
	public static void main(String[] args) 
	{
		System.out.println("==== main begin ====");
		if(false)
		{
			int i = 0;
			System.out.println("if body");
		}
		else
		{
			System.out.println("else body : " + i);
		}

		System.out.println("==== main end ==== : " + i);
	}
}
