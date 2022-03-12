class Person 
{
       String firstName;
          	int age;

          	Person(String firstName, int age)
          	{
                 		this.firstName = firstName;
                 		this.age = age;
          	}

         	public static void main(String[] args) 
          	{
                		Person p1 = new Person("Vijay", 22);
                		Person p2 = new Person("Raghu", 24);
                		Person p3 = new Person("Ravi", 25);
                		System.out.println(p1.firstName + ", " + p1.age);
                		System.out.println(p2.firstName + ", " + p2.age);
                		System.out.println(p3.firstName + ", " + p3.age);
          	}
}

/*

Vijay, 22
Raghu, 24
Ravi, 25


*/