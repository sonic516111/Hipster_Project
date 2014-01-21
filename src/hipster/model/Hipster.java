package hipster.model;

public class Hipster
{

	private String name;
	private String hipsterType;
	private String hipsterPhrase;
	private String[] hipsterBooks;

	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Grayson";
		hipsterType = "Student Hipster";
		hipsterPhrase = "Cheezy";

		fillTheBooks();
	}

	/**
	 * 
	 * @param name
	 * @param hipsterType
	 * @param hipsterPhrase
	 * @param hipsterBooks
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase, String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}

	/**
	 * shows hipsterBooks
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Pokemon Black and White";
		hipsterBooks[1] = "Pokemanga";
		hipsterBooks[2] = "Minecraft Wiki";
		hipsterBooks[3] = "Ender's Game";
		hipsterBooks[4] = "Pokemon Adventures";
	}

	/**
	 * gets the name
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * sets the name
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * gets the hipster type
	 * 
	 * @return
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}

	/**
	 * sets the hipster type
	 * 
	 * @param hipsterType
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	/**
	 * gets the hipster phrase
	 * 
	 * @return
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	/**
	 * sets the hipster phrase
	 * 
	 * @param hipsterPhrase
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	/**
	 * gets the hipster books
	 * 
	 * @return
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	/**
	 * sets the hipster books
	 * 
	 * @param hipsterBooks
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
}
