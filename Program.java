class Program {
    public static void main(String[] args) {
        Player ply = new Player("Titanovsky");
        Inventory inv = ply.getInventory();
        Slot[] slots = inv.getSlots();
    }

    public static void print(String arg) {
        System.out.println(arg);
    }
}