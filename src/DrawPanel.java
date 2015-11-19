import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	
	private Shape shape;
	
	public DrawPanel(Shape shape) {
		this.setPreferredSize(new Dimension(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT));
		this.shape = shape;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
			
		g.setColor(this.shape.color);
		g.drawRect(this.shape.x, this.shape.y, this.shape.width, this.shape.height);
		g.fillRect(this.shape.x, this.shape.y, this.shape.width, this.shape.height);
	}
}
