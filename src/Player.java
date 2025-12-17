public class Player extends Character{

    private Item[] inventory;

    public Player(String name, String description, int x, int y) {
        super(name, description,10,10,x,y);
        Location loc = getLoc();
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void goLeft() {
        location.setX(location.getX() - 1);
    }
    public void goRight() {

    }
    public void goUp() {

    }
    public void goDown() {

    }

}
