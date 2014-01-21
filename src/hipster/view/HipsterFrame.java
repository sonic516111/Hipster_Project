package hipster.view;

import hipster.controller.HipsterController;

import javax.swing.JFrame;

public class HipsterFrame extends JFrame
{

	private HipsterController baseController;
	private HipsterPanel basePanel;
	/**
	 * sets up the frame
	 * @param baseController
	 */
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	/**
	 * shows what the frame should have
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(800,800);
		this.setVisible(true);
	}
}
