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
	private final JLabel lbltxt1 = new JLabel("Hello");
	private final JLabel lbltxt2 = new JLabel("Goodbye");
	private final JButton btnSwap = new JButton("Swap");
	private final JButton btnHide = new JButton("Hide");
	private final JLabel lbltxt3 = new JLabel("Don't Go");
	private final JButton btnColor = new JButton("Color");

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
		lbltxt1.setBounds(147, 22, 130, 29);
		lbltxt1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lbltxt1.setForeground(Color.ORANGE);
		
		contentPane.add(lbltxt1);
		lbltxt2.setForeground(Color.BLUE);
		lbltxt2.setFont(new Font("Stencil", Font.PLAIN, 16));
		lbltxt2.setBounds(147, 63, 90, 29);
		
		contentPane.add(lbltxt2);
		btnSwap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnSwap_actionPerformed(arg0);
			}
		});
		btnSwap.setBounds(173, 164, 89, 23);
		
		contentPane.add(btnSwap);
		btnHide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnHide_actionPerformed(arg0);
			}
		});
		btnHide.setBounds(173, 195, 89, 23);
		
		contentPane.add(btnHide);
		lbltxt3.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lbltxt3.setBounds(157, 104, 61, 16);
		
		contentPane.add(lbltxt3);
		btnColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnColor_actionPerformed(e);
			}
		});
		btnColor.setBounds(160, 222, 117, 29);
		
		contentPane.add(btnColor);
	}
	protected void do_btnSwap_actionPerformed(ActionEvent arg0) {
		
		String txt1 =  lbltxt1.getText();
		String txt2 = lbltxt2.getText();
		lbltxt1.setText(lbltxt3.getText());
		lbltxt2.setText(txt1);
		lbltxt3.setText(txt2);
	}
	protected void do_btnHide_actionPerformed(ActionEvent arg0) {
		if(lbltxt1.isVisible()){
			lbltxt1.setVisible(!lbltxt1.isVisible());
			btnHide.setText("Show");
		}
		else{
			lbltxt1.setVisible(!lbltxt1.isVisible());
			btnHide.setText("Hide");
		}
		
	}
	protected void do_btnColor_actionPerformed(ActionEvent e) {
		Color color1 = lbltxt1.getForeground();
		Color color2 = lbltxt2.getForeground();
		lbltxt1.setForeground(lbltxt3.getForeground());
		lbltxt2.setForeground(color1);
		lbltxt3.setForeground(color2);
	}
}
