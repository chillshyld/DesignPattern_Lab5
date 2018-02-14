package lab5_template;
import java.io.*;


public class ScrambledEggs extends Egg {

	public void stirEggs() {
		System.out.println("Stirring and adding milk to the eggs");
	}
	
	public void cook() {
		System.out.println("Scrambling the eggs.");
	}
        
       boolean customerWantSaltPepper() {
            String answer = getUserInput();
            if (answer.toLowerCase().startsWith("y")) {
            return true;
            } else {
            return false;
            }
        }
        
        private String getUserInput() {
            String answer = null;
            System.out.print("Would you like salt and pepper with your scrambled egg (y/n)? ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try {
              answer = in.readLine();
            } catch (IOException ioe) {
              System.err.println("IO error trying to read your answer");
            }
            if (answer == null) {
              return "no";
            }
              return answer;
          }

}
