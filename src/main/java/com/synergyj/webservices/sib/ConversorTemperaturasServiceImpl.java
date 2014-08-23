package com.synergyj.webservices.sib;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.synergyj.webservices.sei.ConversorTemperaturasService;

@WebService(endpointInterface = "com.synergyj.webservices.sei.ConversorTemperaturasService")
public class ConversorTemperaturasServiceImpl implements
		ConversorTemperaturasService {

	private static final Logger logger = LoggerFactory
			.getLogger(ConversorTemperaturasServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * @see
	 * com.synergyj.cursos.webservices.sei.ConversorTemperaturas#celciusToFarenheit(int)
	 */
	@Override
	public double celciusToFarenheit(int celcius) {

		logger.debug("Recibiendo peticion c-f");

		return (celcius + 32) * 1.8;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.synergyj.cursos.webservices.sei.ConversorTemperaturas#farenheitToCelcius(int)
	 */
	@Override
	public double farenheitToCelcius(int farenheit) {

		logger.debug("Recibiendo peticion f-c");
		return (farenheit - 32) / 1.8;
	}

}
