package com.mrityunjai.adapter.custom.customadapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by iota on 12/15/2016.
 */

public class AndroidFlavorAdapter extends ArrayAdapter<AndroidFlavor> {
    public AndroidFlavorAdapter(Activity context, ArrayList<AndroidFlavor> androidFlavors) {
        super(context, 0, androidFlavors);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        AndroidFlavor currentAndroidFlavor = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);

        nameTextView.setText(currentAndroidFlavor.getVersionName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);

        numberTextView.setText(currentAndroidFlavor.getVersionNumber());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        iconView.setImageResource(currentAndroidFlavor.getImageResourceId());

        return listItemView;

    }
}
