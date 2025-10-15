
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Day today=Day.WEDNESDAY;
//		System.out.println(today);
//		
//		if(today==today.WEDNESDAY) {
//			System.out.println("Working day");
//		}
//		
//		for(Day day: Day.values())
//			System.out.println(day);
//		
//		System.out.println(Day.MONDAY.ordinal());
		
		Coffee myCoffee=Coffee.MOCHA;
		System.out.println("Thank you for ordering :"+myCoffee);
		System.out.println("your total bill is :"+myCoffee.getPrice());
		
		
	}

}
