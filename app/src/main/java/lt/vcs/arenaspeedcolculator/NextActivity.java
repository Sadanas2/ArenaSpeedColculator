package lt.vcs.arenaspeedcolculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import lt.vcs.arenaspeedcolculator.champsrepository.ChampionsWindow;

public class NextActivity extends MainActivity {
    protected Button mainchampbutton,secondbchampbutton,thirdchampbutton,fourthchampbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainchampbutton = findViewById(R.id.mainchampbutton);
        secondbchampbutton = findViewById(R.id.secondbchampbutton);
        thirdchampbutton = findViewById(R.id.thirdchampbutton);
        fourthchampbutton = findViewById(R.id.fourthchampbutton);

        setUpMainChampButton();
        setUpSecondChampionButton();
        setUpThirdChampionButton();
        setUpfourthChampionButton();


    }
    @Override
    public void onStart() {
        super.onStart();

        Bundle extras = getIntent().getExtras();
        String value = "";
        if (extras != null) {
            value = extras.getString("buttontxt");
        }
        mainchampbutton.setText(value);
    }

    private void setUpMainChampButton() {
        mainchampbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                startActivity(intent);
            }
        });
    }
    private void setUpSecondChampionButton() {
        secondbchampbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                startActivity(intent);
            }
        });
    }
    private void setUpThirdChampionButton() {
        thirdchampbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                startActivity(intent);
            }
        });
    }
    private void setUpfourthChampionButton() {
        fourthchampbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                startActivity(intent);
            }
        });
    }
}
