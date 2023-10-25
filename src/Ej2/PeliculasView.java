package Ej2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class PeliculasView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel texto;
	private JTextField inFilm;
	private JButton add_btn;
	private JComboBox<String> filmDropDown;
	private JLabel peliculasLabel;
	private ActionListener al;
	
	
	public PeliculasView() {

        setTitle("Peliculas");
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        
        setContentPane(contentPane);

        texto = new JLabel("Introduce una pelicula");
        texto.setBounds(51, 35, 141, 26);
        contentPane.add(texto);
        
        inFilm = new JTextField();
        inFilm.setBounds(25,68,181,26);
        contentPane.add(inFilm);
        
        add_btn = new JButton("Añadir");
        add_btn.setBounds(71, 105, 89, 23);
        contentPane.add(add_btn);
        
        filmDropDown = new JComboBox<String>();
        filmDropDown.setBounds(262, 70, 199, 22);
        contentPane.add(filmDropDown);
        
        peliculasLabel = new JLabel("Peliculas");
        peliculasLabel.setBounds(315, 41, 61, 14);
        contentPane.add(peliculasLabel);
        
        al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(!inFilm.getText().trim().equals("")) {

					filmDropDown.addItem(inFilm.getText().trim());
					inFilm.setText("");
				}
				
				
			}
        };
        
        add_btn.addActionListener(al);
        setVisible(true);
	}
}
