package com.example.solarcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
   List<Energy> energyList = new ArrayList<>();
   RecyclerView recyclerView;
   ConsumptionAdapter mAdapter;

    @BindView(R.id.appliance_name)
    EditText mApplianceName;
    @BindView(R.id.appliance_count)
    EditText mApplianceCount;
    @BindView(R.id.appliance_energy)
    EditText mApplianceEnergy;
    @BindView(R.id.addbtn)
    Button addbtn;
    @BindView(R.id.closebtn)
    Button closebtn;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind the views
        ButterKnife.bind(this);

        //recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //mAdapter = new ConsumptionAdapter(energyList);

        /*
        This should create a static list at oncreate
         */
        //energyList.add(new Energy("Television", "3", "30"));
        //energyList.add("Ceiling", "15", "30");
        //energyList.add("Laptop", "");
        //int insertIndex = 1;


        /*
        Be sure to create the recyclerview that will show your data
         */


        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mApplianceName.getText().toString();
                String count = mApplianceCount.getText().toString();
                String energy = mApplianceEnergy.getText().toString();

                //After onclick
                energyList.add(new Energy(name, count, energy));
                Toast.makeText(MainActivity.this, name + " "
                        + count + " " + energy, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
