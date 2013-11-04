
package org.drexel.ws.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestType">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="GetAll" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="GetById" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestType"
})
@XmlRootElement(name = "PublicationRequest", namespace = "http://com.drexel.ws.messages")
public class PublicationRequest {

    @XmlElement(name = "RequestType", namespace = "http://com.drexel.ws.messages", required = true)
    protected PublicationRequest.RequestType requestType;

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationRequest.RequestType }
     *     
     */
    public PublicationRequest.RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationRequest.RequestType }
     *     
     */
    public void setRequestType(PublicationRequest.RequestType value) {
        this.requestType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="GetAll" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="GetById" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "getAll",
        "getById"
    })
    public static class RequestType {

        @XmlElement(name = "GetAll", namespace = "http://com.drexel.ws.messages")
        protected String getAll;
        @XmlElement(name = "GetById", namespace = "http://com.drexel.ws.messages")
        protected Integer getById;

        /**
         * Gets the value of the getAll property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGetAll() {
            return getAll;
        }

        /**
         * Sets the value of the getAll property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGetAll(String value) {
            this.getAll = value;
        }

        /**
         * Gets the value of the getById property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getGetById() {
            return getById;
        }

        /**
         * Sets the value of the getById property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGetById(Integer value) {
            this.getById = value;
        }

    }

}
