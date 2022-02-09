package lt.vcs.arenaspeedcolculator.champsrepository;

import android.content.Context;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import lt.vcs.arenaspeedcolculator.champsrepository.Champ;
import lt.vcs.arenaspeedcolculator.champsrepository.ChampDao;
import lt.vcs.arenaspeedcolculator.champsrepository.ChampsDataBase;

public class UseCaseRepository {

    ChampDao champDao;

    public UseCaseRepository(Context context) {
        ChampsDataBase mainDatabase = ChampsDataBase.getDbInstace(context);
        champDao = mainDatabase.champDao();
    }

    public List<Champ> getAll() {
        return champDao.getAll();
    }


    public void insertChamps() {
        champDao.insertChamps(makeChampList(17));
    }

    public void insertChamp(Champ champs) {
        champDao.insertChamp(champs);
    }

    public Champ getItem(int id) {
        return champDao.getItem(id);
    }
    public Champ getChampName(String name) {
        return champDao.getChampName(name);
    }

    @NonNull
    public List<Champ> makeChampList(int count) {
        List<Champ> champslist = new ArrayList<>();

        champslist.add((Champ) new Champ(1, "Arbiter", 110, 30, 0.3f));
        champslist.add((Champ) new Champ(2, "Siphi the Lost Bride", 114, 0, 0.1f));
        champslist.add((Champ) new Champ(3, "Deacon Armstrong", 100, 19, 0.3f));
        champslist.add((Champ) new Champ(4, "Apothecary", 106, 0, 0.15f));
        champslist.add((Champ) new Champ(5, "Gorgorab", 97, 23, 0.15f));
        champslist.add((Champ) new Champ(6, "Seeker", 103, 0, 0.3f));
        champslist.add((Champ) new Champ(7, "Trunda Giltmallet", 100, 0, 0));
        champslist.add((Champ) new Champ(8, "Ninja", 100, 0, 0));
        champslist.add((Champ) new Champ(9, "Foli", 105, 0, 0));
        champslist.add((Champ) new Champ(10, "Dracomorph", 98, 0, 0));
        champslist.add((Champ) new Champ(11, "Ghostborn", 101, 0, 0));
        champslist.add((Champ) new Champ(12, "Umbral Enchantress", 93, 0, 0));
        champslist.add((Champ) new Champ(13, "Seer", 104, 0, 0));
        champslist.add((Champ) new Champ(14, "Magnarr", 100, 0, 0));
        champslist.add((Champ) new Champ(15, "Zargala", 103, 0, 0));
        champslist.add((Champ) new Champ(16, "Stag Knight", 100, 0, 0));
        champslist.add((Champ) new Champ(17, "Aleksandr the Sharpshooter", 100, 0, 0));

        return champslist;
    }
}
