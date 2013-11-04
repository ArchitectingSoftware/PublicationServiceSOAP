package org.drexel.ws.services;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 11/3/13
 * Time: 12:47 PM
 * To change this template use File | Settings | File Templates.
 */

import org.drexel.ws.message.*;

/**
 * Created with IntelliJ IDEA.
 * User: bsmitc
 * Date: 10/5/13
 * Time: 9:35 AM
 * To change this template use File | Settings | File Templates.
 */
public interface PublicationRequestService {
    PublicationResponse getPublicationsServiceRouter(PublicationRequest req);
    PublicationResponse getAllPublications();
    PublicationResponse getAPublication(int id);
}
