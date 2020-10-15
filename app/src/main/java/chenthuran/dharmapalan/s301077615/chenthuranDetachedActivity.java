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


public class chenthuranDetachedActivity extends AppCompatActivity {



    ArrayList<String> chkboxOptions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chenthuran_detached);

        //---CheckBox---
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.chenDetachedckb1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.detachedaddy1) + " - " + getResources().getString(R.string.detachedaddy1Price));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.chenDetachedckb2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.detachedaddy2) + " - " + getResources().getString(R.string.detachedaddy2price));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.chenDetachedckb3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.detachedaddy3) + " - " + getResources().getString(R.string.detachedaddy3price));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.chenDetachedckb4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.detachedaddy4) + " - " + getResources().getString(R.string.detachedaddy4price));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.chenDetachedckb5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.detachedaddy5) + " - " + getResources().getString(R.string.detachedaddy5price));
            }
        });


        Button nextButton = findViewById(R.id.chenDetachednxtBtn);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chenthuranDetachedActivity.this, chenthuranCheckoutActivity.class);
                intent.putExtra("selectedApt", chkboxOptions);
                startActivity(intent);
            }
        });


    }


}