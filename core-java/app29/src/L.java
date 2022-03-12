class L 
{
	public static void main(String[] args) 
	{
		L obj1 = new L("abc");
		L obj2 = new L(90);
		L obj3 = new L(9, 30);
		System.out.println("Hello World!");
	}
}

//constructors are not available;
/*
L.java:5: error: constructor L in class L cannot be applied to given types;
                L obj1 = new L("abc");
                         ^
  required: no arguments
  found:    String
  reason: actual and formal argument lists differ in length
L.java:6: error: constructor L in class L cannot be applied to given types;
                L obj2 = new L(90);
                         ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
L.java:7: error: constructor L in class L cannot be applied to given types;
                L obj3 = new L(9, 30);
                         ^
  required: no arguments
  found:    int,int
  reason: actual and formal argument lists differ in length
3 errors
*/