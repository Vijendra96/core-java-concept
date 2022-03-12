class E 
{
	static int i = test1();
	static int j = test2() + test1();
	static 
	{
		System.out.println("SIB1 begin : " + i + ", " + j);
		i += 1; // i = i + 1;
		j += 2; // j = j + 2;
		main(null);
		System.out.println("SIB1 end : " + i + ", " + j);
	}
	
	static 
	{
		System.out.println("SIB2 begin : " + i + ", " + j);
		i += 3; // i = i + 3;
		j += 4; // j = j + 4; 
		main(null);
		System.out.println("SIB2 end : " + i + ", " + j);
	}

	static int test1()
	{
		System.out.println("test1 begin : " + i + ", " + j);
		i += 5; // i = i + 5;
		j += 6; // j = j + 6;
		main(null);
		System.out.println("test1 end : " + i + ", " + j);
		return i + j + 7;
	}
	static int test2()
	{
		System.out.println("test2 begin : " + i + ", " + j);
		i += 8; // i = i + 8;
		j += 9; // i = j + 9;
		main(null);
		System.out.println("test2 end : " + i + ", " + j);
		return i + j + 10;
	}


	public static void main(String[] args) 
	{
		System.out.println("main: " +  i++  +  ", "  +  j++);
		i += j + 11; // i = i + j + 11;
		j += i + 12; // j = j + i + 12;
	}
}


/*

test1 begin : 0, 0
main: 5, 6
test1 end : 24, 43
test2 begin : 74, 43
main: 82, 52
test2 end : 147, 212
test1 begin : 147, 212
main: 152, 218
test1 end : 383, 614
SIB1 begin : 383, 1373
main: 384, 1375
SIB1 end : 1772, 3160
SIB2 begin : 1772, 3160
main: 1775, 3164
SIB2 end : 4952, 8129
main: 4952, 8129

*/