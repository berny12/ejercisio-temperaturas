/**
 * Fecha de creación: 17/07/2010 11:30:12
 *
 * Copyright (c) 2010 SynergyJ. 
 * Todos los derechos reservados.
 *
 * Este software es información pueder ser mofificado, utilizado
 * haciendo referencia al autor intelectual.
 */
package com.synergyj.webservices.lab;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.webservices.sib.ConversorTemperaturasServiceImpl;

/**
 * Publisher del servicio de conversión de temperaturas.
 * @author Jorge Rodríguez Campos (jorge.rodriguez@synergyj.com)
 * @version 1.0
 */
public class ConversorTemperaturasPublisher {

	/**
	 * Logger para todas las instancias de la clase
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ConversorTemperaturasPublisher.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "http://127.0.0.1:9878/conversorTemperaturasService?wsdl";

		logger.debug("publicando WS en {}", url);
		logger.debug("Para terminar presione ctrl + c");

		Endpoint.publish(url, new ConversorTemperaturasServiceImpl());

	}

}
