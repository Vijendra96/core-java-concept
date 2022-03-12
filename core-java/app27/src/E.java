class E 
{
	int i;   //non-static variable
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println(e1.i);
	}
}


/*

1.	'new' is a operator it is used for creating an object.
2.	new E(); ===> it is the object creation syntax.
3.	non static members are object members (static members are class members).
4.	whenever object is creating non static member loading into the memory.
5.	without creating an object, you can not use non static member.
6.	object is also called as instance.
7.	non static members are also called instance member.
8.	Stack memory is used for execution perpuse.
9.	Heap memory is used for storage perpuse.
10.	all objects are creating and storing in the heap memory.
11.	e1 is the name of variable with the derieved data type E (class name, class name is also a derieved data type).
12.	e1 is local variable to main method.
13.	e1 is creating whenever main method is executing.
14.	e1 is also called reference variable becouse it is referring an object.
15.	references are creating in stack memory.
16.	objects are creating in heap memory.
17.	e1.i ===> (reference variable.non-static member)
18.	dot(.) is called as access operator.


*/