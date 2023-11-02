public class Item {
    private int _count = 0;
    private Boolean _hasModify = false; // it won't for a basic realization
    private ItemMaker _itemClassInfo; 

    Item(String itemClass, int count) {
        if (!ItemMaker.has(itemClass)) return;
        if (count <= 0) return;

        _count = count;

        _itemClassInfo = ItemMaker.get(itemClass);
    }

    public ItemMaker getItemClassInfo() {
        return _itemClassInfo;
    }
    public int getCount() {
        return _count;
    }
    public Boolean hasModify() {
        return _hasModify;
    }

    public void setCount(int count) {
        _count = count;
    }
    public void add(Inventory inv) {
        //todo
    }
    public void add(Slot slot) {
        //todo
    }
}
