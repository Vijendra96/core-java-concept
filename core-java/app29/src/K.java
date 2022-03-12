class K 
{
	public static void main(String[] args) 
	{
		K k1 = new K(90);
		System.out.println("done");
	}
}
/*
java:5: error: constructor K in class K cannot be applied to given types;
                K k1 = new K(90);
                       ^
  required: no arguments
  found:    int
  reason: actual and formal argument lists differ in length
1 error
*/