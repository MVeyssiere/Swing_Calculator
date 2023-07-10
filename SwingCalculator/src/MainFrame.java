import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

	private JTextArea textArea;
	private JButton btn;
	private JPanel buttonPanel, textPanel;
	private Container container;
	public JTextField consol;

	public MainFrame() {
		super("Hello World");

		container = getContentPane();
		container.setLayout(new BorderLayout());

		textPanel = new JPanel();

		consol = new JTextField(25);
		consol.setFont(new Font("Arial", Font.PLAIN, 18));
		consol.setHorizontalAlignment(SwingConstants.RIGHT);
		textPanel.add(consol);

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0, 3));

		buttonPanel.add(new JButton("7"));
		buttonPanel.add(new JButton("8"));
		buttonPanel.add(new JButton("9"));
		buttonPanel.add(new JButton("4"));
		buttonPanel.add(new JButton("5"));
		buttonPanel.add(new JButton("6"));
		buttonPanel.add(new JButton("1"));
		buttonPanel.add(new JButton("2"));
		buttonPanel.add(new JButton("3"));
		buttonPanel.add(new JButton("0"));
		buttonPanel.add(new JButton("."));
		buttonPanel.add(new JButton("="));

		container.add("Center", buttonPanel);
		container.add("North", textPanel);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}