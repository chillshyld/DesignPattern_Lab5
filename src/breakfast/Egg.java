/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_template;

import java.io.*;

/**
 *
 * @author monradajuycharoen
 */
public abstract class Egg {

    void prepareRecipe(int numOfEggs){
        crackingEggs(numOfEggs);
	stirEggs();
	cook();
	serve();
        if (customerWantSaltPepper()){
            addSaltPepper();
        } 
    }
    	public abstract void stirEggs();
	
	public abstract void cook();
        
    	final public void crackingEggs(int numOfEggs) {
		System.out.println("\n\nCracking " + numOfEggs +  " eggs");
	}

	final public void serve() {
		System.out.println("Putting the eggs on the plate");
	}
        
        void addSaltPepper() {
            System.out.println("Add salt pepper");
        }
        
//        HOOK
        boolean customerWantSaltPepper() {
//            String answer = getUserInput();
//            if (answer.toLowerCase().startsWith("y")) {
//            return true;
//            } else {
//            return false;
//            }
            return true;
        }
        
//        private String getUserInput() {
//            String answer = null;
//            System.out.print("Would you like salt and pepper with your egg (y/n)? ");
//            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//            try {
//              answer = in.readLine();
//            } catch (IOException ioe) {
//              System.err.println("IO error trying to read your answer");
//            }
//            if (answer == null) {
//              return "no";
//            }
//              return answer;
//          }
    
}
