package com.siman.creditos.constants;

public enum InscriptionStatus {
	P("PENDIENTE","P"),
	F("FINALIZADO","F"),
	E("ERROR","E");

    private String code;
    private String name;

    private InscriptionStatus(String name,String code) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
