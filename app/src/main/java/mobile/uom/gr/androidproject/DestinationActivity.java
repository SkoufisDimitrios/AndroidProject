package mobile.uom.gr.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Class that allows user to select a destination city
 */

public class DestinationActivity extends AppCompatActivity implements AirportFinderFragment.OnDataPass {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);
        setTitle(R.string.activity_destination);
    }

    @Override // we must implement this cause of the interface
    public void onDataPass(String airport) {
        // this method takes data from fragment
        // the airport variable contains the string of the list item that user clicked
        Intent output = new Intent();
        output.putExtra("AIRPORT", airport);

        // Not pretty way to take the airport code but it works
        // because airport code is always the first 3 chars! ex SKG - Thessaloniki - [SKG]
        String airport_code = Character.toString(airport.charAt(0)) +
                Character.toString(airport.charAt(1)) +
                Character.toString(airport.charAt(2));
        output.putExtra("CODE", airport_code);
        output.putExtra("CHECK", "DESTINATION_AIRPORT"); // adding the code for onActivityResult to know which Activity
        setResult(1, output);                            // returned the data
        finish();
    }
}
