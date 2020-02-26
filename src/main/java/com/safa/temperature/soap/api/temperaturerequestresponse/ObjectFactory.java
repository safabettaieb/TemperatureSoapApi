//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.26 à 10:55:12 PM WAT 
//


package com.safa.temperature.soap.api.temperaturerequestresponse;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.safa.temperature.soap.api.temperaturerequestresponse package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.safa.temperature.soap.api.temperaturerequestresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AvgTemperatureResponse }
     * 
     */
    public AvgTemperatureResponse createAvgTemperatureResponse() {
        return new AvgTemperatureResponse();
    }

    /**
     * Create an instance of {@link ClosestToZeroTemperatureResponse }
     * 
     */
    public ClosestToZeroTemperatureResponse createClosestToZeroTemperatureResponse() {
        return new ClosestToZeroTemperatureResponse();
    }

    /**
     * Create an instance of {@link AvgTemperatureRequest }
     * 
     */
    public AvgTemperatureRequest createAvgTemperatureRequest() {
        return new AvgTemperatureRequest();
    }

    /**
     * Create an instance of {@link MaxTemperatureResponse }
     * 
     */
    public MaxTemperatureResponse createMaxTemperatureResponse() {
        return new MaxTemperatureResponse();
    }

    /**
     * Create an instance of {@link ClosestToZeroTemperatureRequest }
     * 
     */
    public ClosestToZeroTemperatureRequest createClosestToZeroTemperatureRequest() {
        return new ClosestToZeroTemperatureRequest();
    }

    /**
     * Create an instance of {@link MinTemperatureRequest }
     * 
     */
    public MinTemperatureRequest createMinTemperatureRequest() {
        return new MinTemperatureRequest();
    }

    /**
     * Create an instance of {@link MinTemperatureResponse }
     * 
     */
    public MinTemperatureResponse createMinTemperatureResponse() {
        return new MinTemperatureResponse();
    }

    /**
     * Create an instance of {@link MaxTemperatureRequest }
     * 
     */
    public MaxTemperatureRequest createMaxTemperatureRequest() {
        return new MaxTemperatureRequest();
    }

}
