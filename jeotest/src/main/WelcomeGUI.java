package main;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class WelcomeGUI extends JFrame{
	private static final long serialVersionUID = 1L;
		//private JButton startGameButton, clearButton, exitButton;
		private JSlider numTeams;
		private JFrame frame;

		public WelcomeGUI(){
			super("Welcome to Jeopardy");
			frame = new JFrame("Main Frame");
			frame.setSize(800, 825);
		//1 by 5 grid bag
			frame.setBackground(Color.BLUE);
			
			//overall Panel
			JPanel mainPanel = new JPanel();
		    mainPanel.setLayout(new GridBagLayout());
		    mainPanel.setBackground(Color.BLUE);
	
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//first panel- 2 labels
			JPanel topPanel= new JPanel();
			topPanel.setBackground(Color.CYAN);
			topPanel.setLayout(new GridBagLayout());
			GridBagConstraints gb1 = new GridBagConstraints();
			
			JLabel welcome = new JLabel("Welcome to Jeopardy!");
			welcome.setSize(350,100);
			gb1.fill = GridBagConstraints.HORIZONTAL;
			gb1.gridx = 0;
			gb1.gridy= 0;
			gb1.anchor = GridBagConstraints.CENTER;
			gb1.gridwidth = 2;
			topPanel.add(welcome,gb1);
			
			JLabel set = new JLabel("Choose the game file, number of teams, and team names before starting the game.");
			gb1.fill = GridBagConstraints.HORIZONTAL;
			gb1.gridx = 0;
			gb1.gridy= 1;
			gb1.anchor = GridBagConstraints.CENTER;
			gb1.gridwidth = 2;
			topPanel.add(set, gb1);
			
			//new Panel 3 labels & button
			JPanel secondPanel = new JPanel();
			secondPanel.setBackground(Color.BLUE);
			secondPanel.setLayout(new GridBagLayout());
			GridBagConstraints gb2 = new GridBagConstraints();
			
			JLabel enterIn = new JLabel("Please choose a game file");
			gb2.fill = GridBagConstraints.HORIZONTAL;
			gb2.gridx = 0;
			gb2.gridy= 0;
			gb2.anchor = GridBagConstraints.CENTER;
			gb2.gridwidth = 2;
			secondPanel.add(enterIn,gb2);
			
			JButton chooseFile = new JButton("Choose File");
			gb2.fill = GridBagConstraints.HORIZONTAL;
			gb2.gridx = 2;
			gb2.gridy= 0;
			gb2.anchor = GridBagConstraints.CENTER;
			gb2.gridwidth = 2;
			secondPanel.add(chooseFile, gb2);
			
			JLabel fileTxt= new JLabel("TextFile.txt");
			gb2.fill = GridBagConstraints.HORIZONTAL;
			gb2.gridx = 4;
			gb2.gridy= 0;
			//gb2.anchor = GridBagConstraints.CENTER;
			gb2.gridwidth = 2;
			secondPanel.add(fileTxt, gb2);
			
			JLabel teamNum = new JLabel("Please choose the number of teams that will be playing on the slider below");
			gb2.fill = GridBagConstraints.HORIZONTAL;
			gb2.gridx = 0;
			gb2.gridy= 2;
			//gb2.anchor = GridBagConstraints.CENTER;
			gb2.gridwidth = 2;
			secondPanel.add(teamNum,gb2);
			
			//slider
			JPanel slidePanel = new JPanel();
			slidePanel.setLayout(new GridBagLayout());
			GridBagConstraints gb3= new GridBagConstraints();
			gb3.fill = GridBagConstraints.HORIZONTAL;
			gb3.gridx = 0;
			gb3.gridy= 0;
			//gb3.anchor = GridBagConstraints.CENTER;
			gb3.gridwidth = 2;
			numTeams = new JSlider();
			slidePanel.add(numTeams, gb3);
		    
		    //labels & text fields
			JPanel bigPanel = new JPanel();
			bigPanel.setBackground(Color.BLUE);
			bigPanel.setLayout(new GridLayout(2,2));
			JPanel uno = new JPanel();
			uno.setLayout(new GridLayout(2,1));
			JTextArea T1 = new JTextArea("Please Name Team 1:");
			T1.setEditable(false);
			uno.add(T1);
			
			JTextArea name1 = new JTextArea("enter team name");
			name1.setEditable(true);
			uno.add(name1);
			bigPanel.add(uno);
			
			JPanel dos = new JPanel();
			dos.setLayout(new GridLayout(2,1));
			JTextArea T2 = new JTextArea("Please Name Team 2:");
			T2.setEditable(false);
			dos.add(T2);
			
			JTextArea name2 = new JTextArea("enter team name");
			name2.setEditable(true);
			dos.add(name2);
			bigPanel.add(dos);
			
			JPanel tres = new JPanel();
			tres.setLayout(new GridLayout(2,1));
			JTextArea T3 = new JTextArea("Please Name Team 3:");
			T3.setEditable(false);
			tres.add(T3);
			
			JTextArea name3 = new JTextArea("enter team name");
			name3.setEditable(true);
			tres.add(name3);
			bigPanel.add(tres);
			
			JPanel quatro = new JPanel();
			quatro.setLayout(new GridLayout(2,1));
			JTextArea T4 = new JTextArea("Please Name Team 2:");
			T4.setEditable(false);
			quatro.add(T4);
			
			JTextArea name4 = new JTextArea("enter team name");
			name4.setEditable(true);
			quatro.add(name4);
			bigPanel.add(quatro);
			
			//bottom panel
			JPanel bottomPanel = new JPanel(new GridBagLayout());
			bottomPanel.setBackground(Color.BLUE);
			
			GridBagConstraints gbc = new GridBagConstraints();
			
			JButton startGameButton = new JButton("Start Jeopardy");
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.gridx = 0;
			gbc.gridy= 0;
	
			//gbc.anchor = GridBagConstraints.LAST_LINE_START;
			gbc.gridwidth = 2;
			bottomPanel.add(startGameButton, gbc);
			
			JButton clearButton = new JButton("Clear Choices");
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.gridx= 2;
			gbc.gridy = 0;
			gbc.gridwidth = 2;
			bottomPanel.add(clearButton, gbc);
			
			JButton exitButton = new JButton("Exit");
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.gridx= 4;
			gbc.gridy= 0;
			gbc.anchor = GridBagConstraints.LAST_LINE_END;
			gbc.gridwidth = 2;
			bottomPanel.add(exitButton, gbc);
		
			GridBagConstraints gbf= new GridBagConstraints();
			
			gbf.gridx= 0;
			gbf.gridy=0;
			mainPanel.add(topPanel,gbf);
			gbf.gridx= 0;
			gbf.gridy=1;
			mainPanel.add(secondPanel,gbf);
			gbf.gridx= 0;
			gbf.gridy=2;
			mainPanel.add(slidePanel,gbf);
			gbf.gridx= 0;
			gbf.gridy=3;
			mainPanel.add(bigPanel,gbf);
			gbf.gridx= 0;
			gbf.gridy=4;
			mainPanel.add(bottomPanel,gbf);
			
			frame.add(mainPanel);
			frame.setVisible(true);
		
			startGameButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent ae){
					new GamePlayGUI();
					frame.setVisible(false);
				}
			});
			
			clearButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent ae){
					
				}
			});
			
			exitButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
					
				}
			});
			
		}
}
