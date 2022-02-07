package lt.vcs.arenaspeedcolculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class SavedTeams extends MainActivity {

    private TextView chamsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        chamsList= findViewById(R.id.chamsList);
//        noteContentEditText
    }
}
