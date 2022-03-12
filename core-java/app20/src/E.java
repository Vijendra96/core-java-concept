class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] array = {12, 15, 78, 86, 90};
		for(boolean b : array)
		{
		System.out.println(b);
		}
		System.out.println("main end");
	}
}


/*
the output will be compile time error. becouse int type variable can not converted into boolean.
*/