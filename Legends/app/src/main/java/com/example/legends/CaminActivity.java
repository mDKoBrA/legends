package com.example.legends;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import com.example.legends.Model.CategoryModel;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CaminActivity extends NavigationDrawer  implements DatePickerDialog.OnDateSetListener {
    private CategoryModel categoryModel;
    private CategoryModel categoryModel1;
    private CategoryModel categoryModel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Spinner categoriesSpinner = findViewById(R.id.spCategories);
        Spinner categoriesSpinner1 = findViewById(R.id.spCategories1);
        Spinner categoriesSpinner2 = findViewById(R.id.spCategories2);



        categoryModel = getCategoryListMock().get(0);
        categoryModel = getCategoryListMock1().get(0);
        categoryModel = getCategoryListMock2().get(0);

        CategoryAdapter adapter = new CategoryAdapter(this,
                R.layout.spinner_category, getCategoryListMock());
        categoriesSpinner.setAdapter(adapter);

        CategoryAdapter adapter1 = new CategoryAdapter(this,
                R.layout.spinner_category, getCategoryListMock1());
        categoriesSpinner1.setAdapter(adapter1);

        CategoryAdapter adapter2 = new CategoryAdapter(this,
                R.layout.spinner_category, getCategoryListMock2());
        categoriesSpinner2.setAdapter(adapter2);

        Button btnSent = findViewById(R.id.send);
        Button btnDate = findViewById(R.id.btnDate);
        btnDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date Picker");
            }
        });
        btnSent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(CaminActivity.this, "The registration was successful!", Toast.LENGTH_SHORT).show();
                    Intent j = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(j);
                    }
        });

        categoriesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                categoryModel = getCategoryListMock().get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        categoriesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                categoryModel1 = getCategoryListMock1().get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        categoriesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                categoryModel2 = getCategoryListMock2().get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    @Override
    protected int getLayoutRes() { return R.layout.activity_camin; }

    private List<CategoryModel> getCategoryListMock() {
        List<CategoryModel> categoryModel = new ArrayList<>();
        categoryModel.add(new CategoryModel(1, "Caminul 1", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Caminul 2", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Caminul 3", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Caminul 4", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Caminul 5", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Caminul 6", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Caminul 7", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Caminul 8", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Caminul 9", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Caminul 10", R.mipmap.ic_launcher));

        return categoryModel;
    }
    private List<CategoryModel> getCategoryListMock1() {
        List<CategoryModel> categoryModel = new ArrayList<>();
        categoryModel.add(new CategoryModel(1, "Etajul 1", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Etajul 2", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Etajul 3", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Etajul 4", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Etajul 5", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Etajul 6", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Etajul 7", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Etajul 8", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Etajul 9", R.mipmap.ic_launcher));
        categoryModel.add(new CategoryModel(1, "Etajul 10", R.mipmap.ic_launcher));

        return categoryModel;
    }
    private List<CategoryModel> getCategoryListMock2() {
        List<CategoryModel> categoryModel2 = new ArrayList<>();
        categoryModel2.add(new CategoryModel(1, "Camera 1", R.mipmap.ic_launcher));
        categoryModel2.add(new CategoryModel(1, "Camera 2", R.mipmap.ic_launcher));
        categoryModel2.add(new CategoryModel(1, "Camera 3", R.mipmap.ic_launcher));
        categoryModel2.add(new CategoryModel(1, "Camera 4", R.mipmap.ic_launcher));
        categoryModel2.add(new CategoryModel(1, "Camera 5", R.mipmap.ic_launcher));
        categoryModel2.add(new CategoryModel(1, "Camera 6", R.mipmap.ic_launcher));
        categoryModel2.add(new CategoryModel(1, "Camera 7", R.mipmap.ic_launcher));
        categoryModel2.add(new CategoryModel(1, "Camera 8", R.mipmap.ic_launcher));
        categoryModel2.add(new CategoryModel(1, "Camera 9", R.mipmap.ic_launcher));
        categoryModel2.add(new CategoryModel(1, "Camera 10", R.mipmap.ic_launcher));

        return categoryModel2;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        long date = c.getTimeInMillis();

        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
        Button btnDate = findViewById(R.id.btnDate);
        btnDate.setText(currentDateString);
    }

}
