import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		
		boolean cont = true;
		int count = 0;
		
		System.out.println("Welcome to the Circle Tester");
		do{
			Validator valid = new Validator();
		
			double radius = valid.numCheck();
		
			Circle circle = new Circle(radius);
		
			System.out.println("Circumference: "+circle.getFormattedCircumference());
			System.out.println("Area: "+circle.getFormattedArea());
			
			count ++;
			char response = valid.checkingForYesOrNo();
			cont = valid.translatingAgain(response);
			exitting(cont, count);
			
		}while(cont);
	}
	
	//Closing message
	public static void exitting(boolean cont, int i){
		if (cont == false){
			System.out.printf("\nGoodbye! You made %d circles.", i);
		}
	}
}
