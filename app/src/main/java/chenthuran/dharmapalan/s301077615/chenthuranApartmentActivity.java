package chenthuran.dharmapalan.s301077615;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;


public class chenthuranApartmentActivity extends AppCompatActivity {

    ArrayList<String> chkboxOptions = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chenthuranaparment);

        CheckBox checkBoxA = (CheckBox) findViewById(R.id.chenckb1);
        checkBoxA.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.apartmentaddy1)+ "-" + "$1,850");
            }
        });

        CheckBox checkBoxB = (CheckBox) findViewById(R.id.chenckb2);
        checkBoxB.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.apartmentaddy2)+ "-" + "$1,850");
            }
        });

        CheckBox checkBoxC = (CheckBox) findViewById(R.id.chenckb3);
        checkBoxC.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.apartmentaddy3)+ "-" + "$2,495");
            }
        });

        CheckBox checkBoxD = (CheckBox) findViewById(R.id.chenckb4);
        checkBoxD.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.apartmentaddy4)+ "-" + "$2,050");
            }
        });

        CheckBox checkBoxE = (CheckBox) findViewById(R.id.chenckb5);
        checkBoxE.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.apartmentaddy5)+ "-" + "$2,500");
            }
        });


        Button nextButton = findViewById(R.id.chenNextbtn);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chenthuranApartmentActivity.this, chenthuranCheckoutActivity.class);
                intent.putExtra("selectedApt", chkboxOptions);
                startActivity(intent);
            }
        });


    }

}