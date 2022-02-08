package lt.vcs.arenaspeedcolculator.champsrepository;



import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "champss")

public class  Champ {

    @PrimaryKey
    private int id;

    @ColumnInfo(name = "champ_name")
    private String name;

    @ColumnInfo (name = "baseSpeed")
    private int baseSpeed;

    @ColumnInfo (name = "aura")
    private int aura;

    @ColumnInfo (name = "fills")
    private float fills;

    public Champ(int id, String name, int baseSpeed, int aura, float fills) {
        this.id= id;
        this.name = name;
        this.baseSpeed = baseSpeed;
        this.aura = aura;
        this.fills = fills;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getBaseSpeed() { return baseSpeed; }

    public void setBaseSpeed(int baseSpeed) { this.baseSpeed = baseSpeed; }

    public int getAura() { return aura; }

    public void setAura(int aura) { this.aura = aura; }

    public float getFills() { return fills; }

    public void setFills(float fills) { this.fills = fills; }

    @Override
    public String toString() {
        return name +
                "(" + baseSpeed +
                ") " + aura +
                "% / +" + fills + "%";
    }
}
