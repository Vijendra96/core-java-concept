/*
	1.	We can access the members of an object straight away while creating an object.
		example : System.out.println(new W().i);
		Its a one time usage. we cant use the same object afterwards because of no reference name.
		this way of usage is very rare in the projects.
	 2. If you print object or a reference, then we get a memory address of an object.
*/
Out
class Z1
{
	int i;
	public static void main(String[] args)
	{
		System.out.println(new Z1().i);
		System.out.println(new Z1().i);
		System.out.println(new Z1());
		Z1 ref = new Z1();
		System.out.println(ref.i);
		System.out.println(ref);
	}
}
/*
0
0
Z1@5acf9800
0
Z1@4617c264
*/