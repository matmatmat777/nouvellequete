package com.example.apprenti.nouvellequete;
<<<<<<< HEAD
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity {

    EditText nom;
    EditText prenom;
    Button button;
    CheckBox checkBox;
    TextView felicitation;
=======

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import static com.example.apprenti.nouvellequete.R.id.boutonV;

public class MainActivity extends Activity {
>>>>>>> 7c3c5075bf7742b8b005f9bca09e1edc9ccb7b73


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
         nom = (EditText) findViewById(R.id.nom);
         prenom = (EditText) findViewById(R.id.prenom);
         button = (Button) findViewById(R.id.button);
         checkBox = (CheckBox) findViewById(R.id.checkBox);
         felicitation = (TextView) findViewById(R.id.felicitation);


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                nom.setEnabled(checkBox.isChecked());
                prenom.setEnabled(checkBox.isChecked());
                button.setEnabled(checkBox.isChecked());
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {



                nom.getText().toString();
                prenom.getText().toString();

                if (nom.length() != 0 && prenom.length() != 0){
                    felicitation.setText("Félicitations " + nom.getText()+" " + prenom.getText());
                    felicitation.setVisibility(View.VISIBLE);

                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Tu dois renseigner le nom et le prenom!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast =Toast.makeText(context,text,duration);
                    toast.show();


                }

            }
        });
    }
});
    } }
=======
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
>>>>>>> 7c3c5075bf7742b8b005f9bca09e1edc9ccb7b73
