public class Inventory {
    public final static int ABS_MAX_SLOTS = 128; //? не уверен, что они должны быть здесь, а не в Slot
    public final static int ABS_MIN_SLOTS = 0; //? не уверен, что они должны быть здесь, а не в Slot

    private Slot[] _slots = new Slot[ABS_MAX_SLOTS];
    private int _maxSlots = 0;

    Inventory(int slots) {
        _maxSlots = getValidMaxSlots(slots);

        for (int i = 0; i < _maxSlots; i++) {
            _slots[i] = new Slot();
        }
    }

    private static int getValidMaxSlots(int slots) {
        return (slots >= ABS_MAX_SLOTS) ? ABS_MAX_SLOTS - 1 : (slots < ABS_MIN_SLOTS) ? ABS_MIN_SLOTS : slots;
    }

    public Slot[] getSlots() {return _slots;}
    public Slot getSlot(int slot) {return _slots[slot];}

    public void setMaxSlots(int maxSlots) {
        maxSlots = getValidMaxSlots(maxSlots);

        _maxSlots = maxSlots;
        int maxArrayElements = ABS_MAX_SLOTS - 1;
        if (_maxSlots == maxArrayElements) return;

        for (int i = _maxSlots; i < maxArrayElements; i++) {
            _slots[i] = new Slot();
        }
    }
}
