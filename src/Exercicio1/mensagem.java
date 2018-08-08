package Exercicio1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mensagem{
	
	private JLabel jlab;
	private JButton jbtn;
	private JFrame jfrm;
	
	public mensagem(){
		jfrm = new JFrame("Caixa de Mensagem");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300, 80);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlab = new JLabel();
		jbtn = new JButton("Exibir Mensagem");
		jbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent le){
				int response = JOptionPane.showConfirmDialog(jfrm, "Deseja realmente exibir a mensagem?");
				switch (response) {
				case JOptionPane.YES_OPTION:
					JOptionPane.showMessageDialog(jfrm, "Aqui está a mensagem!");
					break;
				case JOptionPane.NO_OPTION:
					JOptionPane.showMessageDialog(jfrm, "Então tabom! kkkk");
					break;
				}
			}
		});
		jfrm.add(jbtn);
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public static void main (String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new mensagem();
			}
		});
	}
}
