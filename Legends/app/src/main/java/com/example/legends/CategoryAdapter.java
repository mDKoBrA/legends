package com.example.legends;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.legends.Model.CategoryModel;

import java.util.List;

public class CategoryAdapter extends ArrayAdapter<CategoryModel> {
    private final LayoutInflater mInflater;
    private final List<CategoryModel> items;
    private final int mResource;

    CategoryAdapter(@NonNull Context context, int resource, @NonNull List<CategoryModel> objects) {
        super(context, resource, objects);
        mInflater = LayoutInflater.from(context);
        mResource = resource;
        items = objects;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return createItemView(position, parent);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return createItemView(position, parent);
    }

    private View createItemView(int position, ViewGroup parent) {
        final View view = mInflater.inflate(mResource, parent, false);
        ImageView listIcon = view.findViewById(R.id.category_icon);
        TextView listItem = view.findViewById(R.id.category_name);

        CategoryModel categoryModelData = items.get(position);

        listIcon.setId(categoryModelData.getIcon());
        listItem.setText(categoryModelData.getName());
        listIcon.setImageDrawable(listIcon.getResources().getDrawable(categoryModelData.getIcon()));

        return view;
    }
}
