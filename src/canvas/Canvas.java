package canvas;
/* Canvas.java Version 3
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
 * 	Added a People button.
 * 2.3:
 * 	Changed test to Google search.
 * 2.3:
 * 	Added a Pages button.
 * 2.4:
 * 	Added Color.
 * 
 * Version 3:
 * 	New logging feature.
 */

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import javax.swing.*;

public class Canvas {
	public static JFrame
		window = new JFrame("Canvas"),
		log = new JFrame("Log");
	
	public static JTextField
		search = new JTextField(5);
	
	public static JTextArea
		logs = new JTextArea();
	
	public static JButton
		google = new JButton("Search"),
		home = new JButton("Home"),
		aspen = new JButton("Aspen"),
		assignments = new JButton("Assignments"),
		discuss = new JButton("Discussions"),
		files = new JButton("Files"),
		pages = new JButton("Pages"),
		people = new JButton("People"),
		quit = new JButton("Quit"),
		logButton = new JButton("Log");
	
	public static JPanel
		SELECT = new JPanel(),
		GOOGLE = new JPanel(),
		HOME = new JPanel(),
		ASPEN = new JPanel(),
		ASSIGNMENTS = new JPanel(),
		DISCUSS = new JPanel(),
		FILES = new JPanel(),
		PAGES = new JPanel(),
		PEOPLE = new JPanel(),
		QUIT = new JPanel(),
		DEBUG = new JPanel();
	
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
			N4 = "https://knoxschools.instructure.com/courses/458183",												//N4 URL
			aspenURL = "https://aspen.knoxschools.org/aspen/logon.do",
			def = "https://google.com",																				//Default URL
			assignmentExt = "/assignments",																			//Assignments extension to the URL
			discussExt = "/discussion_topics",																		//Discussion extension to the URL
			filesExt = "/files",																					//Files extension to the URL
			pagesExt = "/pages",																					//Pages extension to the URL
			peopleExt = "/users";																					//Users extension to the URL
		
		String[] buttons = {
				"L1: English IV CP",
				"L2: SOSE",
				"L3: AP Computer Principles",
				"L4: Astronomy",
				"N1: Driver's Ed",
				"N2: Honors Pre-Cal",
				"N3: Personal Finance",
				"N4: Scientific Thinking IV"};
		
		for (int x = 0; x < buttons.length; x++) {
			classes.addItem(buttons[x]);												//Adds all of the classes into the array
		}//for x < buttons.length
		
		//Sets up the window and adds the color.
		window.add(SELECT);																//Adds the Drop-down menu
		window.add(GOOGLE);																//Google Search
		window.add(HOME);																//Home button
		window.add(ASPEN);																//Aspen button
		window.add(ASSIGNMENTS);														//Assignments button
		window.add(DISCUSS);															//Discussions Button
		window.add(FILES);																//Files button
		window.add(PAGES);																//Pages button
		window.add(PEOPLE);																//People button
		window.add(QUIT);																//Quit button
		window.add(DEBUG);																//Debug log button
		window.pack();
		window.setSize(295, 385);
		window.setDefaultCloseOperation(3);
		window.setVisible(true);
		window.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		window.getContentPane().setBackground(Color.green);
		
		//Sets up the Debug Menu
		log.add(logs);
		log.setSize(300, 300);
		log.setLocation(295, 0);
		log.setDefaultCloseOperation(1);
		log.setVisible(false);
		logs.setEditable(false);
		
		//Adds the classes drop-down box and adds the background
		SELECT.add(classes);
		SELECT.setBackground(Color.green);
		
		
		GOOGLE.add(search);
		GOOGLE.add(google);
		GOOGLE.setBackground(Color.green);
		search.setOpaque(true);
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.google.com/search?q=" + search.getText()).toURI());
				} catch (IOException | URISyntaxException e1) {
					//No. I know how to write a URL.
				}//Useless try/catch statement
				logs.append("Searched \"" + search.getText() + "\"\n");
			}
		});//Google
		
		google.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://www.google.com/search?q=" + search.getText()).toURI());
				} catch (IOException | URISyntaxException e1) {
					//No. I know how to write a URL.
				}//Useless try/catch statement
				logs.append("Searched \"" + search.getText() + "\"\n");
			}
		});//Google
		
		HOME.add(home);
		HOME.setBackground(Color.green);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
				{
				String chosenClass = (String) (classes.getSelectedItem());
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("English Home\n");
				}//L1
					
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("SOSE Home\n");
				}//L2
				
				else if ("L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("AP Computer Principles Home\n");
				}//L3
				
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Astronomy Home\n");
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Driver's Education Home\n");
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Honors Pre-Calculus Home\n");
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Personal Finance Home\n");
				}//N3
				
				else if ("N4: Scientific Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Scientific Thinking IV Home\n");
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("URL Failed, Google\n");
					
				}//if that goes to the home page of the selected class.
			}//actionPerformed
		});//addActionListener
		
		ASPEN.add(aspen);
		ASPEN.setBackground(Color.green);
		aspen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL(aspenURL).toURI());
				} catch (IOException | URISyntaxException e1) {
					//No. I know how to write a URL.
				}//Useless try/catch statement	
			}//actionPerformed
		});//addActionListener
		
		ASSIGNMENTS.add(assignments);
		ASSIGNMENTS.setBackground(Color.green);
		assignments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
				{
				String chosenClass = (String) classes.getSelectedItem();
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("English Assignments\n");
				}//L1
					
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("SOSE Assignments\n");
				} //L2
					
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("AP Computer Principles Assignments\n");
				}//L3
					
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Astronomy Assignments\n");
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Driver's Eucation Assignments\n");
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Honors Pre-Calculus Assignments\n");
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Personal Finance Assignments\n");
				}//N3
				
				else if ("N4: Scientific Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4 + assignmentExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Scientific Thinking IV Assignments\n");
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("URL Failed, Google\n");
				}//if that goes to the assignment page of the selected class.
			}//actionPerformed
		});//addActionListener
		
		DISCUSS.add(discuss);
		DISCUSS.setBackground(Color.green);
		discuss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
				{
				String chosenClass = (String) classes.getSelectedItem();
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("English Discussions\n");
				}//L1
				
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("SOSE Discussions\n");
				}//L2
				
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("AP Computer Principles Discussions\n");
				}//L3
				
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Astronomy Discussions\n");
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Driver's Education Discussions\n");
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Honors Pre-Calculus Discussions\n");
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3 + discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Personal Finance Discussions\n");
				}//N3
				
				else if ("N4: Scientific Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(discussExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Scientific Thinking IV Discussions\n");
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("URL Failed, Google\n");
				}//if that goes to the discussion page of the selected class.
			}//actionPerformed
		});//addActionListener
		
		FILES.add(files);
		FILES.setBackground(Color.green);
		files.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chosenClass = (String) classes.getSelectedItem();
				System.out.println(chosenClass);
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("English Files\n");
				}//L1
				
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("SOSE Files\n");
				}//L2
				
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("AP Computer Principles Files\n");
				}//L3
				
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Astronomy Files\n");
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Driver's Education Files\n");
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Honors Pre-Calculus Files\n");
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Personal Finance Files\n");
				}//N3
				
				else if ("N4: Scientific Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4 + filesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Scientific Thinking IV Files\n");
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("URL Failed, Google\n");
				}//if that goes to the files page of the selected class.
			}//actionPerformed
		});//addActionListener
		
		PAGES.add(pages);
		PAGES.setBackground(Color.green);
		pages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
				{
				String chosenClass = (String) classes.getSelectedItem();
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1 + pagesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("English Pages\n");
				}//L1
					
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2 + pagesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("SOSE Pages\n");
				} //L2
					
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3 + pagesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("AP Computer Principles Pages\n");
				}//L3
					
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4 + pagesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Astronomy Pages\n");
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1 + pagesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Driver's Education Pages\n");
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2 + pagesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Honors Pre-Calculus Pages\n");
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3 + pagesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Personal Finance Pages\n");
				}//N3
				
				else if ("N4: Scientific Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4 + pagesExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Scientific Thinking IV Pages\n");
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("URL Failed, Google\n");
				}//if that goes to the assignment page of the selected class.
			}//actionPerformed
		});//addActionListener
		
		PEOPLE.add(people);
		PEOPLE.setBackground(Color.green);
		people.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
				{
				String chosenClass = (String) classes.getSelectedItem();
				
				if ("L1: English IV CP" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L1 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("English People\n");
				}//L1
				
				else if ("L2: SOSE" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L2 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("SOSE People\n");
				}//L2
				
				else if( "L3: AP Computer Principles" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L3 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("AP Computer Principles People\n");
				}//L3
				
				else if ("L4: Astronomy" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(L4 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Astronomy People\n");
				}//L4
				
				else if ("N1: Driver's Ed" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N1 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Driver's Education People\n");
				}//N1
				
				else if ("N2: Honors Pre-Cal" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N2 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Honors Pre-Calculus People\n");
				}//N2
				
				else if ("N3: Personal Finance" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N3 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Personal Finance People\n");
				}//N3
				
				else if ("N4: Scientific Thinking IV" == chosenClass) {
					try {
						Desktop.getDesktop().browse(new URL(N4 + peopleExt).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("Scientific Thinking IV People\n");
				}//N4
				
				else {
					try {
						Desktop.getDesktop().browse(new URL(def).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
					logs.append("URL Failed, Google\n");
				}//if that goes to the files page of the selected class.
			}//actionPerformed
		});//addActionListener
		
		QUIT.add(quit);
		QUIT.setBackground(Color.green);
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				logs.append("Quitting");
			}//actionPerformed
		});//addActionListener
		
		DEBUG.add(logButton);
		DEBUG.setBackground(Color.green);
		logButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				log.setVisible(true);
				logs.append("Debug menu opened\n");
			}//actionPerformed
		});//addActionListener
	}//main
}//Canvas