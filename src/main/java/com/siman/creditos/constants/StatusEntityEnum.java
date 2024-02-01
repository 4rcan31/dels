package com.siman.creditos.constants;

public enum StatusEntityEnum {
	
//	public static final String ACTIVE = "A";
//	public static final String DELETED = "D";
//	public static final String PENDING_UPDATE = "U";
//	public static final String PENDING_DELETE = "P";
	
	ACTIVE("A", "Normal"),
	DELETED("D", "Eliminado"),
	PENDING_UPDATE("U", "Pendiente de Autorizar Modificación"),
	PENDING_DELETE("P", "Pendiente de Autorizar Eliminación"),
	;
	
	private String code;
	private String description;
	
	private StatusEntityEnum(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	public String code(){ return code; };
	
	public String description(){ return description; };
	
	public static StatusEntityEnum fromCode(String code){
		
		for(StatusEntityEnum s : StatusEntityEnum.values()){
			if(s.code().equals(code))
				return s;
		}
		return null;
		
	}
	
}
