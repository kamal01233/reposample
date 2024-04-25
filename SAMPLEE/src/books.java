import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class books {

	private JFrame frame;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					books window = new books();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public books() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 790, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\download.jpg"));
		lblNewLabel.setBounds(110, 269, 272, 218);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\download (1).jpg"));
		lblNewLabel_1.setBounds(384, 269, 258, 218);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("items");
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_4.setBounds(267, 103, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("price");
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblNewLabel_5.setBounds(267, 190, 46, 17);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(461, 187, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("book registraton");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 39));
		lblNewLabel_2.setBounds(210, 4, 370, 88);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "coolleen hoover", "morticia", "addams", "nov 9"}));
		comboBox.setBounds(442, 101, 140, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\pngtree-romantic-beautiful-rose-flower-background-design-picture-image_977440.jpg"));
		lblNewLabel_3.setBounds(-10, 4, 774, 512);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(344, 245, 103, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
