public class Player {
    private String _name;
    private Inventory _inv;
    private static final int _maxSlots = 4;

    Player(String name) {
        _name = name;

        _inv = new Inventory(_maxSlots);
    }

    public String getName() {return _name;}
    public Inventory getInventory() {return _inv;}
}