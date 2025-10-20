package Statements;

public class ConditionalStatements {

	public static void main(String[] args) {
//		int hrOfDay= 11;
////		if(hrOfDay<=11)
////			System.out.println("something");
////		else
////			System.out.println("something else");
//		int hourOfDay = 9;
//
//		if (hourOfDay < 15) {
//		    System.out.println("Good Afternoon");
//		} else if (hourOfDay < 11) {
//		    System.out.println("Good Morning"); // 
//		} else {
//		    System.out.println("Good Evening");
//		}
//	//int x =1;
////		if(x) {
////			
////		}  does not compile
//		
////		if (x==3) {
////			  //relational operator -compiles
////		}
////		if (x=3) { //does not compile
////			
////		}
//		
//		int b = 1;
//		int c =1;
//		final int a = b>=10? b++ : c++;
//		System.out.println(b +","+ c);
//	}
//	
		int dayOfWeek = 0;
		switch (dayOfWeek) {
		default:
			System.out.println("weekday");
			break;
		case 0:
			System.out.println("Sunday");
			break; // Fall through effect -- if we donot add break then both sunday monday will be
					// displayed
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		}

	}
}
