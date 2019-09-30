package model;

import com.j256.ormlite.field.DatabaseField;
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



}
