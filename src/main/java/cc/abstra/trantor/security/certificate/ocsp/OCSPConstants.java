/**
 * Copyright 2013 Ministerio de Industria, Energía y Turismo
 *
 * Este fichero es parte de "Componentes de Firma XAdES 1.1.7".
 *
 * Licencia con arreglo a la EUPL, Versión 1.1 o –en cuanto sean aprobadas por la Comisión Europea– versiones posteriores de la EUPL (la Licencia);
 * Solo podrá usarse esta obra si se respeta la Licencia.
 *
 * Puede obtenerse una copia de la Licencia en:
 *
 * http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 *
 * Salvo cuando lo exija la legislación aplicable o se acuerde por escrito, el programa distribuido con arreglo a la Licencia se distribuye «TAL CUAL»,
 * SIN GARANTÍAS NI CONDICIONES DE NINGÚN TIPO, ni expresas ni implícitas.
 * Véase la Licencia en el idioma concreto que rige los permisos y limitaciones que establece la Licencia.
 */
package cc.abstra.trantor.security.certificate.ocsp;

/**
 * Clase con constantes para la librería MITyCLibOCSP
 */

public interface OCSPConstants {

	    static final String X509= "X.509";
		static final String SUN = "SUN";
		static final String SUN_RSA_SIGN = "SunRsaSign";
	    
	    static final String LIBRERIA_OCSP_ERROR_1= "libreriaocsp.error1";
	    static final String LIBRERIA_OCSP_ERROR_2= "libreriaocsp.error2";
	    static final String LIBRERIA_OCSP_ERROR_3= "libreriaocsp.error3";
	    static final String LIBRERIA_OCSP_ERROR_4= "libreriaocsp.error4";
	    static final String LIBRERIA_OCSP_ERROR_5= "libreriaocsp.error5";
	    static final String LIBRERIA_OCSP_ERROR_6= "libreriaocsp.error6";
	    static final String LIBRERIA_OCSP_ERROR_7= "libreriaocsp.error7";
	    static final String LIBRERIA_OCSP_ERROR_9= "libreriaocsp.error9";
	    static final String LIBRERIA_OCSP_ERROR_10= "libreriaocsp.error10";
	    static final String LIBRERIA_OCSP_ERROR_11= "libreriaocsp.error11";
        static final String LIBRERIA_OCSP_ERROR_12= "libreriaocsp.error12";     
        static final String LIBRERIA_OCSP_ERROR_13= "libreriaocsp.error13";     
        static final String LIBRERIA_OCSP_ERROR_14= "libreriaocsp.error14";     
	    
	    static final String LIBRERIA_RAZON_REVOCACION_1 = "libreriaocsp.razonrevocacion1";
	    static final String LIBRERIA_RAZON_REVOCACION_2 = "libreriaocsp.razonrevocacion2";
	    static final String LIBRERIA_RAZON_REVOCACION_3 = "libreriaocsp.razonrevocacion3";
	    static final String LIBRERIA_RAZON_REVOCACION_4 = "libreriaocsp.razonrevocacion4";
	    static final String LIBRERIA_RAZON_REVOCACION_5 = "libreriaocsp.razonrevocacion5";
	    static final String LIBRERIA_RAZON_REVOCACION_6 = "libreriaocsp.razonrevocacion6";

	    static final String LIBRERIA_OCSP_RESPUESTA_1 = "libreriaocsp.respuesta1";
	    static final String LIBRERIA_OCSP_RESPUESTA_2 = "libreriaocsp.respuesta2";
	    static final String LIBRERIA_OCSP_RESPUESTA_3 = "libreriaocsp.respuesta3";
	    static final String LIBRERIA_OCSP_RESPUESTA_4 = "libreriaocsp.respuesta4";
	    static final String LIBRERIA_OCSP_RESPUESTA_5 = "libreriaocsp.respuesta5";
	    
	    static final int GOOD				= 0;
	    static final int REVOKED			= 1;
	    static final int UNKNOWN			= 2;
	    static final int ERROR				= 3;
	    static final int MALFORMEDREQUEST	= 4;
	    static final int INTERNALERROR		= 5;
	    static final int TRYLATER			= 6;
	    static final int SIGREQUIRED		= 7;
	    static final int UNAUTHORIZED		= 8;
	    static final int INTERRUPTED		= 9;
	    
	    static final String LOCALE= "locale";
	    
	    static final String MENSAJE_CREADO_INDENTIFICADO = "Creado identificador único de certificado a validar.";
	    
	    static final String MENSAJE_ERROR_GENERAR_IDENTIFICADOR= "Error al generar el identificador unico del certificado de usuario: ";
	    static final String MENSAJE_PETICION_OCSP_GENERADA= "Petición OCSP generada.";
	    static final String ERROR_MENSAJE_GENERAR_PETICION_OCSP= "Error al generar la petición OCSP: ";
	    static final String DEBUG_SERVIDOR_OCSP_ENCONTRADO = "Servidor OCSP encontrado ";
	    static final String CONTENT_TYPE= "Content-Type";
	    static final String APPLICATION_OCSP_REQUEST= "application/ocsp-request";
	    static final String MENSAJE_ERROR_LEER_PETICION = "Error al leer la petición: ";
	    static final String MENSAJE_PETICION_ENVIADA= "Petición enviada.";
	    static final String MENSAJE_FALLO_EJECUCION_METODO = "Fallo la ejecución del método: ";
	    static final String MENSAJE_RESPUESTA_OBTENIDA= "Respuesta obtenida.";
	    static final String MENSAJE_ERROR_SECUENCIA_BYTES_RESPUESTA = "Error en la secuencia de bytes de respuesta: ";
	    static final String MENSAJE_OCSP_NOT_SUCCESSFUL= 	"OCSPResponseStatus: not successful.";
	    static final String MENSAJE_OCSP_MALFORMED_REQUEST= "OCSPResponseStatus: malformedRequest.";
	    static final String MENSAJE_OCSP_INTERNAL_ERROR= "OCSPResponseStatus: internalError.";
	    static final String MENSAJE_OCSP_TRY_LATER= "OCSPResponseStatus: tryLater.";
	    static final String MENSAJE_OCSP_SIG_REQUIRED= "OCSPResponseStatus: sigRequired.";
	    static final String MENSAJE_OCSP_UNAUTHORIZED= "OCSPResponseStatus: unauthorized.";
	    static final String MENSAJE_OCSP_SUCCESSFUL= "OCSPResponseStatus: successful.";
	    static final String ESTADO_CERTIFICADO_GOOD= "Estado del certificado: Good.";
	    static final String ESTADO_CERTIFICADO_REVOKED= "Estado del certificado: Revoked.";
	    static final String ESTADO_CERTIFICADO_UNKNOWN= "Estado del certificado: Unknown.";
	    static final String MENSAJE_RECIBIDO_ESTADO_NO_DEFINIDO = "Se recibió un estado no definido: ";
	    static final String MENSAJE_ERROR_RESPUESTA_OCPS_BASICA = "Error al instanciar la respuesta OCSP básica: ";
	    static final String MENSAJE_VIOLACION_HTTP = "Violación del protocolo HTTP: ";
	    static final String MENSAJE_ERROR_CONEXION_SERVIDOR_OCSP= "Error en la conexión con el servidor OCSP: ";
	    static final String MENSAJE_UTILIZA_SERVIDOR_PROXY = "Se utiliza un servidor Proxy: ";
	    static final String MENSAJE_RESPUESTA_SERVIDOR_ESTADO_DESCONOCIDO = "El servidor ha respondido que el estado del certificado es desconocido";
	    static final String MENSAJE_PROXY_AUTENTICADO = "Autenticación fallida en el proxy";
	    static final String MENSAJE_PROXY_POR_CONFIGURAR = "Debe configurar su proxy para poder realizar la consulta";
	    static final String MENSAJE_INTERRUMPIDO = "Consulta OCSP interrumpida";
	    
	    static final String DOS_PUNTOS_ESPACIO	=	": ";
	    static final String DOS_PUNTOS	=	":";
	    static final String CADENA_VACIA = "";
	    static final String NUEVA_LINEA = "\n";
	    
	    static final String COMA = ",";
	    static final String STR_LENGTH_OF_BASE_64 = "Length of Base64 encoded input string is not a multiple of 4.";
		static final String STR_ILLEGAL_CHARACTER_IN_BASE_64 = "Illegal character in Base64 encoded data.";
		static final String STR_INPUT_NOT_PROPERLY_PADDED = "Base64 input not properly padded." ;
		static final String USAR_OCSP_MULTIPLE = "MULTIPLE";
}
