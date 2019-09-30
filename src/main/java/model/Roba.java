package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "roba")
public class Roba {
    private static final String POLJE_NAZIV = "naziv";
    private static final String POLJE_OPIS = "opis";
    private static final String POLJE_TEZINA = "tezina";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_NAZIV, canBeNull = false)
    private  String naziv;

    @DatabaseField(columnName = POLJE_OPIS, canBeNull = false)
    private String opis;

    @DatabaseField(columnName = POLJE_TEZINA, canBeNull = false)
    private  double tezina;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private Avion avion;

    public Roba() {
    }

    public Roba(String naziv, String opis, double tezina) {
        this.naziv = naziv;
        this.opis = opis;
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        return "Roba{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", tezina=" + tezina +
                '}';
    }
}
