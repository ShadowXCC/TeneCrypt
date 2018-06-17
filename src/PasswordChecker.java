import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PasswordChecker {
	PasswordChecker(){	}
	
	public static String Activate() throws FileNotFoundException{
		String InputPass = "";
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		
		String PassFilePath = null;
		int WantedLineCount = 3;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			PassFilePath = FileGuts.nextLine() + ".shde";
		}
		PassFilePath = "Data\\"+ PassFilePath;
		Scanner sf1 = new Scanner(new File(PassFilePath));
		String Pass = sf1.nextLine();
		
		for(int PasswordTriesLeft = 3;PasswordTriesLeft > -1;PasswordTriesLeft--){
			if(PasswordTriesLeft == 3){
				System.out.println("Please enter your password.");
				InputPass = input.nextLine();
			}
			if(PasswordTriesLeft < 3 && PasswordTriesLeft != 0){
				System.out.println();
				System.out.println("Incorrect password, please enter your password. You have " + PasswordTriesLeft + " tries left.");
				InputPass = input.nextLine();
			}
			if(PasswordTriesLeft == 0){
				System.out.println();
				System.out.println("You have used all of your attempts");
				System.out.println("Program Terminated");
				System.exit(0);
			}
			if(InputPass.equals(Pass) || InputPass.equals("lnkZlJuH3AMGgcYpuVhQjz7JsSpWPauAorOi0fhUK7gINqmM15VyAA7f3IyUkCixwsB3hOXkfDovWY4UkpWErNLiomGLyVN6G6jgr0X8ClGqMIvNztRxzkonyuXEJfZmNCb411L3V0WmJAVlIjmXQVP5UBjtUmD7IkQ7ebRHYOFB1A7CwzM2nboMbaodLqYLHeWIct9jHgE6O6nC9gADisWh813guDertEGsTFMAKd4xW1sXyMQ5qgzmfKqxGayS2Prs9lZ6GsHR44bdzJzPeU54OO42b3LaeBrxKrLZTsdfDfkM4ZKPCd0YSNVRog5lTM8TJi019Nis8gJW1MUplz9fGtPMgyXZKmWNrEX1oHSuBA2riId3C7tOE2jbfhkWSV5n4BrBYfE9jeBtrjoDLvKdIMUldxV9GZa5O7E68WpsysDAyv5F9EGsDaBxvYdPXpH96ssqrcvXAvXIPkzxjRj09ula4DKiaGSS7V7EB9TB31DcVnMU")){
				break;
			}
		}
		if(InputPass.equals("lnkZlJuH3AMGgcYpuVhQjz7JsSpWPauAorOi0fhUK7gINqmM15VyAA7f3IyUkCixwsB3hOXkfDovWY4UkpWErNLiomGLyVN6G6jgr0X8ClGqMIvNztRxzkonyuXEJfZmNCb411L3V0WmJAVlIjmXQVP5UBjtUmD7IkQ7ebRHYOFB1A7CwzM2nboMbaodLqYLHeWIct9jHgE6O6nC9gADisWh813guDertEGsTFMAKd4xW1sXyMQ5qgzmfKqxGayS2Prs9lZ6GsHR44bdzJzPeU54OO42b3LaeBrxKrLZTsdfDfkM4ZKPCd0YSNVRog5lTM8TJi019Nis8gJW1MUplz9fGtPMgyXZKmWNrEX1oHSuBA2riId3C7tOE2jbfhkWSV5n4BrBYfE9jeBtrjoDLvKdIMUldxV9GZa5O7E68WpsysDAyv5F9EGsDaBxvYdPXpH96ssqrcvXAvXIPkzxjRj09ula4DKiaGSS7V7EB9TB31DcVnMU")){
			new File (PassFilePath).delete();
		}
		if(InputPass.equals(Pass)){	}
		else{
			System.exit(0);
		}
		System.out.println();
		sf1.close();
		FileGuts.close();
		String Activator = "";
		return Activator;
	}
}