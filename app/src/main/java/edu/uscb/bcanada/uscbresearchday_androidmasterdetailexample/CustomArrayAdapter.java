package edu.uscb.bcanada.uscbresearchday_androidmasterdetailexample;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.HashMap;
import java.util.List;

import edu.uscb.bcanada.uscbresearchday_androidmasterdetailexample.dummy.DummyContent;

/**
 * Created by bcanada on 4/14/15.
 */
public class CustomArrayAdapter extends ArrayAdapter<DummyContent.DummyItem> {
    private Context context;
    private int resource;

    HashMap<DummyContent.DummyItem, Integer> mIdMap = new HashMap<>();

    public CustomArrayAdapter(Context context, int resource, int textViewResourceId,
                              List<DummyContent.DummyItem> objects) {
        super(context, resource, textViewResourceId, objects);
        for (int i = 0; i < objects.size(); ++i) {
            mIdMap.put(objects.get(i), i);
        }
        this.context = context;
        this.resource = resource;
    }

    @Override
    public long getItemId(int position) {
        DummyContent.DummyItem item = getItem(position);
        return mIdMap.get(item);
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // http://www.vogella.com/tutorials/AndroidListView/article.html#listview_adapterown

        View view = super.getView(position, convertView, parent);


        if (position == 0) {
            view.setBackgroundColor(Color.argb(128, 26, 131, 233));
        } else if (position > 0 && position < 7 ) {
            view.setBackgroundColor(Color.argb(128, 47, 168, 185));
        } else if (position >= 7 && position < 8 ) {
            view.setBackgroundColor(Color.argb(180, 246, 176, 100));
        } else if (position >= 8 && position < 9 ) {
            view.setBackgroundColor(Color.argb(180, 235, 209, 40));
        } else if (position >= 9 && position < 10 ) {
            view.setBackgroundColor(Color.argb(150, 226, 95, 87));
        } else if (position >= 10 && position < 11 ) {
            view.setBackgroundColor(Color.argb(150, 195, 50, 90));
        } else if (position >= 11 && position < 12 ) {
            view.setBackgroundColor(Color.argb(150, 0, 85, 138));
        }

        return view;
    }

}
