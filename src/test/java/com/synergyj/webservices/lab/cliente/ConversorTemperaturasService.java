
package com.synergyj.webservices.lab.cliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ConversorTemperaturasService", targetNamespace = "http://sei.webservices.cursos.synergyj.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ConversorTemperaturasService {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(partName = "return")
    public double convertirFarenheit(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(partName = "return")
    public double convertirCelsius(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

}