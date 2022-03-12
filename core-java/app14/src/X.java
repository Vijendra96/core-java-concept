class X 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 0;
		if(i++ == 0 && i++ == 1)
		else
		{
			System.out.println("else-block");
			i = i + 10;
		}			
		System.out.println("main end : " + i);
	}
}


/*

if is not a proper way.Means neither if has no opening and closing braces nor if has terminating with the semicollon.


*/