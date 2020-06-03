package ThreadChat2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientGUI extends JFrame implements Runnable, ActionListener {
	
	DataOutputStream outputStream;
	DataInputStream inputStream;
	String nickname;
	
	JLabel lbl1 = new JLabel("Java Chat");
	JTextArea tArea = new JTextArea();
	JTextField tField = new JTextField();
	JScrollPane scrollPane = new JScrollPane(tArea);
	
	public ChatClientGUI(DataOutputStream outputStream, DataInputStream inputStream, String nickname) {
		this.outputStream = outputStream;
		this.inputStream = inputStream;
		this.nickname = nickname;
		
		setLayout(new BorderLayout());
		// North, South, West, East, Center
		
		lbl1.setFont(new Font("≥™¥ÆΩ∫ƒ˘æÓ", Font.BOLD, 22));
		add("North", lbl1);
		
		tArea.setBackground(Color.yellow);
		tArea.setForeground(Color.blue);
		tArea.setFont(new Font("≥™¥ÆΩ∫ƒ˘æÓ", Font.BOLD, 22));
		tArea.setEditable(false);
		add("Center", scrollPane);
		
		tField.setBackground(Color.white);
		tField.setForeground(Color.black);
		tField.setFont(new Font("≥™¥ÆΩ∫ƒ˘æÓ", Font.BOLD, 25));
		add("South", tField);
		tField.addActionListener(this);
		
		setSize(800, 800);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				setVisible(false); //WindowListner∏¶ √ﬂ∞°«ÿæﬂ ≈¿Â æÀ∏≤ ±‚¥… ªÁøÎ ∞°¥…
			}
		});
		
		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tField) {
			try {
				outputStream.writeUTF(nickname + " --> " + tField.getText());
			} catch (IOException ie) {
				ie.printStackTrace();
			}
			tField.setText("");
		}
		
	}

	@Override
	public void run() {
		try {
			while(true) {
				String strServer = inputStream.readUTF();
				if(strServer == null) {
					tArea.append("\n¡æ∑·");
					return;
				}
				tArea.append("\n"+strServer);
				int endOfTA = tArea.getText().length();
				tArea.setCaretPosition(endOfTA);
			}
		} catch (Exception e) {
			tArea.append("\n"+e);
		}
		
	}

}
