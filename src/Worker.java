import java.io.IOException;
import java.util.Scanner;

public class Worker {
	public static void main(String[] args)throws IOException{
		@SuppressWarnings("unused")
		String activator;
		
		int holder = 0;
		if(holder == 0) {
			//SETUP
			activator = Setup.Activate();
			
			//CORE
			activator = PasswordChecker.Activate();
		}
		String ED = "1";
		String KM = "2";
		String CP = "3";
		String ExitKey = "X";
		for(;;){
			Scanner input = new Scanner(System.in);
			System.out.println("For encryption or decryption press \"" + ED + "\". If you are here to manage keys, press \"" + KM + "\". Press \"" + CP + " \" to change your password. Press " + ExitKey + " to exit.");
			String UserInput = input.nextLine();
			
			if(UserInput.equals(ED)){
				//activator = KeyReader.Activate(); It is now in base
				activator = Base.Activate();
			}
			if(UserInput.equals(KM)){
				activator = AllKey.Activate();
			}
			if(UserInput.equals(CP)){
				activator = CustomPassword.Activate();
			}
			if(UserInput.equalsIgnoreCase(ExitKey)){
				System.out.println("\nProgram Terminated.");
				input.close();
				System.exit(0);
			}
		}
	}
}