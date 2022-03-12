/*
		1. same object can be refered by multiple references
		2. one object can have multiple reference variables.
*/

class P 
{
	int y;
	double z;
	public static void main(String[] args)
	{
		P k1 = new P();
		P k2 = k1;
		P k3 = k1;
		P k4 = k2;
		System.out.println(k1.y + ", " + k1.z);
		System.out.println(k2.y + ", " + k2.z);
		System.out.println(k3.y + ", " + k3.z);
		System.out.println(k4.y + ", " + k4.z);
		System.out.println("---------------");
		k2.y = 20;
		k2.z = 1.5;
		System.out.println(k1.y + ", " + k1.z);
		System.out.println(k2.y + ", " + k2.z);
		System.out.println(k3.y + ", " + k3.z);
		System.out.println(k4.y + ", " + k4.z);
	}
}

/*
0, 0.0
0, 0.0
0, 0.0
0, 0.0
---------------
20, 1.5
20, 1.5
20, 1.5
20, 1.5
*/