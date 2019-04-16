package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GuestBook      implements ActionListener         {
	// Create a GUI with tw o buttons. One button reads "Add Name" and the other button reads "View Names". 
	
	JButton addName = new JButton();
	JButton viewName = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		 GuestBook bob = new GuestBook();
		 bob.code();
		
		
		
		
	}
	
	void code (){
		addName.setText(" Add Name ");
		viewName.setText(" view name ");
		addName.addActionListener(this);
		viewName.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ( addName == e.getSource() ) {
			String ad = JOptionPane.showInputDialog(" Enter a name. ");
			names.add(ad);
		}
		if ( viewName == e.getSource() ) {
			for (int i = 0; i < names.size(); i++) {
				JOptionPane.showMessageDialog(null, "Guest #" + names.get(i) + ":  " + viewName);		
			}
		}
				
		
	}
		
		
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
