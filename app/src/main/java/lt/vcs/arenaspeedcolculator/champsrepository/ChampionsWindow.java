package lt.vcs.arenaspeedcolculator.champsrepository;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.List;
import lt.vcs.arenaspeedcolculator.NextActivity;
import lt.vcs.arenaspeedcolculator.R;


public class ChampionsWindow extends NextActivity {

    ListView champsListView;
    private ArrayAdapter<Champ> arrayAdapter;
    private List<Champ> champslist;
    private UseCaseRepository useCaseRepository;
    String zz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        useCaseRepository = new UseCaseRepository(getApplicationContext());
        champsListView= findViewById(R.id.champsListView);




        useCaseRepository.insertChamps();
        champslist = useCaseRepository.getAll();

        setUpListView(champsListView);
        onClickItem(champsListView);

    }
    @Override
    public void onStart() {
        super.onStart();

        Bundle extras = getIntent().getExtras();
        int value=0;
        if (extras!=null){
            value = extras.getInt("cb");
        }
        int zz= value;

    }

    private void setUpListView(ListView champsListView) {
        arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_list_champ, champslist);
        champsListView.setAdapter(arrayAdapter);
    }
    private void onClickItem(ListView champsListView) {
        champsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ChampionsWindow.this, NextActivity.class);
                intent.putExtra("buttontxt", champslist.get(position).getName());
                intent.putExtra("cb", zz);

                startActivity(intent);
            }
        });
    }
}
