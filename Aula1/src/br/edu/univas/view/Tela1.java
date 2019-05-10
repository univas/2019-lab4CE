package br.edu.univas.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class Tela1 extends JFrame {

	public Tela1() {
		this.setSize(800, 600);
		this.setTitle("Aula 1");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		initialize();
	}
	
	private void initialize() {
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Bem vindo à Univás!!!!");
		this.getContentPane().add(nameLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setColumns(50);
		this.getContentPane().add(nameTextField);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		this.getContentPane().add(saveButton);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setColumns(50);
		this.getContentPane().add(passwordField);
		
		JComboBox<String> opcoes = new JComboBox<>();
		opcoes.addItem("Sistemas de Informação");
		opcoes.addItem("Fisioterapia");
		opcoes.addItem("História");
		opcoes.addItem("Matemática");
		this.getContentPane().add(opcoes);
		
		JRadioButton radioButton = new JRadioButton();
		radioButton.setText("Masculino");
		this.getContentPane().add(radioButton);
		
		JRadioButton radioButton2 = new JRadioButton();
		radioButton2.setText("Feminino");
		this.getContentPane().add(radioButton2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton);
		group.add(radioButton2);
		
		JCheckBox checkbox1 = new JCheckBox();
		checkbox1.setText("Segunda-feira");
		this.getContentPane().add(checkbox1);

		JCheckBox checkbox2 = new JCheckBox();
		checkbox2.setText("Quarta-feira");
		this.getContentPane().add(checkbox2);
		
		JCheckBox checkbox3 = new JCheckBox();
		checkbox3.setText("Sexta-feira");
		this.getContentPane().add(checkbox3);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(50);
		textArea.setRows(10);
		textArea.setLineWrap(true);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		this.getContentPane().add(scrollPane);
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("Janeiro");
		listModel.addElement("Fevereiro");
		listModel.addElement("Março");
		listModel.addElement("Abril");
		
		JList<String> list = new JList<>();
		list.setModel(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scrollList = new JScrollPane(list);
		scrollList.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollList.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		this.getContentPane().add(scrollList);
		
		String[] columnNames = {
				"Nome", "E-mail", "Celular"
		};
		
		Object[][] tableData = {
				{"João", "joao@gmail.com", "98832-6474"},
				{"Maria", "maria@gmail.com", "99958-8715"},
				{"José", "jose@gmail.com", "99974-5522"}
		};
		
		JTable table = new JTable(tableData, columnNames);
		
		JScrollPane scrollTable = new JScrollPane(table);
		scrollTable.setPreferredSize(new Dimension(700, 100));
		scrollTable.setHorizontalScrollBarPolicy(
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollTable.setVerticalScrollBarPolicy(
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.getContentPane().add(scrollTable);
	}
	
}
