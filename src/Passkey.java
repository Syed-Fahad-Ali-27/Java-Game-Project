public class Passkey extends Item{

    //create object Passkey
    public Passkey() {
        super(
                "Passkey",
                "Passkey can be used to unlock the Vault",
                true
        );
    }
    //Implement abstract method for how the passkey should be used
    @Override
    public boolean use(Player player, Location location) {
        //Syringe can be used at the vault to unlock it
        if (player.getName().equals("The Vault")) {
            System.out.println("You can unlock the Vault");
            return true;
        }
        //if used in another location
        else {
            System.out.println("You can't use passkey here, only at the vault");
            return false; //passkey wasn't used successfully
        }
    }

}