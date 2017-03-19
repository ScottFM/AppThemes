package com.example.scott.appthemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Kohawk extends AppCompatActivity implements View.OnClickListener {

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
        setContentView(R.layout.kohawk);

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
                Intent I = new Intent("com.example.Scott.AppThemes.Standard");
                startActivity(I);
                break;
            case R.id.btnNature:
                Intent I2 = new Intent("com.example.Scott.AppThemes.Nature");
                startActivity(I2);
                break;
            case R.id.btnFire:
                Intent I3 = new Intent("com.example.Scott.AppThemes.Fire");
                startActivity(I3);
                break;
            case R.id.btnKohawk:
                Intent I4 = new Intent("com.example.Scott.AppThemes.Kohawk");
                startActivity(I4);
                break;
        }
    }
}
