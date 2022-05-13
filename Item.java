/**
 * name: Stefany 
 * date 2022-04-29 
 * description: Item superclass. All the attributes that the Weapon, Equipment, and Grenade shares
 */
public class Item {
	/* Attributes */
	/** the cost of the items */
	private double cost;
	/** the name of the items */
	private String name;
	/** whether it has been bought yet or not */
	private boolean isBought;

	/* Constructor */
	/**
	 * name: Item description: constructor for Item
	 * 
	 * @param cost     - the cost of the items
	 * @param name     - the name of the items
	 * @param isBought - whether it has been bought yet or not
	 */
	public Item(double cost, String name, boolean isBought) {
		this.cost = cost;
		this.name = name;
		this.isBought = isBought;

	}

	/* Accessors and Mutators */
	/**
	 * Name: getIsBought 
	 * Description: returns if it has been bought
	 * 
	 * @return isBought
	 */
	public boolean getIsBought() {
		return this.isBought;
	}

	/**
	 * Name: getCost 
	 * Description: returns the cost
	 * 
	 * @return cost
	 */
	public double getCost() {
		return this.cost;
	}

	/**
	 * Name: getName 
	 * Description: returns the name
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Name: setIsBought 
	 * Description: makes the false into true
	 * 
	 * @return true
	 */
	public boolean setIsBought() {
		return true;
	}

	/**
	 * Name: toString 
	 * Description: outputs the Item's attributes
	 * 
	 * @return Item's attributes
	 */
	public String toString() {
		return "\ncost: " + cost + "\nname: " + name;
	}

}
