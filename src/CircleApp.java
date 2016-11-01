import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		
		boolean cont = true;
		do{
			Validator valid = new Validator();
		
			double radius = valid.numCheck();
		
			Circle circle = new Circle(radius);
		
			System.out.println("Circumference: "+circle.getFormattedCircumference());
			System.out.println("Area: "+circle.getFormattedArea());
			
			char response = checkingForYesOrNo();
			cont = translatingAgain(response);
			exitting(cont);
			
		}while(cont);
	}
	
	
	
	public static char checkingForYesOrNo(){
		Scanner sc = new Scanner(System.in);
		
		String response = "";
		boolean cont = true;
		while(cont){
			System.out.print("\nContinue to calculate? (y/n): ");
			response = sc.nextLine();
			if (response.toLowerCase().charAt(0) != 'y' && response.toLowerCase().charAt(0) != 'n'){
				continue;
				}
			else{
				break;
			}
		}
		return response.toLowerCase().charAt(0);
	}
	//Breaking while loop if false 
	public static boolean translatingAgain(char response){
		if (response == 'y'){
			return true;
		} else{
			return false;
		}
	}
	
	//Closing message
	public static void exitting(boolean cont){
		if (cont == false){
			System.out.println(	"\nHave an awesome day!");
		}
	}
}
