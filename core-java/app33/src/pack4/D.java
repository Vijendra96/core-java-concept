package pack4;
import pack3.*;
class D extends A
{
	public static void main(String[] args) 
	{
		D d = new D();
		System.out.println("i from class of pack3 is : " + d.i);
		//System.out.println("done");
		d.test1();
		d.test2();
	}
}
