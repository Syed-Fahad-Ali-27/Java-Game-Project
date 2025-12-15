public abstract class Item {
    /* These will act a template and will have the attributes that every item we create will inherit
    Name of item, its description and whether it can be collected or not
    We're going to make it protected so that only this class and its children are able to access it
    We won't make it private because then the children classes won't be able to access it
     */

    protected String name;
    protected String description;
    protected boolean isCollectable;

    //Constructor
    //Every time a new item is created , these variables are assigned to it
    public Item(String name, String description, boolean isCollectable) {
        this.name = name;
        this.description = description;
        this.isCollectable = isCollectable;
    }
    /*Getter
    We won't be using setter methods because the fields are set only once using the constructor methods
    and will not need to be changed - they're permanent properties
     */
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public boolean isCollectable() {
        return isCollectable;
    }
   /*In order to make sure that the player uses the correct item in the correct location
   we need to use an abstract method as each child class will implement it on its own
   with the parameters being player and location
    */
    public abstract boolean use(player Player, location Location);
}

