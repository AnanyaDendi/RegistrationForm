package com.example.registrationform;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;
    Spinner sp1;
    ArrayList arrayList1;
    ArrayAdapter arrayAdapter1;

    EditText eddob;
    private Button button3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
            }
        });
        sp=findViewById(R.id.spinner);
        sp1=findViewById(R.id.spinner2);

        eddob= findViewById(R.id.editTextTextPersonName4);

        arrayList=new ArrayList();
        arrayList1=new ArrayList();

        arrayList.add("Select Year"); arrayList.add("1"); arrayList.add("2"); arrayList.add("3"); arrayList.add("4");
        arrayList1.add("Select Dept");arrayList1.add("CSE"); arrayList1.add("IT"); arrayList1.add("EEE"); arrayList1.add("ECE"); arrayList1.add("MECH");

        arrayAdapter=
                new ArrayAdapter(MainActivity.this,
                        android.R.layout.simple_list_item_1,arrayList);
        sp.setAdapter(arrayAdapter);
        arrayAdapter1=
                new ArrayAdapter(MainActivity.this,
                        android.R.layout.simple_list_item_1,arrayList1);
        sp1.setAdapter(arrayAdapter1);


    }

    public void dat(View view) {
        DatePickerDialog datePickerDialog  = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                eddob.setText(i+"/"+i1+"/"+i2);
                eddob.setEnabled(false);
            }
        }, 1999, 0, 1);
        datePickerDialog.show();
    }




}
