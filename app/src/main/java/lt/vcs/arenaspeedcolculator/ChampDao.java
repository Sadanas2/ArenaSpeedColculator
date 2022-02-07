package lt.vcs.arenaspeedcolculator;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;
@Dao
public interface ChampDao {

    @Query("SELECT * FROM champs")
    List<Champ> getAll();

    @Query("SELECT * FROM champs WHERE id IN (:userIds)")
    List<Champ> loadAllByIds(int[] userIds);

}
