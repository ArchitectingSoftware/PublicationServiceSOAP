
package org.drexel.ws.message;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.drexel.ws.message package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.drexel.ws.message
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PublicationResponse }
     * 
     */
    public PublicationResponse createPublicationResponse() {
        return new PublicationResponse();
    }

    /**
     * Create an instance of {@link PublicationRequest }
     * 
     */
    public PublicationRequest createPublicationRequest() {
        return new PublicationRequest();
    }

    /**
     * Create an instance of {@link PublicationResponse.Publications }
     * 
     */
    public PublicationResponse.Publications createPublicationResponsePublications() {
        return new PublicationResponse.Publications();
    }

    /**
     * Create an instance of {@link PublicationType }
     * 
     */
    public PublicationType createPublicationType() {
        return new PublicationType();
    }

    /**
     * Create an instance of {@link PublicationErrorType }
     * 
     */
    public PublicationErrorType createPublicationErrorType() {
        return new PublicationErrorType();
    }

    /**
     * Create an instance of {@link PublicationRequest.RequestType }
     * 
     */
    public PublicationRequest.RequestType createPublicationRequestRequestType() {
        return new PublicationRequest.RequestType();
    }

}
