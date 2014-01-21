package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

public class HipsterController
{
	private HipsterFrame appFrame;
	private Hipster selfHipster;
	private Hipster [] cubicleHipsters;
	private int hipsterCount;
	/**
	 * sets up the hipster count
	 */
	public HipsterController()
	{
		selfHipster = new Hipster();
		cubicleHipsters = new Hipster [6];
		hipsterCount = 6;
	}
	/**
	 * gets self hipster
	 * @return
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
	/**
	 * gets cubicle hipsters
	 * @return
	 */
	public Hipster [] getCubicleHipsters()
	{
		return cubicleHipsters;
	}
	/**
	 * starts everything
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);
	}
	
	
	/**
	 * gets a specified hipster
	 * @param position
	 * @return
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;
		if(position < cubicleHipsters.length && position >= 0)
		{
			currentHipster = cubicleHipsters[position];
		}
		return currentHipster;
	}
	/**
	 * gets a random hipster
	 * @return
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;
		
		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * cubicleHipsters.length) ;
		currentHipster = cubicleHipsters[randomIndex];
		
		return currentHipster;
	}
	/**
	 * adds hipster and its books, name, type, and phrase
	 * @param books
	 * @param name
	 * @param type
	 * @param phrase
	 */
	public void addHipster(String [] books, String name, String type, String phrase)
	{
		if(hipsterCount < cubicleHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			cubicleHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "The class is full you are too mainstream to be added");
		}
	}
	
}
