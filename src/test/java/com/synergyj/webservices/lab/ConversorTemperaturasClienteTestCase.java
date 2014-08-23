package com.synergyj.webservices.lab;


import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import junit.framework.Assert;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.synergyj.webservices.lab.cliente.ConversorTemperaturasServiceImplService;
import com.synergyj.webservices.sei.ConversorTemperaturasService;



public class ConversorTemperaturasClienteTestCase {

	private static final Logger logger = LoggerFactory.getLogger(ConversorTemperaturasClienteTestCase.class);
	
	
	@Test
	public void testClienteDinamico() throws  MalformedURLException{
		logger.debug("haciendo invocacion del web service a partir de un cliente dinamico");
		
		int temperaturaC=30;
		int temperaturaF=89;
		
		double resultado;
		
		//apuntamos al servicio
		URL url = new URL("http://localhost:9878/conversorTemperaturasService?wsdl");
		QName qname = new QName("http://sib.webservices.cursos.synergyj.com/","ConversorTemperaturasServiceImplService");
		
		//creamos el servicio
		Service service = Service.create(url,qname); // solo cuadno se tiene la sei
		
		//implementamos la interfaz 
		ConversorTemperaturasService conversorTemperaturasService = service.getPort(ConversorTemperaturasService.class);
		
		resultado = conversorTemperaturasService.celciusToFarenheit(temperaturaC);
		Assert.assertEquals((temperaturaC+32)*1.8,resultado);
		logger.debug("El resultado fue "+ resultado);
		
		
	}
	
	
	//@Test
	public void testClienteGenerado(){
		
		/*
		 * en los clientes generados tenemos que ejecutar la siguiente comando 
		 * wsimport -keep -d target/test-classes -s src/test/java -p com.synergyj.cursos.webservices.lab3.cliente http://127.0.0.1:9878/conversorTemperaturasService?wsdl
		 * 
		 * en el mismo directorio del proyecto
		 * 
		 */
		
		
		
		int temperaturaC=30;
		double resultado;
		ConversorTemperaturasServiceImplService servicio =
				new ConversorTemperaturasServiceImplService();
		//usar el nombre calificado de la clase generada pro el wsimport
		com.synergyj.webservices.lab.cliente.ConversorTemperaturasService conversorTemperaturasServiceService  =servicio.getConversorTemperaturasServiceImplPort();
		resultado = conversorTemperaturasServiceService.convertirCelsius(temperaturaC);
		Assert.assertEquals((temperaturaC+32)*1.8, resultado);
		
				logger.debug("El resultado fue "+ resultado);
		
		
	}
}
