package edu.uscb.bcanada.uscbresearchday_androidmasterdetailexample.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("1", "SRSD Schedule of Events", "http://researchday.uscb.edu/schedule.php"));
        addItem(new DummyItem("2", "Hypothesis-Driven Research", "http://researchday.uscb.edu/get_abstracts_for_category.php?category=Hypothesis-Driven"));
        addItem(new DummyItem("3", "Issue-Based/Descriptive Research", "http://researchday.uscb.edu/get_abstracts_for_category.php?category=Issue%20Based/Descriptive"));
        addItem(new DummyItem("4", "Innovations and Applications", "http://researchday.uscb.edu/get_abstracts_for_category.php?category=Innovation/Application"));
        addItem(new DummyItem("5", "Oral Presentations", "http://researchday.uscb.edu/get_abstracts_for_category.php?category=Literary%20Criticism"));
        addItem(new DummyItem("6", "Visual Arts", "http://researchday.uscb.edu/get_abstracts_for_category.php?category=Visual%20Art"));
        addItem(new DummyItem("7", "All Abstracts", "http://researchday.uscb.edu/get_all_abstracts.php"));
        addItem(new DummyItem("8", "Dedication to Chancellor Upshaw", "http://researchday.uscb.edu/dedication.php"));
        addItem(new DummyItem("9", "About the Keynote Speaker", "http://researchday.uscb.edu/keynote.php"));
        addItem(new DummyItem("10", "Event Sponsors", "http://researchday.uscb.edu/sponsor.php"));
        addItem(new DummyItem("11", "SRSD Information", "http://researchday.uscb.edu"));
        addItem(new DummyItem("12", "USCB Homepage", "http://www.uscb.edu"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String itemName;
        public String url;

        public DummyItem(String id, String itemName, String url) {
            this.id = id;
            this.itemName = itemName;
            this.url = url;
        }

        @Override
        public String toString() {
            return itemName;
        }
    }
}