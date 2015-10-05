/* Canvas.java Version 2.1
 * Created by: Joshua Byers
 * Last edited: 10/2/15 at around 7:26
 * 
 * Version 1:
 * 	Just a test for the URL.
 * 
 * Version 2:
 * 	Adds all of the tabs and classes. Big jump, I know.
 * 2.1:
 * 	Added a quit button.
 * 2.2:
 * 	Added a People button
 */

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import javax.swing.*;

public class Canvas {
	public static JFrame
		window = new JFrame("Canvas");
	
	public static JTextField
		testURL = new JTextField(5);
	
	public static JButton
		testButton = new JButton("Test"),
		home = new JButton("Home"),
		aspen = new JButton("Aspen"),
		assignments = new JButton("Assignments"),
		discuss = new JButton("Discussions"),
		files = new JButton("Files"),
		people = new JButton("People"),
		quit = new JButton("Quit");
	
	public static JPanel
		SELECT = new JPanel(),
		TESTURL = new JPanel(),
		HOME = new JPanel(),
		ASPEN = new JPanel(),
		ASSIGNMENTS = new JPanel(),
		DISCUSS = new JPanel(),
		FILES = new JPanel(),
		PEOPLE = new JPanel(),
		QUIT = new JPanel();
	
	public static JComboBox<String>
		classes = new JComboBox<String>();
	
	public static void main(String[] args)
	{
		
		String
			L1 = "https://knoxschools.instructure.com/courses/455770",												//L1 URL
			L2 = "https://knoxschools.instructure.com/courses/455931",												//L2 URL
			L3 = "https://knoxschools.instructure.com/courses/455515",												//L3 URL
			L4 = "https://knoxschools.instructure.com/courses/456288",												//L4 URL
			N1 = "https://knoxschools.instructure.com/courses/456378",												//N1 URL
			N2 = "https://knoxschools.instructure.com/courses/456050",												//N2 URL
			N3 = "https://knoxschools.instructure.com/courses/457831",												//N3 URL
			N4 = "https://knoxschools.instructure.com/courses/455931",												//N4 URL
			aspenURL = "https://aspen.knoxschools.org/aspen/logon.do",
			def = "https://google.com",																				//Default URL
			assignmentExt = "/assignments",																			//Assignments extension to the URL
			discussExt = "/discussion_topics",																		//Discussion extension to the URL
			peopleExt = "/users",																					//Users extension to the URL
			filesExt = "/files";																					//Files extension to the URL
		
		String[] buttons = {
				"L1: English IV CP",
				"L2: SOSE",
				"L3: AP Computer Principles",
				"L4: Astronomy",
				"N1: Driver's Ed",
				"N2: Honors Pre-Cal",
				"N3: Personal Finance",
				"N4: Design Thinking IV"};
		
		for (int x = 0; x < buttons.length; x++) {
			classes.addItem(buttons[x]);												//Adds all of the classes into the array
		}//for x < buttons.length
		
		window.add(SELECT);																//Adds the Drop-down menu
		window.add(TESTURL, BorderLayout.EAST);
		window.add(HOME);																//Home button
		window.add(ASPEN);
		window.add(ASSIGNMENTS);														//Assignments button
		window.add(DISCUSS);															//Discussions Button
		window.add(FILES);																//Files button
		window.add(PEOPLE);																//People buttonukmnjyhbtgvrf
		window.add(QUIT);																//Quit button
		window.pack();
		window.setSize(275, 335);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		SELECT.add(classes);
		
		TESTURL.add(testURL);
		TESTURL.add(testButton);
		testButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL(testURL.getText()).toURI());
				} catch (IOException | URISyntaxException e1) {
					//No. I know how to write a URL.
				}//Useless try/catch statement
			}
		});//TestURL
		
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
		
		ASPEN.add(aspen);
		aspen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL(aspenURL).toURI());
				} catch (IOException | URISyntaxException e1) {
					//No. I know how to write a URL.
				}//Useless try/catch statement	
			}
		});
		
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
		
		PEOPLE.add(people);
		people.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chosenClass = (String) classes.getSelectedItem();
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L1
				
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L2
				
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L3
				
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}//N3
				
				else if ("N4: Design Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4 + peopleExt).toURI());
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
		
		QUIT.add(quit);
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}//actionPerformed
		});//addActionListener
	}//main
}//Canvas