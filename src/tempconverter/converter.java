import java.util.Scanner;

public class converter {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); //Must Enter Scanner
int choice2 = 0;

while(choice2 != 2) {
System.out.println("Welcome choose conversion mode");
System.out.println("Pick 1(C-F) or 2(F-C): ");

int choice1 = scanner.nextInt();

if(choice1 == 1) {
System.out.println("Enter temperture Celsius: ");
double celsius = scanner.nextDouble();
double fahrenheit = (celsius * 9/5) +32;
System.out.println("This is C-F: "+ fahrenheit);

}else if (choice1 == 2) {
System.out.println("Enter temperture Fahrenheit: ");
double fahrenheit = scanner.nextDouble();
double celsius = (fahrenheit - 32) + (5/9);
System.out.println("This is F-C: "+ celsius);
}
else {
System.out.println("Invalid input please select 1 or 2");
}

while(choice2 !=2) {

System.out.println("Do you want to convert other temps 1-Yes or 2-No?");

choice2 = scanner.nextInt();

if(choice2 == 1) {
System.out.println("Welcome choose conversion mode");
System.out.println("Pick 1(C-F) or 2(F-C): ");

int choice3 = scanner.nextInt();
if(choice3 == 1) {
System.out.println("Enter temperture Celsius: ");
double celsius = scanner.nextDouble();
double fahrenheit = (celsius * 9/5) +32;
System.out.println("This is C-F: "+ fahrenheit);
}else if(choice3==2) {
System.out.println("Enter temperture Fahrenheit: ");
double fahrenheit = scanner.nextDouble();
double celsius = (fahrenheit - 32) + (5/9);
System.out.println("This is F-C: "+ celsius);
}else {
System.out.println("Invalid input please select 1 or 2");
}

}
if(choice2 == 2) {
System.out.println("Goodbye have a nice day");
}
}

}




}

}