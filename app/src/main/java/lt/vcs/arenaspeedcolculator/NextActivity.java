package lt.vcs.arenaspeedcolculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class NextActivity extends MainActivity {
    private Button mainchampbutton;
    private Button secondbchampbutton;
    private Button thirdchampbutton;
    private Button fourthchampbutton;

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
