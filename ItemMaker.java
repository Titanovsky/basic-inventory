import java.util.*; // thanks for Mark

public class ItemMaker {
    public static final int DEFAULT_MAX_COUNT = Integer.MAX_VALUE;
    public static final String DEFAULT_HEADER = "Header";
    public static final String DEFAULT_DESCRIPTION = "No description.";

    private static Map<String, ItemMaker> _itemClasses = new HashMap<String, ItemMaker>();

    private String _itemClass;
    private int _maxCount;
    private String _header;
    private String _description;

    private ItemMaker(String itemClass, int maxCount, String header, String description) {
        _itemClass = itemClass;
        _maxCount = maxCount;
        _header = header;
        _description = description;
    }

    private static void addClass(String itemClass, int maxCount, String header, String description) {
        // this class is a default pattern for every add()
        if (has(itemClass)) return;

        ItemMaker itemClassElement = new ItemMaker(itemClass, maxCount, header, description);

        _itemClasses.put(itemClass, itemClassElement);
    }
    public static void make(String itemClass, int maxCount, String header, String description) {
        addClass(itemClass, maxCount, header, description);
    }
    public static void make(String itemClass) {
        addClass(itemClass, DEFAULT_MAX_COUNT, DEFAULT_HEADER, DEFAULT_DESCRIPTION);
    }
    public static void make(String itemClass, int maxCount) {
        addClass(itemClass, maxCount, DEFAULT_HEADER, DEFAULT_DESCRIPTION);
    }
    public static void make(String itemClass, int maxCount, String header) {
        addClass(itemClass, maxCount, header, DEFAULT_DESCRIPTION);
    }
    public static void make(String itemClass, String header) {
        addClass(itemClass, DEFAULT_MAX_COUNT, header, DEFAULT_DESCRIPTION);
    }

    public static Boolean has(String itemClass) {return _itemClasses.containsKey(itemClass);}
    public static ItemMaker get(String itemClass) {return _itemClasses.get(itemClass);}

    public String getItemClass() {
        return _itemClass;
    }
    public int getMaxCount() {
        return _maxCount;
    }
    public String getHeader() {
        return _header;
    }
    public String getDescription() {
        return _description;
    }
}
