package convertidor;
import java.awt.event.*;
import javax.swing.*;
class convertidor extends JFrame implements ActionListener{
	JTextField cosa;
	JButton cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, punto, CE, convertir;

	public convertidor(){
		setLayout(null);
		cosa = new JTextField();
		cosa.setBounds(0,0,300,40);
		add(cosa);

		cero = new JButton("0");
		cero.setBounds(0,260,70,70);
		add(cero);
                cero.addActionListener(this);

		uno = new JButton("1");
		uno.setBounds(140,190,70,70);
		add(uno);
                uno.addActionListener(this);

		dos = new JButton("2");
		dos.setBounds(70,190,70,70);
		add(dos);
                dos.addActionListener(this);

		tres = new JButton("3");
		tres.setBounds(0,190,70,70);
		add(tres);
                tres.addActionListener(this);

		cuatro = new JButton("4");
		cuatro.setBounds(140,120,70,70);
		add(cuatro);
                cuatro.addActionListener(this);

		cinco = new JButton("5");
		cinco.setBounds(70,120,70,70);
		add(cinco);
                cinco.addActionListener(this);

		seis = new JButton("6");
		seis.setBounds(0,120,70,70);
		add(seis);
                seis.addActionListener(this);

		siete = new JButton("7");
		siete.setBounds(140,50,70,70);
		add(siete);
                siete.addActionListener(this);

		ocho = new JButton("8");
		ocho.setBounds(70,50,70,70);
		add(ocho);
                ocho.addActionListener(this);

		nueve = new JButton("9");
		nueve.setBounds(0,50,70,70);
		add(nueve);
                nueve.addActionListener(this);

		punto = new JButton(".");
		punto.setBounds(70,260,70,70);
		add(punto);
                punto.addActionListener(this);

		CE = new JButton("CE");
		CE.setBounds(220,50,80,140);
		add(CE);
		CE.addActionListener(this);

		convertir = new JButton("convertir");
		convertir.setBounds(220,190,80,140);
		add(convertir);
		convertir.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == convertir){
			String oka = cosa.getText();
            		float numero = Float.parseFloat(oka);
            		float resul = numero/19;
            		String resulta = String.valueOf(resul);
            		cosa.setText(resulta);
  		}
                if(e.getSource() == CE){
                    cosa.setText("");
                    punto.setEnabled(true);
                }
                if(e.getSource() == cero){
                    String oka = cosa.getText();
                    cosa.setText(oka + "0");
                }
                if(e.getSource() == uno){
                    String oka = cosa.getText();
                    cosa.setText(oka + "1");
                }
                if(e.getSource() == dos){
                    String oka = cosa.getText();
                    cosa.setText(oka + "2");
                }
                if(e.getSource() == tres){
                    String oka = cosa.getText();
                    cosa.setText(oka + "3");
                }
                if(e.getSource() == cuatro){
                    String oka = cosa.getText();
                    cosa.setText(oka + "4");
                }
                if(e.getSource() == cinco){
                    String oka = cosa.getText();
                    cosa.setText(oka + "5");
                }
                if(e.getSource() == seis){
                    String oka = cosa.getText();
                    cosa.setText(oka + "6");
                }
                if(e.getSource() == siete){
                   String oka = cosa.getText();
                    cosa.setText(oka + "7");
                }
                if(e.getSource() == ocho){
                    String oka = cosa.getText();
                    cosa.setText(oka + "8");
                }
                if(e.getSource() == nueve){
                    String oka = cosa.getText();
                    cosa.setText(oka + "9");
                }
                if(e.getSource() == punto){
                    String oka = cosa.getText();
                    cosa.setText(oka + ".");
                    punto.setEnabled(false);
                }
	}
}