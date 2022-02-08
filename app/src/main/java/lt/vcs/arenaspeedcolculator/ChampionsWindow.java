package lt.vcs.arenaspeedcolculator;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;


public class ChampionsWindow extends MainActivity {

    ListView champsListView;
    private ArrayAdapter<Champ> arrayAdapter;
    private List<Champ> champslist;
    private UseCaseRepository useCaseRepository;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        useCaseRepository = new UseCaseRepository(getApplicationContext());

        champsListView= findViewById(R.id.champsListView);

        useCaseRepository.insertChamps();
        champslist = useCaseRepository.getAll();

        setUpListView(champsListView);
    }

    private void setUpListView(ListView champsListView) {
        arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_list_champ, champslist);
        champsListView.setAdapter(arrayAdapter);
    }

}
