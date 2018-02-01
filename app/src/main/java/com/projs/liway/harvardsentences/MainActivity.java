package com.projs.liway.harvardsentences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int NUMBER_OF_LISTS = 72;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.list_textView);
        Button button = (Button) findViewById(R.id.random_button);
        final int[] resources = {R.raw.hs_01, R.raw.hs_02, R.raw.hs_03, R.raw.hs_04, R.raw.hs_05,
                R.raw.hs_06, R.raw.hs_07, R.raw.hs_08, R.raw.hs_09, R.raw.hs_10, R.raw.hs_11,
                R.raw.hs_12, R.raw.hs_13, R.raw.hs_14, R.raw.hs_15, R.raw.hs_16, R.raw.hs_17,
                R.raw.hs_18, R.raw.hs_19, R.raw.hs_20, R.raw.hs_21, R.raw.hs_22, R.raw.hs_23,
                R.raw.hs_24, R.raw.hs_25, R.raw.hs_26, R.raw.hs_27, R.raw.hs_28, R.raw.hs_29,
                R.raw.hs_30, R.raw.hs_31, R.raw.hs_32, R.raw.hs_33, R.raw.hs_34, R.raw.hs_35,
                R.raw.hs_36, R.raw.hs_37, R.raw.hs_38, R.raw.hs_39, R.raw.hs_40, R.raw.hs_41,
                R.raw.hs_42, R.raw.hs_43, R.raw.hs_44, R.raw.hs_45, R.raw.hs_46, R.raw.hs_47,
                R.raw.hs_48, R.raw.hs_49, R.raw.hs_50, R.raw.hs_51, R.raw.hs_52, R.raw.hs_53,
                R.raw.hs_54, R.raw.hs_55, R.raw.hs_56, R.raw.hs_57, R.raw.hs_58, R.raw.hs_59,
                R.raw.hs_60, R.raw.hs_61, R.raw.hs_62, R.raw.hs_63, R.raw.hs_64, R.raw.hs_65,
                R.raw.hs_66, R.raw.hs_67, R.raw.hs_68, R.raw.hs_69, R.raw.hs_70, R.raw.hs_71,
                R.raw.hs_72};

        // initial list presented to user open running app is already random
        textView.setText(Utils.readFileFromRaw(this,
                resources[Utils.randomNum(NUMBER_OF_LISTS)]));
        // upon pressing button "Random List", textView is updated with a random list
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(Utils.readFileFromRaw(getApplicationContext(),
                        resources[Utils.randomNum(NUMBER_OF_LISTS)]));
            }
        });

    }
}
