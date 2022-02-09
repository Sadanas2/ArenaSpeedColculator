package lt.vcs.arenaspeedcolculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import lt.vcs.arenaspeedcolculator.champsrepository.ChampionsWindow;

public class NextActivity extends MainActivity {
    protected Button mainChampButton, secondbChampButton, thirdChampButton, fourthChampButton,firstChampAllSpeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setUpUi();

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
        mainChampButton.setText(value);
    }

    private void setUpMainChampButton() {
        mainChampButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                startActivity(intent);
            }
        });
    }
    private void setUpSecondChampionButton() {
        secondbChampButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                startActivity(intent);
            }
        });
    }
    private void setUpThirdChampionButton() {
        thirdChampButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                startActivity(intent);
            }
        });
    }
    private void setUpfourthChampionButton() {
        fourthChampButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                startActivity(intent);
            }
        });
    }
    private void setUpUi(){
        mainChampButton = findViewById(R.id.mainChampButton);
        secondbChampButton = findViewById(R.id.secondChampButton);
        thirdChampButton = findViewById(R.id.thirdChampButton);
        fourthChampButton = findViewById(R.id.fourthChampButton);
        firstChampAllSpeed = findViewById(R.id.fourthChampButton);

    }
}
