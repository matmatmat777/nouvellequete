package com.example.apprenti.nouvellequete;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import static com.example.apprenti.nouvellequete.R.id.boutonV;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        final EditText nom = (EditText) findViewById(R.id.nom);
        final EditText prenom = (EditText) findViewById(R.id.prenom);

        nom.setEnabled(false);
        prenom.setEnabled(false);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){

                nom.setEnabled(checkBox.isChecked());
                prenom.setEnabled(checkBox.isChecked());
                boutonV.setEnabled(checkBox.isChecked());
            }
        });

    }




}
