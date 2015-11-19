import java.awt.Color;
import java.awt.Polygon;

public class Shape{
	
	public int x,y,width,height;
	
	public Color color;
	
	private int redValue = 255;
	
	public Shape(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = new Color(redValue, 0, 0);
		
		
	}
}
