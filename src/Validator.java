import java.util.InputMismatchException;
import java.util.Scanner;

public class Validator {

    public int numCheck(){
    	int num;
    	while(true){
    		try{
    	        Scanner sc = new Scanner(System.in);
    	        System.out.print("Enter radius: ");
    	        num = sc.nextInt();
 
    			if (num <= 0) continue;
    			else break;
    			
    		}catch(InputMismatchException ime){
    			System.out.println("You made an error, enter a correct radius");
    		}
			
		}
		return num;
    }
	public char checkingForYesOrNo(){
		Scanner sc = new Scanner(System.in);
		
		String response = "";
		boolean cont = true;
		while(cont){
			System.out.print("\nContinue to calculate? (y/n): ");
			response = sc.nextLine();
			if(response.length() != 1){
				continue;
			}
			else if (response.toLowerCase().charAt(0) != 'y' && response.toLowerCase().charAt(0) != 'n'){
				continue;
				}
			else{
				break;
			}
		}
		return response.toLowerCase().charAt(0);
	}
	//Breaking while loop if false 
	public boolean loopingAgain(char response){
		if (response == 'y'){
			return true;
		} else{
			return false;
		}
	}
	
	//Closing message
	public void exitting(boolean cont){
		if (cont == false){
			System.out.println(	"\nGoodbye.");
		}
	}
}
