import java.awt.event.*;
import javax.swing.*;

import util.ShowInFrame;
public class ControlledWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SimpleAnimation p;
	ControlledWindow(final SimpleAnimation p){
		
		this.p=p;
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent _) {System.exit(0);}
			public void windowDeactivated(WindowEvent e) {p.t.stop();}
			public void windowActivated(WindowEvent e) {p.t.start();}
		});
		add(p);
		pack();
		setVisible(true);
		
		
	}
	
	
	public static void main(String[]args) {
		SimpleAnimation p = new KeyControlledAnimation(new MovableImage("hexe.png", 0, 0, 1, 1));
		p.gos.add(new MovableImage("biene.png", 800, 800, -1, -1));
	new ControlledWindow(p);
		
		
	}
}
