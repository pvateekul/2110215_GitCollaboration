import javax.swing.JFrame;


public class Main {
	
	public static final int SCREEN_WIDTH = 400;
	public static final int SCREEN_HEIGHT = 300;
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		Shape shape = new Shape(Main.SCREEN_WIDTH / 2 - 50, Main.SCREEN_HEIGHT /2 - 50, 100,100);
		
		DrawPanel drawPanel = new DrawPanel(shape);
		
		frame.add(drawPanel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Thread thread = new Thread(new ShapeRunnable(shape, drawPanel));
		
		thread.start();
	}
}
