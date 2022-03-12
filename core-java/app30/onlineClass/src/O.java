class O 
{
	static int i;
	O()
	{ 
		System.out.println("O()");
	}
	O(int x)
	{ 
		System.out.println("O(int)");
	}
	O(int x, int y)
	{ 
		System.out.println("O(int, int)");
	}
	{
		i ++;
	}
	public static void main(String[] args) 
	{
		O obj1 = new O();
		O obj2 = new O();
		O obj3 = new O(30);
		O obj4 = new O(20);
		O obj5 = new O(20, 5);
		O obj6 = new O(20, 200);
		System.out.println(O.i);
	}
}
/*
O()
O()
O(int)
O(int)
O(int, int)
O(int, int)
6
*/