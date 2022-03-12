/*
		assume reference is poiting to the first object.
		assign another object to an existing reference to remove a reference to the first object.
		one reference cant refer to more than one object.
		a reference can refer to maximum one object. it can be 0 number of objects (or) one number of objects.
*/

class T
{
	int i;
	public static void main(String[] args)
	{
		T t1 = new T();
		System.out.println(t1.i);
		t1.i = 10;
		System.out.println(t1.i);
		t1 = new T();
		System.out.println(t1.i);
		t1.i = 20;
		System.out.println(t1.i);
	}
}
/*
0
10
0
20
*/