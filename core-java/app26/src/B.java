class B 
{
	static int i;
	static int j = i;  //direct read
	static int k = B.i;	//indirect read
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*

Direct read is not allowed before JVM notifying.

*/