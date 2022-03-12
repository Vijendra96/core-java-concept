class L 
{
	int i;
	static L test()
	{
		L obj = new L();
		obj.i = 10;
		return obj;
	}
	public static void main(String[] args) 
	{
		L ref = test();
		System.out.println(ref.i);
	}
}
/*

10

*/
/*
	reference can develop in test method eventhough
*/