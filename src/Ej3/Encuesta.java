package Ej3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Encuesta extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel selectOstxt;
	private JLabel selectEspecialidadtxt;
	private JTextField inFilm;
	private JButton add_btn;
	private ActionListener al;
	private ButtonGroup osGroup;
	private JRadioButton windowsBtn;
	private JRadioButton linuxBtn;
	private JRadioButton iosBtn;
	private JCheckBox programadorChckBtn;
	private JCheckBox diseñadorGraficoChckBtn;
	private JCheckBox administracionChckBtn;
	private JSlider horas;
	private JLabel horatxt;
	
	
	public Encuesta() {

        setTitle("Encuesta");
        setSize(300, 430);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        
        setContentPane(contentPane);

        selectOstxt = new JLabel("Selecciona un sistema operativo");
        selectOstxt.setBounds(25, 31, 194, 26);
        contentPane.add(selectOstxt);

        windowsBtn = new JRadioButton("Windows");
        windowsBtn.setBounds(25, 60, 194, 26);
        contentPane.add(windowsBtn);
        
        linuxBtn = new JRadioButton("Linux");
        linuxBtn.setBounds(25, 80, 194, 26);
        contentPane.add(linuxBtn);
        
        iosBtn = new JRadioButton("IOs");
        iosBtn.setBounds(25, 100, 194, 26);
        contentPane.add(iosBtn);
        
        osGroup = new ButtonGroup();
        osGroup.add(windowsBtn);
        osGroup.add(linuxBtn);
        osGroup.add(iosBtn);
        
        selectEspecialidadtxt = new JLabel("Selecciona tu especialidad/es");
        selectEspecialidadtxt.setBounds(25, 130, 194, 26);
        contentPane.add(selectEspecialidadtxt);
        
        programadorChckBtn = new JCheckBox("Programación");
        programadorChckBtn.setBounds(25, 150, 194, 26);
        contentPane.add(programadorChckBtn);
        
        diseñadorGraficoChckBtn = new JCheckBox("Diseño gráfico");
        diseñadorGraficoChckBtn.setBounds(25, 170, 194, 26);
        contentPane.add(diseñadorGraficoChckBtn); 
        
        administracionChckBtn = new JCheckBox("Administración");
        administracionChckBtn.setBounds(25, 190, 194, 26);
        contentPane.add(administracionChckBtn);
        
        horas = new JSlider(0, 10, 1);
        horas.setMajorTickSpacing(1);
        horas.setPaintTicks(true);
        horas.setPaintLabels(true);
        horas.setBounds(25, 260, 194, 53);
        contentPane.add(horas);
        
        horatxt = new JLabel("Selecciona las horas de uso del ordenador");
        horatxt.setBounds(25, 223, 249, 37);
        contentPane.add(horatxt);
        
        add_btn = new JButton("Añadir");
        add_btn.setBounds(45, 343, 182, 26);
        contentPane.add(add_btn);
        
        al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame datosFrame;
				JPanel datosContentPane;
				JLabel datosOs;
				JLabel datosEsp;
				JLabel datosHoras;

				if(windowsBtn.isSelected() || linuxBtn.isSelected() || iosBtn.isSelected()) {
					datosFrame = new JFrame("Saludo");
					datosFrame.setSize(300, 250);
					datosFrame.setLocationRelativeTo(null);
					datosFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
					datosFrame.setVisible(true);
					datosFrame.setResizable(false);
					
					datosContentPane = new JPanel();
					datosContentPane.setLayout(null);
			        
					datosFrame.setContentPane(datosContentPane);
					
					
					String osmsg = "Sistema operativo utilizado:";
					
					if(windowsBtn.isSelected()) {
						osmsg+=" Windows";
					} else if(linuxBtn.isSelected()) {
						osmsg+=" Linux";
					} else {
						osmsg+=" IOs";
					}
					
					datosOs = new JLabel(osmsg);
					datosOs.setBounds(50,20,300,26);
					datosFrame.add(datosOs);
					
					String espmsg = "<html>Especialidades seleccionadas:";

					if(programadorChckBtn.isSelected()) {
						espmsg+="<br>- Programador";
					}
					if(diseñadorGraficoChckBtn.isSelected()) {
						espmsg+="<br>- Diseño Gráfico";
					}
					if(administracionChckBtn.isSelected()){
						espmsg+="<br>- Administración";
					}
					espmsg+="<html>";
					
					datosEsp = new JLabel(espmsg);
					datosEsp.setBounds(50,40,200,80);
					datosFrame.add(datosEsp);
					
					datosOs = new JLabel("Horas de uso del ordenador: " +String.valueOf(horas.getValue()));
					datosOs.setBounds(50,130,200,26);
					datosFrame.add(datosOs);
				}
				
				
				
			}
        };
        
        add_btn.addActionListener(al);
        setVisible(true);
	}
}
