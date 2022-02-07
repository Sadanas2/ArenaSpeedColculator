package lt.vcs.arenaspeedcolculator;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import lt.vcs.arenaspeedcolculator.Champ;

@Database(
        entities = {Champ.class},
        version = 1,
        exportSchema = false
)

public abstract class ChampsDataBase extends RoomDatabase {

    private static ChampsDataBase instance;

    public static ChampsDataBase getDbInstace(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context,
                    ChampsDataBase.class,
                    "champs_db"
            )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
    public abstract ChampDao champDao();

}
