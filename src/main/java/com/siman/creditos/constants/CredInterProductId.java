package com.siman.creditos.constants;

public enum CredInterProductId {

	SIMAN("SIMAN",40000),
	PRISMA("PRISMA",40009);

    private int code;
    private String nombre;

    private CredInterProductId(String nombre, int code) {
        this.code = code;
        this.nombre = nombre;
    }

    public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
