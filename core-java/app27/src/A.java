class A 
{
	int i;  //non-static variable
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}







/*

 error: non-static variable i cannot be referenced from a static context
                System.out.println(i);
                                   ^
*/