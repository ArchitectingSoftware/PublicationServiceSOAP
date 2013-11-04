package org.drexel.ws.services;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 11/3/13
 * Time: 12:48 PM
 * To change this template use File | Settings | File Templates.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.drexel.ws.message.*;
import org.drexel.ws.model.DbMock;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 10/5/13
 * Time: 9:37 AM
 * To change this template use File | Settings | File Templates.
 * *
 * WSDL AT:   http://localhost:8080/PublicationService/PublicationService.wsdl
 *
 * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:com="http://com.drexel.ws.messages">
 *  <soapenv:Header/>
 *  <soapenv:Body>
 *      <com:PublicationRequest>
 *          <com:RequestType>
 *              <!--You have a CHOICE of the next 2 items at this level-->
 *              <com:GetAll>1</com:GetAll>
 *          </com:RequestType>
 *       </com:PublicationRequest>
 *  </soapenv:Body>
 *</soapenv:Envelope>
 */

@Service
public class PublicationRequestServiceImpl implements PublicationRequestService {

    @Autowired
    DbMock dbService;

    public PublicationResponse getPublicationsServiceRouter(PublicationRequest pubRequest)
    {
        PublicationResponse  rsp = new PublicationResponse();

        if((pubRequest.getRequestType().getGetById()== null) &&
                (pubRequest.getRequestType().getGetById()== null))
        {
            rsp = buildErrorResponse(400,"Request type must be GetAll or GetById and not both!");
        }
        if(pubRequest.getRequestType().getGetById()!= null)
        {
            rsp = getAPublication(pubRequest.getRequestType().getGetById().intValue());
            System.out.println("Im Here - GetById!!!!");
        }
        else if (pubRequest.getRequestType().getGetAll() != null)
        {
            System.out.println("Im Here - GetByAll!!!!");
            rsp =  getAllPublications();
        }
        else
        {
            System.out.println("Im Here - ERROR!!!!");
            rsp = buildErrorResponse(400,"Unknown request type");
        }
        return rsp;
    }


    private PublicationResponse buildErrorResponse(int code, String message)
    {
        PublicationResponse rsp = new PublicationResponse();
        PublicationErrorType error = new PublicationErrorType();
        error.setCode(code);
        error.setMessage(message);
        rsp.setError(error);
        return rsp;
    }

    public PublicationResponse getAllPublications()
    {
        PublicationResponse rsp = new PublicationResponse();

        Collection<PublicationType> pList = dbService.getAllPubs();

        PublicationResponse.Publications pubList = new PublicationResponse.Publications();

        for(PublicationType aPub : pList)
        {
            pubList.getPublication().add(aPub);
        }

        rsp.setPublications(pubList);
        return rsp;
    }

    public PublicationResponse getAPublication(int id){

        PublicationResponse rsp = new PublicationResponse();
        PublicationType thePub = dbService.getPubById(id);
        if(thePub == null){
            rsp = buildErrorResponse(400,
                    "The requested index "+id+" is invalid or not in range");
        }else
        {
            rsp.setPublication(thePub);
        }

        return rsp;
    }
}

