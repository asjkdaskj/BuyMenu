import java.io.*;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Weapon glock = new Weapon(200, "Glock-18", 300, 14, 400, 2, false, true);
		Weapon deagle = new Weapon(700, "Desert Eagle", 300, 53, 267, 3, false, false);
		Weapon sawedOff = new Weapon(1100, "Sawed-Off", 900, 160, 70, 1.5, true, false);
		Weapon xm1014 = new Weapon(2000, "XM-1014", 900, 110, 171, 1.5, true, false);
		Weapon mac10 = new Weapon(1050, "Mac-10", 600, 16, 800, 2, false, false);
		Weapon p90 = new Weapon(2350, "P90", 300, 20, 857, 2, false, false);
		Weapon ak47 = new Weapon(2700, "AK-47", 300, 28, 600, 5, false, false);
		Weapon awp = new Weapon(4750, "AWP", 100, 115, 41, 5, false, false);

		// declaring equipment
		Equipment helmetAndKevlar = new Equipment(1000, "Helmet and Kevlar", false);
		Equipment kevlar = new Equipment(650, "Kevlar", false);
		Equipment kit = new Equipment(400, "kit", false);

		// declaring grenades
		Grenade heGrenade = new Grenade(300, "HE Grenade", 300, 60, false);
		Grenade flashBang = new Grenade(200, "Flashbang", 300, 1, false);
		Grenade smokeGrenade = new Grenade(300, "Smoke Grenade", 300, 1, false);
		Grenade molotov = new Grenade(400, "Molotov", 300, 80, false);
		Grenade incendiary = new Grenade(600, "Incendiary Grenade", 300, 80, false);
		Grenade decoyGrenade = new Grenade(50, "Decoy Grenade", 300, 1, false);

		Player player = new Player(1000000);

		while (true) {

			double playerMoney = player.getMoney();
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to CSGO TEXT ONLY");
			System.out.println("pick one");
			System.out.println("(1) buy items");
			System.out.println("(2) play");

			int input;
			int buy;
			input = sc.nextInt();

			try {
				if (input == 1) {
					while (true) {
						System.out.println("you have $" + player.getMoney());
						System.out.println("pick a category");
						System.out.println("(1) pistols");
						System.out.println("(2) heavy");
						System.out.println("(3) SMGs");
						System.out.println("(4) rifles");
						System.out.println("(5) gear");
						System.out.println("(6) grenades");
						System.out.println("(0) back");
						// Read a line from the user

						input = sc.nextInt();

						if (input == 1) {
							System.out.println("you have $" + player.getMoney());
							System.out.println("choose a pistol you want to buy");
							System.out.println("(1) Glock-18: $" + glock.getCost());
							System.out.println("(2) Desert Eagle: $" + deagle.getCost());
							System.out.println("(0) back");
							buy = sc.nextInt();
							if (buy == 1) {
								if (player.getMoney() < glock.getCost()) {
									System.out.println("you don't have enough money");

								} else {

									playerMoney = player.getMoney() - glock.getCost();
									glock.setIsBought();

									System.out.println("you have $" + playerMoney + " left");

								}
							}

							if (buy == 2) {
								if (player.getMoney() < deagle.getCost()) {
									System.out.println("you don't have enough money");

								} else {
									playerMoney = player.getMoney() - deagle.getCost();
									deagle.setIsBought();
									System.out.println("you have $" + playerMoney + " left");

								}
							}
							if (buy == 0) {
								break;
							}
						}

						if (input == 2) {
							System.out.println("you have $" + player.getMoney());
							System.out.println("choose a heavy you want to buy");
							System.out.println("(1) Sawed Off: $" + sawedOff.getCost());
							System.out.println("(2) XM-1014: $" + xm1014.getCost());
							System.out.println("(0) back");
							buy = sc.nextInt();
							if (buy == 1) {
								if (player.getMoney() < sawedOff.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - sawedOff.getCost();
									System.out.println("you have $" + playerMoney + " left");
									sawedOff.setIsBought();

								}
							}
							if (buy == 2) {
								if (player.getMoney() < xm1014.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - xm1014.getCost();
									xm1014.setIsBought();
									System.out.println("you have $" + playerMoney + " left");

								}
							}

							if (buy == 0) {
								break;
							}
						}

						if (input == 3) {

							System.out.println("you have $" + player.getMoney());
							System.out.println("choose a SMG you want to buy");
							System.out.println("(1) Mac-10: $1050");
							System.out.println("(2) P90: $2350");
							System.out.println("(0) back");
							buy = sc.nextInt();
							if (buy == 1) {
								if (player.getMoney() < mac10.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - mac10.getCost();
									System.out.println("you have $" + playerMoney + " left");
									mac10.setIsBought();

								}
							}
							if (buy == 2) {
								if (player.getMoney() < p90.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - p90.getCost();
									System.out.println("you have $" + playerMoney + " left");
									p90.setIsBought();
								}
							}

							if (buy == 0) {
								break;
							}
						}

						if (input == 4) {
							System.out.println("you have $" + player.getMoney());
							System.out.println("choose a Rifle you want to buy");
							System.out.println("(1) AK-47: $2700");
							System.out.println("(2) AWP: $4750");
							System.out.println("(0) back");

							buy = sc.nextInt();
							if (buy == 1) {
								if (player.getMoney() < ak47.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - ak47.getCost();
									System.out.println("you have $" + playerMoney + " left");
									ak47.setIsBought();
								}
							}
							if (buy == 2) {
								if (player.getMoney() < awp.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - awp.getCost();
									System.out.println("you have $" + playerMoney + " left");
									awp.setIsBought();
								}
							}

							if (buy == 0) {
								break;
							}
						}

						if (input == 5) {
							System.out.println("you have $" + player.getMoney());
							System.out.println("choose an equipment you want to buy");
							System.out.println("(1) Helmet and Kevlar: $1000");
							System.out.println("(2) Kevlar: $650");
							System.out.println("(3) kit: $400");
							System.out.println("(0) back");

							buy = sc.nextInt();
							if (buy == 1) {
								if (player.getMoney() < helmetAndKevlar.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - helmetAndKevlar.getCost();
									System.out.println("you have $" + playerMoney + " left");
									helmetAndKevlar.setIsBought();
								}
							}

							if (buy == 2) {
								if (player.getMoney() < kevlar.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - kevlar.getCost();
									System.out.println("you have $" + playerMoney + " left");
									kevlar.setIsBought();
								}
							}
							if (buy == 3) {
								if (player.getMoney() < kit.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - kit.getCost();
									System.out.println("you have $" + playerMoney + " left");
									kit.setIsBought();
								}
							}
							if (buy == 0) {
								break;
							}
						}

						if (input == 6) {
							System.out.println("you have $" + player.getMoney());
							System.out.println("choose a grenade you want to buy");
							System.out.println("(1) HE Grenade: $300");
							System.out.println("(2) Flashbang: $200");
							System.out.println("(3) Smoke Grenade: $300");
							System.out.println("(4) Molotov: $400");
							System.out.println("(5) Incendiary Grenade: $600");
							System.out.println("(6) Decoy Grenade: $50");
							System.out.println("(0) back");
							buy = sc.nextInt();

							if (buy == 1) {
								if (player.getMoney() < heGrenade.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - heGrenade.getCost();
									System.out.println("you have $" + playerMoney + " left");
									heGrenade.setIsBought();
								}
							}

							if (buy == 2) {
								if (player.getMoney() < flashBang.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - flashBang.getCost();
									System.out.println("you have $" + playerMoney + " left");
									flashBang.setIsBought();
								}
							}

							if (buy == 3) {
								if (player.getMoney() < smokeGrenade.getCost()) {
									System.out.println("you don't have enough money loser");
								} else {
									playerMoney = player.getMoney() - smokeGrenade.getCost();
									System.out.println("you have $" + playerMoney + " left");
									smokeGrenade.setIsBought();
								}
							}

							if (buy == 4) {
								if (player.getMoney() < molotov.getCost()) {
									System.out.println("you don't have enough money loser");
								} else {
									playerMoney = player.getMoney() - molotov.getCost();
									System.out.println("you have $" + playerMoney + " left");
									molotov.setIsBought();
								}
							}

							if (buy == 5) {
								if (player.getMoney() < incendiary.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - incendiary.getCost();
									System.out.println("you have $" + playerMoney + " left");
									incendiary.setIsBought();
								}
							}

							if (buy == 6) {
								if (player.getMoney() < decoyGrenade.getCost()) {
									System.out.println("you don't have enough money");
								} else {
									playerMoney = player.getMoney() - decoyGrenade.getCost();
									System.out.println("you have $" + playerMoney + " left");
									decoyGrenade.setIsBought();
								}
							}

							if (buy == 0) {
								break;
							}
						}

						if (input == 0) {
							break;
						}

					}
				}
			} catch (Error VariableDeclaratorId) {
				System.out.println("Error found");
			}
		}
	}
}
