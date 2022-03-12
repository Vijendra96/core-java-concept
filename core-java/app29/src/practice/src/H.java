class H
{
	int p;
	H(int i)
	{
		p = i;
		//we can develop any thing
	}
	public static void main(String[] args)
	{
		H obj1 = new H(1);
		H obj2 = new H(20);
		H obj3 = new H(40);
		H obj4 = new H(200);
		h obj5 = new H(5);
		System.out.println(obj1.p);//1
		System.out.println(obj2.p);//20
		System.out.println(obj3.p);//40
		System.out.println(obj4.p);//200
		System.out.println(obj5.p);//5
		obj1.p = 20;
		obj2.p = 30;
		obj3.p = 40;
		obj4.p = 50;
		obj5.p = 60;
		System.out.println(obj1.p);//20
		System.out.println(obj2.p);//30
		System.out.println(obj3.p);//40
		System.out.println(obj4.p);//50
		System.out.println(obj5.p);//60
	}
}
/*

1. argument constructors are always advisable. we can supply values to the object memebrs while creating an object itself

 */