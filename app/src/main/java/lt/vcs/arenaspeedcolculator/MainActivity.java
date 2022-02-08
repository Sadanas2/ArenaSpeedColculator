package lt.vcs.arenaspeedcolculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    //    Programa bus laikoma, kad veikia jei:
//    1)Vartotojas galės suvesti reikiamus duomenis
//    2)Programa pati apskaičiuos reikiamas reikšmes
//    3)Vartotojas galės išsaugoti savo team su reikiamais speed'ais.

    private Button colculatorbutton;
    private Button stbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colculatorbutton = findViewById(R.id.colculatorbutton);
        stbutton= findViewById(R.id.stbutton);

        
        setUpColculatorButton();
        setUpSTButton();
    }

    private void setUpColculatorButton() {
        colculatorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);

            }
        });
    }

    private void setUpSTButton() {
        stbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, SavedTeams.class);
                startActivity(intent2);

            }
        });
    }
}