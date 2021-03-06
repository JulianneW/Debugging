/*
 * Julianne Wojdak
 * 28/11/18
 * Debugging and Fixing Errors
 */

package debuggingandfixingerrors;

import javax.swing.*;

/**
 *
 * @author JuWoj8013
 */
public class DebuggingAndFixingErrors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String myInput;
        int numerator = 0, denominator = 0;
        int result = 0;
        
        try{
            //user inputs
            myInput = JOptionPane.showInputDialog("Enter an integer numerater:");
            //crash on non-integer inputs
            numerator = Integer.parseInt(myInput);
            
            myInput = JOptionPane.showInputDialog("Enter an integer denominator:");
            denominator = Integer.parseInt(myInput);
        
        
        //Will crash if denominator == 0
        result = numerator / denominator;
        
        }catch (ArithmeticException ae){
            System.err.println("You cannot have a denominator of 0.");
            System.err.println("Exception: " + ae);
            System.exit(1);
        }catch(NumberFormatException nfe){
            System.err.println("You must enter integers.");
            System.err.println("Exception: " + nfe);
            System.exit(1);
        }
        
        System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
        
        
        
        
        // TODO code application logic here
    }
    
}
