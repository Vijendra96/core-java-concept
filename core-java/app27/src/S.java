/*
		Note:	removing a reference to any object can be done in two diff ways.
				first one is assigning a null to the existing reference.
				null is a keyword. its a default value to all derived datatypes.
				we can assign a null to any class type reference or to any interface type reference.
				we can't use an object from an execution portion (stack) if object doesn't have
				even a single reference variable. This type of objects are called as abandoned (or) dead objects.
				if object having min one reference variable, then its called as a live object.
*/
class S 
{
	int i;
	public static void main(String[] args) 
	{
		S s1 = new S();
		S s2 = s1;
		S s3 = s2;
		S s4 = s1;
		System.out.println(s1.i + ", " + s2.i + ", " + s3.i + ", " + s4.i);
		s1.i = 1;
		System.out.println(s1.i + ", " + s2.i + ", " + s3.i + ", " + s4.i);
		s2.i += 2;
		System.out.println(s1.i + ", " + s2.i + ", " + s3.i + ", " + s4.i);
		s3.i += 3;
		System.out.println(s1.i + ", " + s2.i + ", " + s3.i + ", " + s4.i);
		s4.i += 4;
		System.out.println(s1.i + ", " + s2.i + ", " + s3.i + ", " + s4.i);
		s4 = null;
		System.out.println(s1.i + ", " + s2.i + ", " + s3.i);
		s3 = null;
		System.out.println(s1.i + ", " + s2.i);
		s2 = null;
		System.out.println(s1.i);
		s1 = null;
		System.out.println(s1.i);
		System.out.println("end");
	}
}
/*
0, 0, 0, 0
1, 1, 1, 1
3, 3, 3, 3
6, 6, 6, 6
10, 10, 10, 10
10, 10, 10
10, 10
10
Exception in thread "main" java.lang.NullPointerException: Cannot read field "i" because "<local1>" is null
        at S.main(S.java:35)
*/
