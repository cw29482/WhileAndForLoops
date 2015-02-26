/**
 * Name: Crystal Wang
 * Date: 2/25/15
 * Purpose: Demonstrate Programming Logic
 * 
 */
import javax.swing.JOptionPane;
public class Login {
	public static void main(String [] args) {
		String username1, password1, username2, password2;//variables

		username1 = JOptionPane.showInputDialog("Please create a username.");
		password1 = JOptionPane.showInputDialog("Please create a password.");
		//here the user inputs are stored as the username1 and password1
		
		username2 = JOptionPane.showInputDialog("Please enter your username.");
		password2 = JOptionPane.showInputDialog("Please enter your password.");
		//the user inputs are stored as username2 and password2
	
		
		if (username1.equals(username2) && (password1.equals(password2))) {
		//comparing the 1st group of username and password with 2nd group to see if identical

		JOptionPane.showMessageDialog(null, "Welcome " + username1 + "!"); //message displayed if identical
		
		} else 
			JOptionPane.showMessageDialog(null, "You have entered the username or password incorrectly. Please try again.");
			//message displayed if not identical

		

			
		}
		
		
		
	}
