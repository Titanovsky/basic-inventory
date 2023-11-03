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

    public void setItem(Item item) {
        _item = item;
        _isEmpty = false;
    }

    public String toString() {
        String str = "";

        str += (_isEmpty) ? "Empty" : getItem().getHeader() + " " + "x" + getItem().getCount();

        return str;
    }
}