package mobile.uom.gr.androidproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/*
 * This activity is only for visual and starting the app
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void searchFlights(View view) {
        Intent intent = new Intent(this, SearchFlightsActivity.class);
        startActivity(intent); //start of SearchFlightsActivity.java class to go to criteria selection screens
    }

}