import javax.swing.JOptionPane;
public class LoopFor {
		public static void main(String [] args) {
			String username1, password1, username2, password2;
			int countDown;
		
			username1 = JOptionPane.showInputDialog("Please create a username.");
			password1 = JOptionPane.showInputDialog("Please create a password.");
			
			username2 = JOptionPane.showInputDialog("Please enter your username.");
			password2 = JOptionPane.showInputDialog("Please enter your password.");
			
			for (countDown = 2; countDown >=0; countDown--)
			if (username1.equals(username2) && (password1.equals(password2))) {
				JOptionPane.showMessageDialog(null, "Welcome " + username1); 
				break; }
		
			else {
			JOptionPane.showMessageDialog(null, "Username or password is incorrect. Please try again.");
			username2 = JOptionPane.showInputDialog("Please re-enter your username");
			password2 = JOptionPane.showInputDialog("Please re-enter your password.");
			
			if (countDown==0){
				JOptionPane.showMessageDialog(null, "Please contact your adminstrator to unlock your account."); }
			
			}
			
		
		
		}
}