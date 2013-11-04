package org.drexel.ws.services;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 11/3/13
 * Time: 12:50 PM
 * To change this template use File | Settings | File Templates.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.SoapHeader;

import org.drexel.ws.message.*;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 10/5/13
 * Time: 10:23 AM
 * To change this template use File | Settings | File Templates.
 */



@Endpoint
public class PublicationServiceEndpoint {

    private final PublicationRequestService pubService;

    @Autowired
    public PublicationServiceEndpoint(PublicationRequestService pubService) {
        this.pubService = pubService;
    }

    @PayloadRoot(localPart = "PublicationRequest", namespace = "http://com.drexel.ws.messages")
    @ResponsePayload
    public PublicationResponse getPubsService(@RequestPayload PublicationRequest pubRequest, SoapHeader header) {
        //checkSoapHeaderForSomething(header);

        //Check if getting pubs by ID

        return pubService.getPublicationsServiceRouter(pubRequest);
    }


}

