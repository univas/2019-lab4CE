package br.edu.univas.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela1 extends JFrame {

	private JTextField nameText;
	
	public Tela1() {
		this.setTitle("Aula 2");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		initialize();
	}
	
	private void initialize() {
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome: ");
		this.getContentPane().add(nameLabel);
		
		nameText = new JTextField();
		nameText.setColumns(40);
		this.getContentPane().add(nameText);
		
		JButton button = new JButton();
		button.setText("Salvar");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(nameText.getText());
			}
		});
		this.getContentPane().add(button);
	}
	
}
