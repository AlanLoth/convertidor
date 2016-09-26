package convertidor;
import java.awt.event.*;
import javax.swing.*;
class cosa{
	public static void main (String args[]){
		convertidor cvtd = new convertidor();
		cvtd.setBounds(100, 100, 750, 750);
		cvtd.setResizable(false);
		cvtd.setVisible(true);
                cvtd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}