import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LynchSwapLabelsFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHello = new JLabel("Hello");
	private final JLabel lblGoodbye = new JLabel("Goodbye");
	private final JButton btnSwap = new JButton("Swap");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LynchSwapLabelsFrame frame = new LynchSwapLabelsFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LynchSwapLabelsFrame() {
		jbInit();
		
	}
	private void jbInit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblHello.setBounds(147, 22, 130, 29);
		lblHello.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblHello.setForeground(Color.ORANGE);
		
		contentPane.add(lblHello);
		lblGoodbye.setForeground(Color.BLUE);
		lblGoodbye.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblGoodbye.setBounds(147, 124, 90, 29);
		
		contentPane.add(lblGoodbye);
		btnSwap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnSwap_actionPerformed(arg0);
			}
		});
		btnSwap.setBounds(174, 206, 89, 23);
		
		contentPane.add(btnSwap);
	}
	protected void do_btnSwap_actionPerformed(ActionEvent arg0) {
		
		String hello =  lblHello.getText();
		lblHello.setText(lblGoodbye.getText());
		lblGoodbye.setText(hello);
	}
}
