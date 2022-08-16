package lt.vcs.arenaspeedcolculator.champsrepository;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import lt.vcs.arenaspeedcolculator.champsrepository.Champ;

@Dao
public interface ChampDao {

    @Query("SELECT * FROM champss")
    List<Champ> getAll();

    @Query("SELECT * FROM " + "champss" + " WHERE id =:id")
    Champ getItem(int id);

    @Query("SELECT * FROM " + "champss" + " WHERE champ_name =:name")
    Champ getChampName(String name);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertChamps(List<Champ> champslist);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertChamp(Champ champs);



}
