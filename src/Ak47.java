public class Ak47 extends Weapon implements Fireable{

    @Override
    public void reloadWeapon() {
        if(bulletCount>=capacityOfTheWeapon){
            bulletCount-=(capacityOfTheWeapon-currentlyBulletCount);
            System.out.println("Umumi mermi sayi : "+bulletCount);
            currentlyBulletCount=currentlyBulletCount+(capacityOfTheWeapon-currentlyBulletCount);
            System.out.println("Daraqdaki mermi sayi : "+currentlyBulletCount);

        }else System.out.println("Mermi sayi yeterli deyil");
    }

    @Override
    public void fire() {
        if(currentlyBulletCount>0){
            currentlyBulletCount--;

            System.out.println("Hazirdaki mermi sayi " +currentlyBulletCount);
        }
        else if(currentlyBulletCount==0){
            if(bulletCount>capacityOfTheWeapon){
                reloadWeapon();
            }else
                System.out.println("daraqda mermi yoxdur");

        }

    }
}
