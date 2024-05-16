import java.lang.annotation.IncompleteAnnotationException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ak47 ak47 = new Ak47();

        System.out.println("Umumi mermi sayini daxil edin :");
        ak47.bulletCount=scanner.nextInt();
        System.out.println("DAragin tutumunu daxil edin :");
        ak47.capacityOfTheWeapon=scanner.nextInt();
        ak47.currentlyBulletCount= ak47.capacityOfTheWeapon;

        while(true){
            System.out.println("""
                    1 - Fire : 
                    2 - Reload : 
                    """);
            int operation = scanner.nextInt();
            switch (operation){
                case 1 -> ak47.fire();
                case 2 -> ak47.reloadWeapon();
            }
        }
    }
}
