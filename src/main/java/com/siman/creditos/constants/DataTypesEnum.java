package com.siman.creditos.constants;

public enum DataTypesEnum {
	
	NUMBER("java.lang.Long","NUMBER"),
	CHAR("java.lang.String","CHAR"),
	DATE("java.util.Date","DATE")
	;
	
	private String javaType;
	private String databaseType;
	
	DataTypesEnum(String javaType, String databaseType) {
		this.javaType = javaType;
		this.databaseType = databaseType;
	}
	
	public String javaType() { return javaType; }
	public String databaseType() { return databaseType; }
	
	public static DataTypesEnum fromJavaType(String javaType){
		for(DataTypesEnum e : DataTypesEnum.values()){
			if(e.javaType().equals(javaType)) return e;
		}
		return null;
	}
	
	public static DataTypesEnum fromDatabaseType(String databaseType){
		for(DataTypesEnum e : DataTypesEnum.values()){
			if(e.databaseType().equals(databaseType)) return e;
		}
		return null;
	}
	
}
