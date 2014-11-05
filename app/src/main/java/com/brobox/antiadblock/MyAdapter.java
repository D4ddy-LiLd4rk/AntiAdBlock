package com.brobox.antiadblock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Daniel on 05.11.2014.
 */
public class MyAdapter extends BaseAdapter {

    private final Context context;
    private final List<AdBlockerApp> values;

    public MyAdapter(Context context, List<AdBlockerApp> values) {
        this.context = context;
        this.values = values;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_item, parent, false);
        TextView textBoolean = (TextView) view.findViewById(R.id.textBoolean);
        TextView textName = (TextView) view.findViewById(R.id.textName);
        textBoolean.setText(String.valueOf(values.get(position).isInstalled()));
        textName.setText(values.get(position).getPackageName());

        return view;
    }
}
