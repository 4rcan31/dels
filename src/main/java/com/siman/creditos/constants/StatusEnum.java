package com.siman.creditos.constants;

public enum StatusEnum {
	 	ACTIVE(1, "ACTIVO"),
	    INACTIVE(2, "INACTIVO");

	    private int id;
	    private String nombre;

	    private StatusEnum(int id, String nombre) {
	        this.id = id;
	        this.nombre = nombre;
	    }

	    public StatusActiveEnum valueOf(int id) {
	        for (StatusActiveEnum s : StatusActiveEnum.values()) {
	            if (s.getId() == id) {
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
	    
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
}
