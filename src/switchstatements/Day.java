package switchstatements;

public class Day {

	public static void main(String[] args) {
		String day = "2553";
		switch (day) {
		case "Mon":
			System.out.println("mentoring day");
			break;
		case "Tues":
			System.out.println("review video");
			break;
		case "Wed":
			System.out.println("code lab day");
			break;
		case "Thurs":
			System.out.println("homework day");
			break;
		case "Fri":
			System.out.println("rest day");
			break;
		case "Sat":
			System.out.println("first class");
			break;
		case "Sun":
			System.out.println("second class");
			break;
			default:
				System.out.println("invalid day");
			
		} 

	}

}
