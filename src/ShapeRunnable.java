
public class ShapeRunnable implements Runnable {

	private Shape shape;
	private DrawPanel drawPanel;
	
	public ShapeRunnable(Shape shape, DrawPanel drawPanel) {
		super();
		this.shape = shape;
		this.drawPanel = drawPanel;
	}

	@Override
	public void run() {
		while (true)
		{
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			shape.transition();
			shape.rotate();
			
			this.drawPanel.repaint();
		}
	}

}
