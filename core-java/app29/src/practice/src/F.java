class F
{
	int p = 10;
	public static void main(String[] args) 
	{
		F obj1 = new F();
		F obj2 = new F();
		F obj3 = new F();
		F obj4 = new F();
		F obj5 = new F();
		System.out.println(obj1.p);
		System.out.println(obj2.p);
		System.out.println(obj3.p);
		System.out.println(obj4.p);
		System.out.println(obj5.p);
		obj1.p = 20;
		obj2.p = 30;
		obj3.p = 40;
		obj4.p = 50;
		obj5.p = 60;
		System.out.println(obj1.p);
		System.out.println(obj2.p);
		System.out.println(obj3.p);
		System.out.println(obj4.p);
		System.out.println(obj5.p);
	}
}
/*
10
10
10
10
10
20
30
40
50
60
*/