class H 
{
	int i;
	public static void main(String[] args) 
	{
		H h1 = new H();
		H h2 = new H();
		h1.i = 10;
		System.out.println(h1.i);  //10
		System.out.println(h2.i);	//0
		System.out.println("============");
		h2.i = 30;
		System.out.println(h1.i);	//10
		System.out.println(h2.i);	//30
		System.out.println("============");
		h1.i = h2.i + 20;		//50
		System.out.println(h1.i);	//50
		System.out.println(h2.i);	//30
		System.out.println("============");
	}
}

/*

NOTE :  1.	any number of object can be created to the same class.
		2.	non-static members are object specific.
		3.	for every creation, non-static members are loading into the memory.
		4.	non-static members are loading to the memory for every object creation.

*/