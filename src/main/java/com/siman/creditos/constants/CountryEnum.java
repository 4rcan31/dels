package com.siman.creditos.constants;

public enum CountryEnum {
	
	SV (1, "SV", "El Salvador",40000),
	GT (2, "GT", "Guatemala",40001),
	NI (4, "NI", "Nicaragua",40003),
	CR (5, "CR", "Costa Rica",40006);
	
	int id;
	String iso;
	String nombre;
	int credinterId;
	
	private CountryEnum(int id, String iso, String nombre,int credinterId) {
		this.id=id;
		this.iso=iso;
		this.nombre=nombre;
		this.credinterId=credinterId;
	}
	
	public CountryEnum valueOf(int id){
		for(CountryEnum c : CountryEnum.values()){
			if(c.id==id) return c;
		}
		return null;
	}
	
	public static CountryEnum valueOfCA(int id){
		for(CountryEnum c : CountryEnum.values()){
			if(c.id==id) return c;
		}
		return null;
	}
	
	public static CountryEnum valueIsoOf(String iso){
		for(CountryEnum c : CountryEnum.values()){
			if(c.iso.equals(iso)) return c;
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

	public int getCredinterId() {
		return credinterId;
	}

	public void setCredinterId(int credinterId) {
		this.credinterId = credinterId;
	}
}
