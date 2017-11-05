import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPicker extends JFrame{


		private JPanel panel;
		
		int r;  
		int g;
		int b;

		public ColorPicker(){
			
			setTitle("Color Picker");
			setLayout(null);
			setSize(200, 200);

			panel = new JPanel();
			panel.setSize(300, 300);
			panel.addMouseListener(new Listener());
			

			add(panel);

			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

		public class Listener implements MouseListener {
			public void mouseClicked(MouseEvent e) {
				
			}

			public void mouseEntered(MouseEvent e) {
				System.out.println("The mouse entered the panel.");
				 r = e.getX();
				 g = e.getY();
				 b = (int) Math.sqrt((r*r) + (g*g));
				 panel.setBackground(new Color(r,g,b));
				 System.out.println("Mouse Cursor is at the coordinates X:" +r+ "and Y:"+g);
				
			}

			public void mouseExited(MouseEvent e) {
				System.out.println("The mouse exited the panel.");
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}
		}

		public static void main(String args[]) {
			new ColorPicker();
		}
	}
	
	

