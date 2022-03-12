class B 
{
	public static void main(String[] args) 
	{
		int i = 10;
		Integer obj = i; //auto boxing
		int j = obj;	//auto unboxing
		System.out.println(obj);
		System.out.println(j);
	}
}

/*

	from JDK 1.5 onword boxing and auto unboxing are automatic.
	
	Integer obj = i; i = Integer.valueOf(i); compiler will internally generates.
	int j = obj; j = obj.intValue(); compiler will internally generates.

*/