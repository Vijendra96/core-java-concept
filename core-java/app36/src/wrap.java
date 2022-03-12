class wrap 
{
	public static void main(String[] args) 
	{
		int i = 10;
		Integer obj = Integer.valueOf(i); //boxing
		int j = obj.intValue(); //unboxing
		System.out.println(j);
		System.out.println(obj);
	}
}
//d1 is a primitive
//d2 is also a primitive
//obj is a reference variable