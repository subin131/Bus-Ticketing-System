package passenger.main;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import passenger.database.Database;
import passenger.model.Passenger;


public class AddPassenger extends JFrame implements ActionListener {

	JPanel panel1;
	JLabel idLbl,nameLbl, contLabel, passTypeLbl;
	JTextField id, name, contact, passType;
	JButton add, cancel;
	Database db;
	MainClassPassenger obj;

	public AddPassenger(MainClassPassenger obj) {

		super("Add New Passenger");
		this.obj = obj;
		try {
			db = new Database();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initializeAll();
		pack();
		setVisible(true);

	}

	public void initializeAll() {
		// TODO Auto-generated method stub
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5, 3));
		
        idLbl=new JLabel ("ID: ");
        panel1.add(idLbl);
        id=new JTextField(10);
        panel1.add(id);
        
		nameLbl = new JLabel("Name: ");
		panel1.add(nameLbl);
		name = new JTextField(10);
		panel1.add(name);

		contLabel = new JLabel("Contact: ");
		panel1.add(contLabel);
		passType = new JTextField(10);
		panel1.add(passType);

		passTypeLbl = new JLabel("Passanger Type: ");
		panel1.add(passTypeLbl);
		passType = new JTextField(10);
		panel1.add(passType);

		add = new JButton("Add");
		add.addActionListener(this);
		panel1.add(add);

		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		panel1.add(cancel);

		add(panel1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(add)) {
			int i=parseInt(id.getText());
			String n = name.getText();
			int c=parseInt(contact.getText());
			String pt = passType.getText();
			Passenger p = new Passenger( i, n, c, pt);
			try {
				db.addPassenger(p);
				JOptionPane.showMessageDialog(null, "Passenger has been successfully added");
				setVisible(false);
				db.close();
				obj.setVisible(true);
				dispose();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (e.getSource().equals(cancel)) {
			setVisible(false);
			obj.setVisible(true);
			db.close();
			dispose();
		}
	}
	
	private int parseInt(String text) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("closing connection");
		db.close();
	}

}
