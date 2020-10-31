package com.example.multiplication_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.multiplication_table.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b=ActivityMainBinding.inflate(getLayoutInflater());
        View v=b.getRoot();
        setContentView(v);


        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getTable(Integer.parseInt(b.input.getText().toString()
                ));
            }
        };

        b.button.setOnClickListener(listener);
    }

    void getTable(int a)
    {
        for (int i=1;i<=10;i++)
        {
            b.table.append(String.format("%d X %d = %d\n",a,i,a*i));
        }
    }
}