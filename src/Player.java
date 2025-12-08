public class Player extends Character{

    private Item[] inventory;
    private Location location;

    public Player() {
        super();
        location = new Location(0,0);
    }

    public Player(int x, int y) {
        super();
        location = new Location(x, y);
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void goLeft() {
        location.setX(location.getX() - 1);
    }
    public void goRight() {
        location.setX(location.getX() + 1);
    }
    public void goUp() {
        location.setY(location.getY() - 1);
    }
    public void goDown() {
        location.setY(location.getY() + 1);
    }

}
