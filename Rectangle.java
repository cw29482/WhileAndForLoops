import javax.swing.JOptionPane;
public class Rectangle {
	public static void main(String [] args) {
		String inputLength, inputWidth = "";
		int length, width, area, perimeter;
		
		inputLength = JOptionPane.showInputDialog("Enter the length of the rectangle feet.");
		inputWidth = JOptionPane.showInputDialog("Enter the width of the rectangle in feet.");
		
		length = Integer.parseInt(inputLength); 
		width = Integer.parseInt(inputWidth);
		
		area = length * width;
		perimeter = 2 * length + 2 * width;
		
		JOptionPane.showMessageDialog(null, "The area of your rectangle is " + area + " ft²" + " and the perimeter of your rectangle is " + perimeter + " ft." );
	}

}
