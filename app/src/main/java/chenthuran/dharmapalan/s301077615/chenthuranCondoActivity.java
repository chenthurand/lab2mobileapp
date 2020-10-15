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


public class chenthuranCondoActivity extends AppCompatActivity {

    ArrayList<String> chkboxOptions = new ArrayList<>();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chenthurancondo);


        CheckBox checkBoxA = (CheckBox) findViewById(R.id.chenCondockb1);
        checkBoxA.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.condoAddy1)+ "-" + "$2,850,000");
            }
        });
        CheckBox checkBoxB = (CheckBox) findViewById(R.id.chenCondockb2);
        checkBoxB.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.condo2addy)+ "-" + "$895,000");
            }
        });
        CheckBox checkBoxC = (CheckBox) findViewById(R.id.chenCondockb3);
        checkBoxC.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.condo3)+ "-" + "$519,000");
            }
        });
        CheckBox checkBoxD = (CheckBox) findViewById(R.id.chenCondockb4);
        checkBoxD.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.condoaddy4)+ "-" + "$575,000");
            }
        });

        CheckBox checkBoxE = (CheckBox) findViewById(R.id.chenCondockb5);
        checkBoxE.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                    chkboxOptions.add(getResources().getString(R.string.condo5)+ "-" + "$1,399,000");
            }
        });


        Button nextButton = findViewById(R.id.chencondonxtBtn);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chenthuranCondoActivity.this, chenthuranCheckoutActivity.class);
                intent.putExtra("selectedApt", chkboxOptions);
                startActivity(intent);
            }
        });


    }


}