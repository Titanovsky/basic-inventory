class Program {
    public static void main(String[] args) {
        ItemMaker.make("ak47", 1, "AK-47");
        ItemMaker.make("bread", 64, "Bread");
        ItemMaker.make("apple", 10, "Apple");

        Player ply = new Player("Titanovsky");
        Inventory inv = ply.getInventory();
        Slot[] slots = inv.getSlots();


        int i = 0;
        for (Slot slot : slots) {
            System.out.println(i + " " + slot);
            i += 1;
        }
    }

    public static void print(String arg) {
        System.out.println(arg);
    }
}