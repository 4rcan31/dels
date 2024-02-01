package com.siman.creditos.constants;

public enum StatusActiveEnum {

    ACTIVE(1, "A", "ACTIVO"),
    INACTIVE(2, "I", "INACTIVO");

    private int id;
    private String iso;
    private String nombre;

    private StatusActiveEnum(int id, String iso, String nombre) {
        this.id = id;
        this.iso = iso;
        this.nombre = nombre;
    }

    public StatusActiveEnum valueOf(int id) {
        for (StatusActiveEnum s : StatusActiveEnum.values()) {
            if (s.id == id) {
                return s;
            }
        }
        return null;
    }

    public StatusActiveEnum valueOfByShort(short idShort) {
        for (StatusActiveEnum s : StatusActiveEnum.values()) {
            if (s.id == idShort) {
                return s;
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
