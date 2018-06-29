package com.example.administrator.custbottomtoolbar;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout linFirst,lineSecond,linone,lintwo,linthree,linfour,linfive,linmore;
    LinearLayout linerLess;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        linFirst=(LinearLayout) findViewById(R.id.linerFirst);
        lineSecond=(LinearLayout) findViewById(R.id.linerSecond);

        linmore=(LinearLayout) findViewById(R.id.linerMore);
        linerLess=(LinearLayout) findViewById(R.id.linerLess);

        linone=(LinearLayout) findViewById(R.id.linerOne);
        lintwo=(LinearLayout) findViewById(R.id.linerTwo);
        linthree=(LinearLayout) findViewById(R.id.linerThree);
        linfour=(LinearLayout) findViewById(R.id.linerFour);
        linfive=(LinearLayout) findViewById(R.id.linerFive);


        linone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"ONE",Toast.LENGTH_SHORT).show();
            }
        });

        lintwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"TWO",Toast.LENGTH_SHORT).show();
            }
        });

        linthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"THREE",Toast.LENGTH_SHORT).show();
            }
        });

        linfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"FOUR",Toast.LENGTH_SHORT).show();
            }
        });

        linfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"FIVE",Toast.LENGTH_SHORT).show();
            }
        });

        linmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linFirst.setVisibility(View.VISIBLE);

                LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        3
                );
                lineSecond.setLayoutParams(param);

                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                layoutParams.setMargins(0, 3, 0, 0);
                lineSecond.setLayoutParams(layoutParams);

                linmore.setVisibility(View.GONE);
                linerLess.setVisibility(View.VISIBLE);
            }
        });

        linerLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linFirst.setVisibility(View.GONE);

                LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        6
                );
                lineSecond.setLayoutParams(param);
                linmore.setVisibility(View.VISIBLE);
                linerLess.setVisibility(View.GONE);
            }
        });
    }
}
