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


public class chenthuranTownhouseActivity extends AppCompatActivity {


    ArrayList<String> chkboxOptions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chenthurantownhouse);


        CheckBox checkBox1 = (CheckBox) findViewById(R.id.chentownckb1);
        checkBox1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.townhouse1) + " - " + getResources().getString(R.string.chentown1price));
            }
        });

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.chentownckb2);
        checkBox2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.chentown2) + " - " + getResources().getString(R.string.chentown2));
            }
        });

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.chentownckb3);
        checkBox3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.chentown3) + " - " + getResources().getString(R.string.chentown3price));
            }
        });

        CheckBox checkBox4 = (CheckBox) findViewById(R.id.chentownckb4);
        checkBox4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.chentown4) + " - " + getResources().getString(R.string.chentown4price));
            }
        });

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.chentownckb5);
        checkBox5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                if (((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.chentown5) + " - " + getResources().getString(R.string.chentown5price));
            }
        });


        Button nextButton = findViewById(R.id.chentownnextbutton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chenthuranTownhouseActivity.this, chenthuranCheckoutActivity.class);
                intent.putExtra("selectedApt", chkboxOptions);
                startActivity(intent);
            }
        });




    }


}