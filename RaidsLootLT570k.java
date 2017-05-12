import java.util.Scanner;
 
public class RaidsLootLT570k{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total points: ");
        int total = scan.nextInt();
        double uniqueRate = 0.8 * (double)total / 570000.0;
        System.out.println("For "+total+" points:");
        System.out.println("1 in "+(1/uniqueRate)+" raids for a unique.");
       
        double rate;
        rate = (20.0 / 84.0) * uniqueRate;
        System.out.println("Arcane prayer scroll, Dexterous prayer scroll: "+"1 in "+(1.0/rate)+" raids.");
        rate = (5.0 / 84.0) * uniqueRate;
        System.out.println("Dragon sword, Dragon harpoon, Dragon thrownaxe: "+"1 in "+(1.0/rate)+" raids.");
        rate = (4.0 / 84.0) * uniqueRate;;
        System.out.println("Twisted buckler, Dragon hunter crossbow: "+"1 in "+(1.0/rate)+" raids.");
        rate = (3.0 / 84.0) * uniqueRate;
        System.out.println("Dinh's Bulwark, Ancestral hat, Ancestral robe top, Ancestral robe bottom, Dragon claws: "+"1 in "+(1.0/rate)+" raids.");
        rate = (2.0 / 84.0) * uniqueRate;
        System.out.println("Elder maul, Kodai insignia, Twisted bow: "+"1 in "+(1.0/rate)+" raids.");
    }
}