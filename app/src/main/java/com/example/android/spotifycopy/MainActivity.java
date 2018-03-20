package com.example.android.spotifycopy;

import android.app.PictureInPictureParams;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /** Declaration
     *
     */

    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textsong);

    }


    //Some Codes were added for changing Text at onc place, but it
    // leads to crash app so removed. will be added soon

    /**
     *
     * Alternate for previous code.
     * When button click it will change the text like
     * which song is playing at the current moment on the onclick of Song(Button)
     *
     */

    public void buttonOnClick(View v) {

        switch (v.getId()) {
            case R.id.zombie:
                //DO something
                text.setText("Zombie");
                break;

            case R.id.kingprincess:
                //DO something
                text.setText("1950 King princess");
                break;

            case R.id.mine:
                //DO something
                text.setText("Mine");
                break;

            case R.id.friends:
                //DO something
                text.setText("Mine");
                break;

            case R.id.believe:
                //DO something
                text.setText("Mine");
                break;

            case R.id.moodbooster:
                //DO something
                text.setText("Mine");
                break;

            case R.id.dreamyvibes:
                //DO something
                text.setText("Mine");
                break;

            case R.id.confidenceboost:
                //DO something
                text.setText("Mine");
                break;

            case R.id.relax:
                //DO something
                text.setText("Mine");
                break;

            // To be continue
        }

    }

}