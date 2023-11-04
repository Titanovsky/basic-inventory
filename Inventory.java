import java.lang.reflect.Array;

public class Inventory {
    public final static int ABS_MAX_SLOTS = 16; //? не уверен, что они должны быть здесь, а не в Slot
    public final static int ABS_MIN_SLOTS = 0; //? не уверен, что они должны быть здесь, а не в Slot

    private Slot[] _slots = new Slot[ABS_MAX_SLOTS];
    private int _maxSlots = 0;

    Inventory(int slots) {
        _maxSlots = getValidMaxSlots(slots);

        for (int i = 0; i < ABS_MAX_SLOTS; i++) {
            _slots[i] = new Slot();
        }
    }

    private static int getValidMaxSlots(int slots) {
        return (slots >= ABS_MAX_SLOTS) ? ABS_MAX_SLOTS - 1 : (slots < ABS_MIN_SLOTS) ? ABS_MIN_SLOTS : slots;
    }

    public Slot[] getSlots() {return _slots;}
    public Slot get(int slot) {return _slots[slot];}

    public void setMaxSlots(int maxSlots) {
        maxSlots = getValidMaxSlots(maxSlots);

        _maxSlots = maxSlots;
        if (_maxSlots == ABS_MAX_SLOTS) return;

        for (int i = _maxSlots; i < ABS_MAX_SLOTS; i++) {
            _slots[i] = new Slot();
        }
    }

    public void add(Item item, int slot) {
        if (slot > _maxSlots) return;

        get(slot).setItem(item);
    }
    public void remove(Item item) {
        for (Slot slot : _slots) {
            if (slot.isEmpty()) continue;
            if (slot.getItem() != item) continue; // не используем equals, ибо оперируем областью памяти

            slot.remove();
            
            return;
        }
    }
}
