class J
{
	int p;
	double q;
	J(int p, double q)
	{
		p = p;
		q = q;
		//we can develop any thing
	}
	public static void main(String[] args)
	{
		J obj1 = new J(1, 5.4);
		J obj2 = new J(20, 30.0);
		J obj3 = new J(40, 5.0);
		J obj4 = new J(200, 2.05);
		J obj5 = new J(5, 50.1);
		System.out.println(obj1.p + ", " + obj1.q);//0, 0.0
		System.out.println(obj2.p + ", " + obj2.q);//0, 0.0
		System.out.println(obj3.p + ", " + obj3.q);//0, 0.0
		System.out.println(obj4.p + ", " + obj4.q);//0, 0.0
		System.out.println(obj5.p + ", " + obj5.q);//0, 0.0
		obj1.p = 20;
		obj1.q = 2.0;
		obj2.p = 30;
		obj2.q = 3.0;
		obj3.p = 40;
		obj3.q = 4.0;
		obj4.p = 50;
		obj4.q = 5.0;
		obj5.p = 60;
		obj5.q = 6.0;
		System.out.println(obj1.p + ", " + obj1.q);//20, 2.0
		System.out.println(obj2.p + ", " + obj2.q);//30, 3.0
		System.out.println(obj3.p + ", " + obj3.q);//40, 4.0
		System.out.println(obj4.p + ", " + obj4.q);//50, 5.0 
		System.out.println(obj5.p + ", " + obj5.q);//60, 6.0
	}
}
