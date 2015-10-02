/* Canvas.java Version 1
 * Created by: Joshua Byers
 * Last edited: 10/1/15 at around 7:09
 */

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import javax.swing.*;

public class Canvas {
	public static JFrame
		window = new JFrame("Canvas");
	
	public static JButton 
		home = new JButton("Home"),
		assignments = new JButton("Assignments"),
		discuss = new JButton("Discussions"),
		files = new JButton("Files");
	
	public static JPanel
		SELECT = new JPanel(),
		HOME = new JPanel(),
		ASSIGNMENTS = new JPanel(),
		DISCUSS = new JPanel(),
		FILES = new JPanel();
	
	public static JComboBox<String>
		classes = new JComboBox<String>();
	
	public static void main(String[] args)
	{
		
		String
			L1 = "https://knoxschools.instructure.com/courses/455770",
			L2 = "https://knoxschools.instructure.com/courses/455931",
			L3 = "https://knoxschools.instructure.com/courses/455515",
			L4 = "https://knoxschools.instructure.com/courses/456288",
			N1 = "https://knoxschools.instructure.com/courses/456378",
			N2 = "https://knoxschools.instructure.com/courses/456050",
			N3 = "https://knoxschools.instructure.com/courses/457831",
			N4 = "https://knoxschools.instructure.com/courses/455931",
			def = "https://google.com",
			assignmentExt = "/assignments",
			discussExt = "/discussion_topics",
			filesExt = "/files";
		String[] buttons = {"L1: English IV CP", "L2: SOSE", "L3: AP Computer Principles", "L4: Astronomy", "N1: Driver's Ed", "N2: Honors Pre-Cal", "N3: Personal Finance", "N4: Design Thinking IV"};
		
		for (int x = 0; x < buttons.length; x++) {
			classes.addItem(buttons[x]);
		}//for x < buttons.length
		window.add(SELECT);
		window.add(HOME);
		window.add(ASSIGNMENTS);
		window.add(DISCUSS);
		window.add(FILES);
		window.pack();
		window.setSize(275, 225);
		window.setVisible(true);
		window.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		SELECT.add(classes);
		
		HOME.add(home);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chosenClass = (String) classes.getSelectedItem();
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement	
				}//L1
					
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L2
				
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L3
				
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N3
				
				else if ("N4: Design Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//if that goes to the home page of the selected class.
			}//actionPerformed
		});//addActionListener
		
		ASSIGNMENTS.add(assignments);
		assignments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chosenClass = (String) classes.getSelectedItem();
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement	
				}//L1
					
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement	
				} //L2
					
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement	
				}//L3
					
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N3
				
				else if ("N4: Design Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//if that goes to the assignment page of the selected class.
			}//actionPerformed
		});//addActionListener
		
		DISCUSS.add(discuss);
		discuss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chosenClass = (String) classes.getSelectedItem();
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L1
				
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L2
				
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L3
				
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N3
				
				else if ("N4: Design Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//if that goes to the discussion page of the selected class.
			}//actionPerformed
		});//addActionListener
		
		FILES.add(files);
		files.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chosenClass = (String) classes.getSelectedItem();
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L1
				
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L2
				
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L3
				
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N3
				
				else if ("N4: Design Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//if that goes to the files page of the selected class.
			}//actionPerformed
		});//addActionListener
	}//main
}//Canvas