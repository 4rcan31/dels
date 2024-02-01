package com.siman.creditos.constants;

public enum FormalizationStatusEnum {
	ACTIVE("1", "ACTIVO"),
	INACTIVE("2", "INACTIVO"),
	;
	
	private String code;
	private String description;
	
	private FormalizationStatusEnum(String code, String description) {
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
