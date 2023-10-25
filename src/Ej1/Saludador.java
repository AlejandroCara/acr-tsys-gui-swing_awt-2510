package Ej1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Saludador extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel texto;
	private JTextField inName;
	private JButton saluda_btn;
	private ActionListener al;
	
	
	public Saludador() {

        setTitle("Saludador");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        
        setContentPane(contentPane);

        texto = new JLabel("Introduce un nombre al que saludar");
        texto.setBounds(100, 35, 181, 26);
        contentPane.add(texto);
        
        inName = new JTextField();
        inName.setBounds(100,68,181,26);
        contentPane.add(inName);
        
        saluda_btn = new JButton("Saludar!");
        saluda_btn.setBounds(148, 111, 89, 23);
        contentPane.add(saluda_btn);
        
        al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame saludarFrame;
				JPanel saludarContentPane;
				JLabel saludoText;

				if(!inName.getText().trim().equals("")) {
					saludarFrame = new JFrame("Saludo");
					saludarFrame.setSize(250, 100);
					saludarFrame.setLocationRelativeTo(null);
					saludarFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					saludarFrame.setVisible(true);
					saludarFrame.setResizable(false);
					
					saludarContentPane = new JPanel();
					saludarContentPane.setLayout(null);
			        
					saludarFrame.setContentPane(saludarContentPane);

					saludoText = new JLabel("Hola " + inName.getText() + "!");
					saludoText.setBounds(50,20,100,26);
					saludarContentPane.add(saludoText);
				}
				
				
			}
        };
        
        saluda_btn.addActionListener(al);
	}

}
