package guadarrama_jorge.books.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<>();
/*
    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }
*/
    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position)+String.valueOf(position),String.valueOf(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String book_name;
        public final String meaning;
        public final String image;

        public DummyItem(String id, String book_name, String meaning, String image) {
            this.id = id;
            this.book_name = book_name;
            this.meaning = meaning;
            this.image = image;
        }

        @Override
        public String toString() {
            return meaning;
        }
    }


    static {
        addItem(new DummyItem("1", "Harry Potter", "Everybody knows the series", "https://en.wikipedia.org/wiki/File:Harry_Potter_and_the_Goblet_of_Fire.jpg"));
        addItem(new DummyItem("2", "Pedro Paramo", "A classic", "https://en.wikipedia.org/wiki/File:Pedro_P%C3%A1ramo.jpg"));
        addItem(new DummyItem("3", "El Psicoanalista", "Sublime", "http://www.quelibroleo.com/images/libros/libro_1333101559.jpg"));
    }
}