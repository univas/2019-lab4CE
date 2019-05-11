package br.edu.univas.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela2 extends JFrame {

	private JPanel content;
	
	public Tela2() {
		this.setTitle("Aula 3");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		initialize();
	}
	
	private void initialize() {
		content = new JPanel();
		BorderLayout border = new BorderLayout();
		content.setLayout(border);
		this.setContentPane(content);
		
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.BLUE);
		northPanel.setPreferredSize(new Dimension(0, 100));
		content.add(northPanel, BorderLayout.NORTH);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.GRAY);
		eastPanel.setPreferredSize(new Dimension(50, 200));
		content.add(eastPanel, BorderLayout.EAST);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.GREEN);
		centerPanel.setPreferredSize(new Dimension(450, 300));
		content.add(centerPanel, BorderLayout.CENTER);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.RED);
		westPanel.setPreferredSize(new Dimension(50, 300));
		content.add(westPanel, BorderLayout.WEST);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.YELLOW);
		southPanel.setPreferredSize(new Dimension(0, 100));
		content.add(southPanel, BorderLayout.SOUTH);
	}
	
}
