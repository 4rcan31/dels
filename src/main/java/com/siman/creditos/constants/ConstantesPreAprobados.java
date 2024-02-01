package com.siman.creditos.constants;


public class ConstantesPreAprobados {
	
	//Constantes para estado de la fila luego de la carga
    public static final String ESTADO_CARGA_EXITO = "E";
    public static final String ESTADO_CARGA_FALLO = "F";
    
    //Constantes de estado de proceso
    public static final String ESTADO_EN_ESPERA = "E";
    public static final String ESTADO_APROBADO = "A";
    
    /* **Constantes para errores** */ 
    //campaña
    public static final int ID_CAMPAÑA_OBLIGATORIO = 1;
    public static final int ID_CAMPAÑA_NO_ENTERO = 2;
    public static final int ID_CAMPAÑA_NO_NUMERICO = 3;
    public static final int ID_CAMPAÑA_NO_EXISTE = 4;
    //pais
    public static final int PAIS_OBLIGATORIO = 5; 
    public static final int PAIS_NO_VALIDO = 6;
    public static final int PAIS_NO_SELECCIONADO = 7;
    //NIU
    public static final int NIU_OBLIGATORIO = 8;
    public static final int NIU_NO_ENTERO = 9;
    public static final int NIU_LONGITUD_NO_VALIDA = 10;
    //Linea Credito
    public static final int LINEA_CREDITO_OBLIGATORIO = 11;
    public static final int LINEA_CREDITO_NUMERO_NO_VALIDO = 12;
    //Cuenta
    public static final int CUENTA_OBLIGATORIO = 13;
    public static final int CUENTA_NUMERO_NO_VALIDO = 14;
    //Cuenta
    public static final int NOMBRE_OBLIGATORIO = 15;
    public static final int NOMBRE_NUMERO_NO_VALIDO = 16;
    
    public static final int DUI_LONGITUD_NO_VALIDA = 17;
    
    public static final int MONTO_OBLIGATORIO = 18;
    public static final int MONTO_NUMERO_NO_VALIDO = 19;
    
    public static final int LIMITE_ACTUAL_NUMERO_NO_VALIDO = 20;
    
    public static final int FECHA_INICIO_OBLIGATORIA = 21;
    public static final int FECHA_INICIO_FORMATO_NO_VALIDO = 22;
    public static final int FECHA_INICIO_RANGO_NO_VALIDO = 23;
    
    public static final int ESTRATEGIA_OBLIGATORIA = 24;
    public static final int ESTRATEGIA_NO_VALIDA = 25;
    
    public static final int FECHA_FIN_OBLIGATORIA = 26;
    public static final int FECHA_FIN_FORMATO_NO_VALIDO = 27;
    public static final int FECHA_FIN_RANGO_NO_VALIDO = 28;
    
    public static final int REGISTRO_DUPLICADO = 29;
    
    public static final int VALOR_PRODUCTO = 30;
}
