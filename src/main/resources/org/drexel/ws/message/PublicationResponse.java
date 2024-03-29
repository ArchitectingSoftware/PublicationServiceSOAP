
package org.drexel.ws.message;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice>
 *         &lt;element name="Publications">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Publication" type="{http://com.drexel.ws.messages}PublicationType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Publication" type="{http://com.drexel.ws.messages}PublicationType"/>
 *         &lt;element name="Error" type="{http://com.drexel.ws.messages}PublicationErrorType"/>
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
    "publications",
    "publication",
    "error"
})
@XmlRootElement(name = "PublicationResponse", namespace = "http://com.drexel.ws.messages")
public class PublicationResponse {

    @XmlElement(name = "Publications", namespace = "http://com.drexel.ws.messages")
    protected PublicationResponse.Publications publications;
    @XmlElement(name = "Publication", namespace = "http://com.drexel.ws.messages")
    protected PublicationType publication;
    @XmlElement(name = "Error", namespace = "http://com.drexel.ws.messages")
    protected PublicationErrorType error;

    /**
     * Gets the value of the publications property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationResponse.Publications }
     *     
     */
    public PublicationResponse.Publications getPublications() {
        return publications;
    }

    /**
     * Sets the value of the publications property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationResponse.Publications }
     *     
     */
    public void setPublications(PublicationResponse.Publications value) {
        this.publications = value;
    }

    /**
     * Gets the value of the publication property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationType }
     *     
     */
    public PublicationType getPublication() {
        return publication;
    }

    /**
     * Sets the value of the publication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationType }
     *     
     */
    public void setPublication(PublicationType value) {
        this.publication = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationErrorType }
     *     
     */
    public PublicationErrorType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationErrorType }
     *     
     */
    public void setError(PublicationErrorType value) {
        this.error = value;
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
     *       &lt;sequence>
     *         &lt;element name="Publication" type="{http://com.drexel.ws.messages}PublicationType" maxOccurs="unbounded" minOccurs="0"/>
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
        "publication"
    })
    public static class Publications {

        @XmlElement(name = "Publication", namespace = "http://com.drexel.ws.messages")
        protected List<PublicationType> publication;

        /**
         * Gets the value of the publication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPublication().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PublicationType }
         * 
         * 
         */
        public List<PublicationType> getPublication() {
            if (publication == null) {
                publication = new ArrayList<PublicationType>();
            }
            return this.publication;
        }

    }

}
