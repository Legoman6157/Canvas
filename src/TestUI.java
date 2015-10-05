
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.*;
public class TestUI {
	public static JFrame
		window = new JFrame("TestUI");
	public static String[] classes = {
			"http://google.com",
			"http://ninjakiwi.com"
	};
	public static int temp;
	public static JButton tempButton;
	public static void main(String[] args) {
		window.setVisible(true);
		window.setSize(300,  300);
		window.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));;
		for (int x = 0; x < classes.length; x++) {
			temp = x;
			tempButton = new JButton(classes[temp]);
			window.add(tempButton);//window.add()
			tempButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Desktop.getDesktop().browse(new URL(classes[temp]).toURI());
					} catch (IOException | URISyntaxException e1) {
						//No. I know how to write a URL.
					}//Useless try/catch statement
				}
			});
		}//for
	}//main
}//TestUI
