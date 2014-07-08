import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class VentanaEditor extends JFrame implements ActionListener{
	JTextArea textArea;
	JLabel texto, text;
	JPanel panel, zonaBoto;
	JScrollPane scroll;
	JButton boto, botoN, botoC, botoS;
	
	public VentanaEditor(){
		//setLayout(null);
		super.setTitle("Editor");
		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
		setSize(400, 500);
		
		//zonaBoto = new JPanel();//creo la zona on hi posare el boto
		//zonaBoto.setLayout(new BoxLayout(zonaBoto, BoxLayout.X_AXIS));
		botoN = new JButton();//creo el boto
		botoN.setText("N");
		Font lletra = new Font("", Font.BOLD,16);
		botoN.setFont(lletra);
		
		botoC = new JButton();//creo el boto
		botoC.setText("C");
		Font lletraC = new Font("", Font.ITALIC,16);
		botoC.setFont(lletraC);
		
		botoS = new JButton();//creo el boto
		botoS.setText("UnderLine");
		Font lletraS = new Font("", Font.PLAIN,16);
		botoS.setFont(lletraS);
		
		add(botoN);
		add(botoC);
		add(botoS);
		
		botoN.addActionListener(this);
		botoC.addActionListener(this);
		botoS.addActionListener(this);
		
		
		texto = new JLabel("ESCRIU UN TEXT :");
		//on es situa texto 
		texto.setBounds(10, 50, 300, 50);
		add(texto);
		
		
		textArea = new JTextArea();
		
		scroll = new JScrollPane(textArea);	
		//on comença l'area de text:
		scroll.setBounds(10, 80, 380, 360);
		add(scroll);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object opcio = e.getSource();
	
		if(opcio == botoN )
		{
			Font negreta = new Font("", Font.BOLD,16);
			textArea.setFont(negreta);
			
			
		}
		else if (opcio == botoC)
		{
			Font cursiva = new Font("", Font.ITALIC,16);
			textArea.setFont(cursiva);
		}
		else if (opcio == botoS)
		{
			Font subrayado	= new Font("", Font.PLAIN, 15);
			Map textSubrallat = subrayado.getAttributes();
			textSubrallat.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
			textArea.setFont(subrayado.deriveFont(textSubrallat));
		}
		
	}




}
	
	
