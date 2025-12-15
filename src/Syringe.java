public class Syringe extends Item{

    //create object "syringe"
    public Syringe() {
        super(
                "Syringe"
                "Syringe can be used to knock out the guard or extract the tear"
                true
        );
    }
    //Implement abstract method for how the syringe should be used
    @Override
    public boolean use(player Player, location Location) {
        //Syringe can be used either in the guard post or in the vault
        //1. At the Guard Post to knock out the guard
        if (Location.getName().equals("Guard Post")) {
            System.out.println("You can knock the Guard out");
            return true;
            //when the guard is knocked out, can make the other items available
        }
        //2. At the Vault
        else if (Location.getName().equals("Vault")) {
            System.out.println("You can extract the tear");
            //when tear is extracted successfully, the player wins
            System.out.println("Operation Successful! Victory! ");
            return true;
            //Game is completed
        }
        //if used in another location
        else {
            System.out.println("You can't use syringe here, only at guard post or vault");
            return false; //syringe wasn't used successfully
        }
    }
}
