package br.edu.univas.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela1 extends JFrame {

	private JPanel content;
	
	public Tela1() {
		this.setTitle("Aula 3");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
	}
	
	private void initialize() {
		content = new JPanel();
		FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		content.setLayout(flowLayout);
		this.setContentPane(content);

		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome: ");
		content.add(nameLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setColumns(50);
		content.add(nameTextField);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		content.add(saveButton);
	}
	
}
