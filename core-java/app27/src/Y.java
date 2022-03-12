/*
	1. method can have a return type as a derived data type (class type)
	2. reference variable can be returned to the calling statement.
	3. while calling a method we can supply reference as an input through argument
	4. while calling a method we can get a reference as an output through return statement.
*/


class Y
{
	int i;
	static Y test()
	{
		Y obj = new Y();
		obj.i = 5;
		System.out.println("test:" + obj.i);
		return obj;
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		Y ref = test();
		System.out.println("main end:" + ref.i);
	}
}

/*
main begin
test:5
main end:5
*/