package passenger.main;

import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import passenger.database.Database;
import passenger.model.Passenger;



public class MainClassPassenger extends JFrame implements ActionListener {

	public MainClassPassenger() {
		super("Main Frame");
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JButton addVertex = new JButton("Add New Passenger");
		addVertex.addActionListener(this);
		addVertex.setActionCommand("Add");
		JButton viewAll = new JButton("View all Passenger");
		viewAll.addActionListener(this);
		viewAll.setActionCommand("viewall");
		JButton searchVertex = new JButton("Search Passenger");
		searchVertex.addActionListener(this);
		searchVertex.setActionCommand("search");
		panel.add(addVertex);
		panel.add(viewAll);
		panel.add(searchVertex);
		add(panel);

		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) throws SQLException {
		new MainClassPassenger();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getActionCommand().equals("Add")) {
			new AddPassenger(this);
			setVisible(false);
			// dispose();
		
}
}
}
