import javax.swing.JOptionPane;


public class AgeChecker {

	public static void main(String[] args) {
		//Prompt the user for information about themselves
		String firstName = JOptionPane.showInputDialog(null, "What is your First name?");	
		String lastName = JOptionPane.showInputDialog(null, "What is your Last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?"));	
			
			
			boolean oldEnough = verifyLegalAge(yearOfBirth);
			String fullName = concatenateNames(firstName, lastName);
			//Statements to verify the age
			if(oldEnough == true) {
				JOptionPane.showMessageDialog(null,  fullName + ". you may proceed with your shopping");
			}
			else {
				JOptionPane.showMessageDialog(null,  fullName + ". you may not proceed with your shopping");
			}
			
			
		}
		//Methods to to check the age (takes an int and returns a boolean)
		public static boolean verifyLegalAge(int yob) {
			boolean legalAgeStatus = (2013-yob) >= 19;
			return legalAgeStatus;
		}
		//Method for concatenate the names(takes 2 strings and returns 1)
		public static String concatenateNames(String fn, String ln) {
			String fullName = fn + " " + ln;
			return fullName; 
		}
	}
