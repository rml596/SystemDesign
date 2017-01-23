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

public class FlashingLabel extends JFrame {

	private JPanel contentPane;
	private final JLabel lblHello = new JLabel("Hello");
	private final JLabel lblWorld = new JLabel("World");
	private final JButton btnFancy = new JButton("Fancy");
	private final JButton btnFancier = new JButton("Fancier");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlashingLabel frame = new FlashingLabel();
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
	public FlashingLabel() {
		jbInit();
	}
	private void jbInit() {
		setTitle("LynchFlashingLabel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblHello.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHello.setForeground(Color.ORANGE);
		lblHello.setBounds(179, 24, 65, 31);
		
		contentPane.add(lblHello);
		lblWorld.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblWorld.setForeground(Color.MAGENTA);
		lblWorld.setBounds(179, 66, 109, 31);
		lblWorld.setVisible(false);
		
		contentPane.add(lblWorld);
		btnFancy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnFancy_actionPerformed(e);
			}
		});
		btnFancy.setBounds(57, 175, 89, 23);
		
		contentPane.add(btnFancy);
		btnFancier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnFancier_actionPerformed(e);
			}
		});
		btnFancier.setBounds(257, 175, 89, 23);
		
		contentPane.add(btnFancier);
	}
	protected void do_btnFancy_actionPerformed(ActionEvent e) {
		lblHello.setVisible(!lblHello.isVisible());
	}
	protected void do_btnFancier_actionPerformed(ActionEvent e) {
		lblWorld.setVisible(!lblWorld.isVisible());
		lblHello.setVisible(!lblHello.isVisible());
	}
}
