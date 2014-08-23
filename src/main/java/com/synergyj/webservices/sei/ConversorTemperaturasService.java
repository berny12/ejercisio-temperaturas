package com.synergyj.webservices.sei;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

public interface ConversorTemperaturasService {

	/**
	 * Metodo de negocio que convierte temperaturas.
	 * @param celcius
	 * @return
	 */
	@WebMethod(operationName="convertirCelsius")
	double celciusToFarenheit(int celcius);

	/**
	 * Metodo de negocio que convierte temperaturas.
	 * @param farenheit
	 * @return
	 */
	@WebMethod(operationName="convertirFarenheit")
	double farenheitToCelcius(int farenheit);
	
}
