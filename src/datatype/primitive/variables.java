package datatype.primitive;

public class variables {

	public static void main(String[] args) {
		// TODOAuto-generated method stub
		//numbers
			// whole numbers
		
		byte b = 123;//1 byte
		short s = 2343;//2 bytes
		int x = 1;// 4 bytes
		long l = 234567L;// 8 bytes
		
		//variable declaration
		int i;
		//variable assignment
		i = 52;
		
		//use strong names / camel case
		int ageOfTheDog = 25;
		
		//fractions
		float f = 1.2345654F; // 4 bytes
		double d = 1.1;//8 bytes
		
		//characters
		char a1 = '1';//2 bytes
		char a2 = '2';
		// boolean
		boolean boo = false;//1 bit (1/8 byte)
		
		// chain of characters
		String str = "hello";
		
		System.out.print(str);
		System.out.print(i);
		System.out.print(ageOfTheDog);
		System.out.print(a1);
		System.out.print(boo);
		
		System.out.println(str);
		System.out.println(i);
		System.out.println(ageOfTheDog);
		System.out.println(a1);
		System.out.println(boo);
		
		System.out.println(25 + 85);
		System.out.println(a1+a2);
		
		//arithmetic operators: +, -, /, *, %, ++, --
		
		//assignment operators: =
		// java logic
		//comparison operators: <, >, <=, >=, !=,==
		//logical operators: &&, ||, !
		String st = "my name is \"John\"";
	


// final variable in variable: you cannot reassign a final variable
final int age = 20;
age = 25;
}
}