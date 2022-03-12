class A 
{
	public static void main(String[] args) 
	{
		int i = 10;
		Integer obj = Integer.valueOf(i); //boxing
		int j = obj.intValue();	//unboxing
		System.out.println(obj);
		System.out.println(j);
	}
}
