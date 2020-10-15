package chenthuran.dharmapalan.s301077615;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;


public class chenthuranCheckoutActivity extends AppCompatActivity {

    ArrayList<String> recievedIntent;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chen_checkout);
        recievedIntent = getIntent().getStringArrayListExtra("selectedApt");
        radioGroup = findViewById(R.id.chenRadiogroup);
        getApartmentType(recievedIntent);
    }

    private void getApartmentType(ArrayList<String> dataReceived) {
        for(String item : dataReceived) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(item);
            radioButton.setId(View.generateViewId());
            radioGroup.addView(radioButton);
        }
    }

}