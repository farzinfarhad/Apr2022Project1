package classobjectconstructor;

public class House {
	
	//variables
	int address;
	String houseName;
	private char unit;
	
	//constructors
	//built constructors 
	public House(String myHouseName){
		houseName = myHouseName;
	}
	
	House(String myHouseName, int myAddress){
		houseName = myHouseName;
		address = myAddress;
	}
	
	//default constructor
	public House(){
		
	}
	public void method1 (int address) {
		this.address = 52;
		address = 20;
	}
	public void method2 (int address) {
		
		this.address = 100;
		address = 500;
	}
	//methods
	void kitchen() {
		System.out.println("miam miam eat the whole day");
	}
	
	public void room() {
		System.out.println("sleep zzzzzzzzzzzzzzzzzzzzzz");
	}
	
	void bathRoom() {
		System.out.println("shower shower lalalalalala");
	}

}


