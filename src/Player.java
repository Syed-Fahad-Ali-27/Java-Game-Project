public class Player extends Character{

    private Item[] inventory;

    public Player(String name, String description, int x, int y) {
        super(name, description,10,10);
        setXPos(x);
        setYPos(y);
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void goLeft() {
        setXPos(getXPos() - 1);
    }
    public void goRight() {
        setXPos(getXPos() + 1);
    }
    public void goUp() {
        setYPos(getYPos() + 1);
    }
    public void goDown() {
        setYPos(getYPos() - 1);
    }

    public String getLocation() {
        int x = getXPos();
        int y = getYPos();
        return x + ", " + y;
    }

}
