package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GamePlayGUI extends JFrame{

	private static final long serialVersionUID = 1L;
	//grid layout for the questions
	public GamePlayGUI(){
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(800, 825);
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.GRAY);
		//mainPanel.setLayout(new GridBagLayout());
		mainPanel.setLayout(new BorderLayout());
		
		JMenuBar menu = new JMenuBar();
		JMenuItem selector = new JMenuItem("Menu");
		selector.addActionListener(new ActionListener(){
			//@Override
			public void actionPerformed(ActionEvent ae){
				//This should keep the same teams and game file but reset the game board.
				JButton restart = new JButton("Restart this game");
				//should navigate back to the start window so new teams and a new game file can be chosen. 
				JButton newG = new JButton("Choose New Game File");
				//should terminate the program 
				JButton exitG = new JButton("Exit Game");
			}
		});
		menu.add(selector);
		setJMenuBar(menu);
		
		//large left side
		JPanel leftPanel= new JPanel();
		leftPanel.setSize(new Dimension(400, 825));
		leftPanel.setLayout(new GridBagLayout());
		
		GridBagConstraints gbl = new GridBagConstraints();
		
		JPanel topLabel = new JPanel();
		topLabel.setBackground(Color.CYAN);
		JLabel jeoLabel = new JLabel("JEOPARDY");
		topLabel.add(jeoLabel);
		
		JPanel cats = new JPanel();
		cats.setLayout(new GridLayout(1,5));
		JLabel c1 = new JLabel("Category 1");
		cats.add(c1);
		JLabel c2 = new JLabel("Category 2");
		cats.add(c2);
		JLabel c3 = new JLabel("Category 3");
		cats.add(c3);
		JLabel c4 = new JLabel("Category 4");
		cats.add(c4);
		JLabel c5 = new JLabel("Category 5");
		cats.add(c5);
		
		
		JPanel questions = new JPanel();
		questions.setLayout(new GridLayout(5,5));
		JButton q1 = new JButton("$100");
		questions.add(q1);
		JButton q12 = new JButton("$100");
		questions.add(q12);
		JButton q13 = new JButton("$100");
		questions.add(q13);
		JButton q14 = new JButton("$100");
		questions.add(q14);
		JButton q15 = new JButton("$100");
		questions.add(q15);
		//row 2
		JButton q2 = new JButton("$200");
		questions.add(q2);
		JButton q21 = new JButton("$200");
		questions.add(q21);
		JButton q22 = new JButton("$200");
		questions.add(q22);
		JButton q23 = new JButton("$200");
		questions.add(q23);
		JButton q24 = new JButton("$200");
		questions.add(q24);
		//row 3
		JButton q3 = new JButton("$300");
		questions.add(q3);
		JButton q31 = new JButton("$300");
		questions.add(q31);
		JButton q32 = new JButton("$300");
		questions.add(q32);
		JButton q33 = new JButton("$300");
		questions.add(q33);
		JButton q34 = new JButton("$300");
		questions.add(q34);
		//row 4
		JButton q4 = new JButton("$400");
		questions.add(q4);
		JButton q41 = new JButton("$400");
		questions.add(q41);
		JButton q42 = new JButton("$400");
		questions.add(q42);
		JButton q43 = new JButton("$400");
		questions.add(q43);
		JButton q44= new JButton("$400");
		questions.add(q44);
		//row5
		JButton q5 = new JButton("$500");
		questions.add(q5);
		JButton q51 = new JButton("$500");
		questions.add(q51);
		JButton q52 = new JButton("$500");
		questions.add(q52);
		JButton q53 = new JButton("$500");
		questions.add(q53);
		JButton q54 = new JButton("$500");
		questions.add(q54);
		
		//question pop up panel
		//implement this unique to each question
		//not fully implemented
		/*
		leftPanel.setVisible(false);
		JPanel q1main = new JPanel();
		JPanel top = new JPanel();
		JLabel teamL = new JLabel("Team");
		JLabel category = new JLabel("Category");
		JLabel money = new JLabel(q1);
		
		top.add(teamL);
		top.add(category);
		top.add(money);
		
		q1main.add(top);
		mainPanel.add(q1main, BorderLayout.WEST);
		*/
		
		gbl.fill = GridBagConstraints.HORIZONTAL;
		gbl.gridx = 0;
		gbl.gridy = 0;
		leftPanel.add(topLabel, gbl);
		gbl.fill = GridBagConstraints.HORIZONTAL;
		gbl.gridx = 0;
		gbl.gridy = 1;
		leftPanel.add(cats, gbl);
		gbl.fill = GridBagConstraints.HORIZONTAL;
		gbl.gridx = 0;
		gbl.gridy = 2;
		
		leftPanel.add(questions, gbl);
		
		//large right size
		JPanel rightPanel = new JPanel();
		rightPanel.setSize(new Dimension(400, 825));
		rightPanel.setLayout(new BorderLayout());
		JPanel topR = new JPanel();
		topR.setBackground(Color.GRAY);
		
		rightPanel.add(topR, BorderLayout.NORTH);
		
		JPanel bottomR = new JPanel();
		bottomR.setBackground(Color.CYAN);
		JLabel prog = new JLabel("Game Progress");
		bottomR.add(prog);
		JLabel updates = new JLabel("Welcome to Jeopardy! The team to go first is ");
		bottomR.add(updates);//, BorderLayout.SOUTH);
		
		rightPanel.add(bottomR, BorderLayout.SOUTH);
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		mainPanel.add(leftPanel, BorderLayout.WEST);
		gbc.gridx = 1;
		gbc.gridy = 0;
		mainPanel.add(rightPanel,BorderLayout.EAST);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
		
		
		//integrate gameplay to activate final jeopardy
		int questionsA = 0;
		if(questionsA == 25){
			leftPanel.setVisible(false);
			JPanel finalJeo = new JPanel();
			finalJeo.setLayout(new GridBagLayout());
			
			
			
			mainPanel.add(finalJeo,BorderLayout.WEST);
		}
		
		
	}

}
