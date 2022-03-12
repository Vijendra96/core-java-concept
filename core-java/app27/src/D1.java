class D1 
{
	int i; //non-static member
	public static void main(String[] args)
	{
		System.out.println(B.i);
	}
}

/*


B.java:8: error: non-static variable i cannot be referenced from a static context
  System.out.println(B.i);
 ^
 1 error


*/