public class Keycard extends Item {
    /* Will inherit all the attributes and methods from Item
    while adding implementing its own
     */
    //Create the object "keycard"
    public Keycard() {
        //Need to call the parent class to pass the values for keycard
        super(
                "Keycard"
                "Keycard to unlock security doors"
        true
        );
    }
    //Implement the abstract method for how the keycard should be used
    @Override
    public boolean use(Player player, Location location){
        /*The keycard should be used when the player is at the security office door
        so we need to check whether the player is at the location
         */
        if (location.getName().equals("security office")) {
            // equals will check if both Strings are the same

            //If player is at the right location then the door will unlock
            System.out.println("You can unlock Security Office Door using keycard");
            //When the player unlocks door
            return true;  //player used item successfully
        } else  {
            System.out.println("You can not use the keycard here, only used at the Security Office");
            //if player is not at Security Office
            return false; //player failed to use item
        }
    }
}
