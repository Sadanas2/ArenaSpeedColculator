package lt.vcs.arenaspeedcolculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import lt.vcs.arenaspeedcolculator.champsrepository.ChampionsWindow;

public class NextActivity extends MainActivity {
    protected Button mainChampButton, secondbChampButton, thirdChampButton, fourthChampButton,firstChampAllSpeed,saveButton, secondChampNeededSpeedButton,thirdChampNeededSpeedButton,fourthChampNeededSpeedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setUpUi();

        setUpMainChampButton();
        setUpSecondChampionButton();
        setUpThirdChampionButton();
        setUpfourthChampionButton();
        setUpSaveButton();
        setUpFirstChampAllSpeed();

    }
    @Override
    public void onStart() {
        super.onStart();

        Bundle extras = getIntent().getExtras();
        String value1 = "";
        String value2 = "";;
        if (extras != null) {
            value1 = extras.getString("cb");
            value2 = extras.getString("cb");
        }
        mainChampButton.setText(value1);
        secondbChampButton.setText(value2);
    }

    private void setUpMainChampButton() {
        mainChampButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                intent.putExtra("cb", 1);
                startActivity(intent);
            }
        });
    }
    private void setUpSecondChampionButton() {
        secondbChampButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this, ChampionsWindow.class);
                intent.putExtra("cb", 2);
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
    private void setUpFirstChampAllSpeed(){

    }

    private void setUpSaveButton(){
    }

    private void setUpUi(){
        mainChampButton = findViewById(R.id.mainChampButton);
        secondbChampButton = findViewById(R.id.secondChampButton);
        thirdChampButton = findViewById(R.id.thirdChampButton);
        fourthChampButton = findViewById(R.id.fourthChampButton);
        saveButton = findViewById(R.id.saveButton);
        firstChampAllSpeed = findViewById(R.id.firstChampAllSpeed);
        secondChampNeededSpeedButton = findViewById(R.id.secondChampNeededSpeedButton);
        thirdChampNeededSpeedButton = findViewById(R.id.thirdChampNeededSpeedButton);
        fourthChampNeededSpeedButton = findViewById(R.id.fourthChampNeededSpeedButton);

    }
}
