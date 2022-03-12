class X 
{
	X()
	{
		this(90);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
X.java:5: error: constructor X in class X cannot be applied to given types;
                this(90);
                ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
1 error

*/