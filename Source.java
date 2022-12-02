import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int option;
		option=sc.nextInt();
		Utility ut=new Utility();
		switch(option) {
		case 1:
		{			
			ut.fahrenheitToCelcius(100);
		}
		break;
	
	case 2:{
		
			ut.getTheLevel(56 25 25);
			break;
		}
default:
	System.out.println("invalid option");
		}
	}
}
