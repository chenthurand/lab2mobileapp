package chenthuran.dharmapalan.s301077615;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

import java.net.Inet4Address;


public class chenthuranSecondScreenActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_chenthuran_secondscreen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.chenthuranmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;

        switch (item.getItemId()) {
            case R.id.chenthuranAppartment:
                intent = new Intent(this,chenthuranApartmentActivity.class);
              startActivity(intent);
                return true;
            case R.id.chenthurandetached:
                intent = new Intent(this,chenthuranDetachedActivity.class);
                startActivity(intent);
                return true;
            case R.id.chenthuransemi:
                intent = new Intent(this,chenthuranSemiDetachedActivity.class);
                startActivity(intent);
                return true;
            case R.id.chenthurancondo:
                intent = new Intent(this,chenthuranCondoActivity.class);
                startActivity(intent);
                return true;
            case R.id.chenthurantownhouse:
                intent = new Intent(this,chenthuranTownhouseActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}