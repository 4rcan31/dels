package com.siman.creditos.constants;

public enum OperationTypesEnum {
	
	UPDATE ( "U", "Modificación" ),
	DELETE ( "D", "Eliminación" );
	
	String type;
	String typeDesc;
	
	private OperationTypesEnum(String type, String typeDesc) {
		this.type = type; 
		this.typeDesc = typeDesc;
	}
	
	public String type() { return type; }
	public String typeDesc() { return typeDesc; }
	
	public static OperationTypesEnum fromType(String type){
		for( OperationTypesEnum e : OperationTypesEnum.values()){
			if(e.type.equals(type)) return e;
		}
		return null;
	}
	
}
