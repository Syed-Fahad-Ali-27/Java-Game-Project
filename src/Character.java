public abstract class Character {

    protected String name;
    protected String description;
    protected int health;
    protected final int maxHealth;
    protected int xPos;
    protected int yPos;

    public Character(String name, String description, int health, int maxHealth) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.maxHealth = maxHealth;
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
    public int getXPos() {
        return xPos;
    }
    public int getYPos() {
        return yPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }
    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

}
