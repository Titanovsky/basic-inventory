public class Slot {
    private Boolean _isEmpty = true;
    private Item _item;
    
    Slot() {
    }

    Slot(Item item) {
        _isEmpty = false;
        _item = item;
    }

    public Item getItem() {return _item;}
    public Boolean isEmpty() {return _isEmpty;}
}