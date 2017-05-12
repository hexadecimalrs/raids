import java.util.Scanner;
/*
	* Compile & Run in java however you know how to
		e.g. cmd line 
		>javac RaidsLoot.java
		>java RaidsLoot
	* Enter team points to get rates of items
	* If you want a percentage, divide 1 by rate e.g. 1 in 10 raids = 1/10 = 10%
*/
public class RaidsLoot{
	public static void main(String[]args){
		String []loots = {"Arcane prayer scroll, Dexterous prayer scroll: 1 in ", "Dragon sword, Dragon harpoon, Dragon thrownaxe: 1 in ",
						"Twisted buckler, Dragon hunter crossbow: 1 in ", "Dinh's Bulwark, Ancestral hat, Ancestral robe top, Ancestral robe bottom, Dragon claws: 1 in ",
						"Elder maul, Kodai insignia, Twisted bow: 1 in "
		};
		double []rate = {(20.0/84.0), (5.0/84.0), (4.0/84.0), (3.0/84.0), (2.0/84.0)};
		double uniqueRate;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total points: ");
		int total = scan.nextInt();
		
		if(total >= 1710000){
			System.out.println("\nYou have a chance to roll three items. The chance for each item is the same, as follows:");
			for(int i = 0; i < loots.length; i++){
				System.out.println(loots[i] + 1/(rate[i]*0.8) + " raids.");
			}
		}
		else if(total > 1140000){
			uniqueRate = 0.8 * (double)(total - 1140000) / 570000.0;
			System.out.println("You have a chance to roll three items. The chance for the first two items is the same, as follows:");
			for(int i = 0; i < loots.length; i++){
				System.out.println(loots[i] + 1/(rate[i]*0.8) + " raids.");
			}
			System.out.println("\nThe chance for the third item is as follows:");
			for(int i = 0; i < loots.length; i++){
				System.out.println(loots[i] + 1/(rate[i]*uniqueRate) + " raids.");
			}
		}
		else if(total == 1140000){
			System.out.println("\nYou have a chance to roll two items. The chance for each item is the same, as follows:");
			for(int i = 0; i < loots.length; i++){
				System.out.println(loots[i] + 1/(rate[i]*0.8) + " raids.");
			}
		}
		else if(total > 570000){
			uniqueRate = 0.8 * (double)(total - 570000) / 570000.0;
			System.out.println("You have a chance to roll two items. The chance for the first item is as follows:");
			for(int i = 0; i < loots.length; i++){
				System.out.println(loots[i] + 1/(rate[i]*0.8) + " raids.");
			}
			System.out.println("\nThe chance for the second item is as follows:");
			for(int i = 0; i < loots.length; i++){
				System.out.println(loots[i] + 1/(rate[i]*uniqueRate) + " raids.");
			}
		}
		else if(total > 0){
			uniqueRate = 0.8 * (double)total / 570000.0;
			System.out.println("You have a chance to roll one items, as follows:");
			for(int i = 0; i < loots.length; i++){
				System.out.println(loots[i] + 1/(rate[i]*uniqueRate) + " raids.");
			}
		}
		else{
			System.out.println("You have no chance to get an item.");
		}
	}
}