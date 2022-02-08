package lt.vcs.arenaspeedcolculator;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;
@Dao
public interface ChampDao {

    @Query("SELECT * FROM champss")
    List<Champ> getAll();

    @Query("SELECT * FROM champss WHERE id IN (:userIds)")
    List<Champ> loadAllByIds(int[] userIds);


    @Query("SELECT * FROM " + "champss" + " WHERE id =:id")
    Champ getItem(int id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertChamps(List<Champ> champslist);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertChamp(Champ champs);

    @Query("DELETE FROM " + "champss" + " WHERE id =:id")
    void deleteItem(int id);

}
