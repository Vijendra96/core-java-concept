/*
1.		how to find out objects count for a perticular class?
ans:	incrementing one unit of static variable inside a IIB
*/
class L
{
	static int count;
	L()
	{
		//code
	}
	L(int i)
	{
		//code
	}
	L(int i, int j)
	{
		//code
	}
	{
		count ++;
	}
	public static void main(String[] args)
	{
		L obj1 = new L();
		L obj2 = new L();
		L obj3 = new L(20);
		L obj4 = new L();
		L obj5 = new L(40);
		L obj6 = new L(40, 50);
		L obj7 = new L();
		L obj8 = new L(4, 56);
		System.out.println(count);
	}
}

/*
8
*/