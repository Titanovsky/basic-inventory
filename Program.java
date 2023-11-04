class Program {
    public static void main(String[] args) {
        ItemMaker.make("ak47", 1, "AK-47");
        ItemMaker.make("bread", 64, "Хлеб");
        ItemMaker.make("apple", 10, "Яблоко");

        Player ply = new Player("Titanovsky");
        Inventory inv = ply.getInventory();
        Slot[] slots = inv.getSlots();

        Item ak47 = new Item("ak47");
        inv.add(ak47, 0);

        print(slots[0].toString());
        
        Item apple1 = new Item("apple", 4);
        inv.add(apple1, 1);

        print(slots[1].toString());

        Item apple2 = new Item("apple", 10);
        inv.add(apple2, 2);

        print(slots[2].toString());

        inv.remove(apple2);

        print("Again: " + slots[2].toString());
    }

    public static void print(String arg) {
        System.out.println(arg);
    }
}