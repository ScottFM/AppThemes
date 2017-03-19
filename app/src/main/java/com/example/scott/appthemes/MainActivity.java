package com.example.scott.appthemes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtTheme;
    Button bStandard, bNature, bFire, bKohawk;

    /*
    Themes
    Standard: #3F51B5, #303F9F, #FF4081
    Nature: #4BE148, #1E8B1C, #025807
    Fire: #F70004, #FFF200, #EEAAAA
    Kohawk: #940C12, #D49F54, #8B6D4C
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    public void initialize() {
        txtTheme = (TextView) findViewById(R.id.txtThemeName);

        bStandard = (Button) findViewById(R.id.btnStandard);
        bStandard.setOnClickListener(this);
        bNature = (Button) findViewById(R.id.btnNature);
        bNature.setOnClickListener(this);
        bFire = (Button) findViewById(R.id.btnFire);
        bFire.setOnClickListener(this);
        bKohawk = (Button) findViewById(R.id.btnKohawk);
        bKohawk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /*Standard: #3F51B5, #303F9F, #FF4081
        Nature: #4BE148, #1E8B1C, #025807
        Fire: #F70004, #FFF200, #EEAAAA
        Kohawk: #940C12, #D49F54, #8B6D4C
        */
        switch (v.getId()) {
            case R.id.btnStandard:
                setContentView(R.layout.activity_main);
                break;
            case R.id.btnNature:
                setContentView(R.layout.nature);
                break;
            case R.id.btnFire:
                setContentView(R.layout.fire);
                break;
            case R.id.btnKohawk:
                setContentView(R.layout.kohawk);
                break;
        }
    }
}
