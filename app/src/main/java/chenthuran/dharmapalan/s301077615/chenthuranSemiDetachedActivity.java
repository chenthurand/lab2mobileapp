package chenthuran.dharmapalan.s301077615;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;


public class chenthuranSemiDetachedActivity extends AppCompatActivity {


    ArrayList<String> chkboxOptions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chenthuran_semidetached);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.chensemidetachedckb1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.semideta1) + " - " + getResources().getString(R.string.semiaddy1price));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.chensemidetachedckb2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.chensemiaddy2) + " - " + getResources().getString(R.string.semiaddy2price));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.chensemidetachedckb3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.semiaddy3) + " - " + getResources().getString(R.string.semiaddy3price));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.chensemidetachedckb4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.semiaddy4) + " - " + getResources().getString(R.string.semiaddy4));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.chensemidetachedckb5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.semiaddy5) + " - " + getResources().getString(R.string.chensemiaddy5price));
            }
        });


        Button nextButton = findViewById(R.id.chenseminxtbtn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chenthuranSemiDetachedActivity.this, chenthuranCheckoutActivity.class);
                intent.putExtra("selectedApt", chkboxOptions);
                startActivity(intent);
            }
        });


    }


}