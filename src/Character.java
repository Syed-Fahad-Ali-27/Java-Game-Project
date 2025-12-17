public abstract class Character {

    protected String name;
    protected String description;
    protected int health;
    protected final int maxHealth;
    protected Location loc;

    public Character(String name, String description, int health, int maxHealth, int x, int y) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.maxHealth = maxHealth;
        loc = new Location(x, y);
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getHealth() {
        return health;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public Location getLoc() {
        return loc;
    }

}
