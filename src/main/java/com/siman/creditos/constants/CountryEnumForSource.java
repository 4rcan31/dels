package com.siman.creditos.constants;

public enum CountryEnumForSource {

    SV(1, "SV", "El Salvador ARCA"),
    SVS(6, "SVS", "El Salvador SUNNEL"),
    GT(2, "GT", "Guatemala"),
    NI(4, "NI", "Nicaragua"),
    CR(5, "CR", "Costa Rica");

    private int id;
    private String iso;
    private String nombre;

    private CountryEnumForSource(int id, String iso, String nombre) {
        this.id = id;
        this.iso = iso;
        this.nombre = nombre;
    }

    public CountryEnumForSource valueOf(int id) {
        for (CountryEnumForSource c : CountryEnumForSource.values()) {
            if (c.id == id) {
                return c;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
