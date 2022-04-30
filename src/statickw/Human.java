package statickw;

public class Human {

		
		int height;
			static int weight;
			
			//non static method can use both static and non static variables
			
			public void person1() {
				height = 8;
				weight = 180;
				
			}
			// static methods can use only static variables
		public static void person2 () {
			//height = 9;
			weight = 180;
			
	}

		
}
