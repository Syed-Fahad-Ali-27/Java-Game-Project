public class Test {

    public static void main(String[] args) {
        Player player = new Player("Fahad","Assassin");
        System.out.println(player.getName());
        System.out.println(player.getDescription());
        player.goUp();
        player.goDown();
        player.goRight();
        player.goLeft();
        System.out.println(player.getLocation());

    }

}
