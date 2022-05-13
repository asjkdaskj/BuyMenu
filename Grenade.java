/**
 * name: Stefany 
 * date 2022-04-29 
 * description: grenade class that extends to
 * item. 
 */
public class Grenade extends Item {

	private int damage;
	private int killAward;

	public Grenade(int cost, String name, int killAward, int damage, boolean isBought) {
		super(cost, name, isBought);
		this.damage = damage;
		this.killAward = killAward;
	}

	public double getKillAward() {
		return this.killAward;
	}

	public double getDamage() {
		return this.damage;
	}

	public String toString() {
		return "\ndamage: " + damage + "\nkillAward" + killAward;
	}
}
