/*
		1. We can create any number of objects to the same class
		2. non static members are loading for every object 
		3. changes of one object's non static members not effecting (reflecting) to other objects.
*/

class Q
{
	int i;
	public static void main(String[] args)
	{
		L ref1 = new L();
		L ref2 = new L();
		L ref3 = new L();
		System.out.println(ref1.i + ", " + ref2.i + ", " + ref3.i);
		ref1.i = 1;
		ref2.i = 2;
		ref3.i = 3;
		System.out.println(ref1.i + ", " + ref2.i + ", " + ref3.i);
		ref1.i = 4;
		System.out.println(ref1.i + ", " + ref2.i + ", " + ref3.i);
		ref2.i = 5;
		System.out.println(ref1.i + ", " + ref2.i + ", " + ref3.i);
		ref3.i = 6;
		System.out.println(ref1.i + ", " + ref2.i + ", " + ref3.i);
	}
}
/*
0, 0, 0
1, 2, 3
4, 2, 3
4, 5, 3
4, 5, 6
*/