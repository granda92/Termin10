package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.sun.org.apache.xpath.internal.functions.FuncGenerateId;

@DatabaseTable (tableName = "avion")
public class Avion {
    private static final String POLJE_OZNAKA = "oznaka";
    private static final String POLJE_RASPON_KRILA = "rasponKrila";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_OZNAKA, canBeNull = false)
    private String oznaka;

    @DatabaseField(columnName = POLJE_RASPON_KRILA, canBeNull = false)
    private int rasponKrila;

    @ForeignCollectionField(foreignFieldName = "roba")
    private ForeignCollection<Roba> listaRobe;

    public Avion() {
    }

    public Avion(String oznaka, int rasponKrila) {
        this.oznaka = oznaka;
        this.rasponKrila = rasponKrila;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(int rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    public ForeignCollection<Roba> getListaRobe() {
        return listaRobe;
    }

    public void setListaRobe(ForeignCollection<Roba> listaRobe) {
        this.listaRobe = listaRobe;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", oznaka='" + oznaka + '\'' +
                ", rasponKrila=" + rasponKrila +
                '}';
    }
}
