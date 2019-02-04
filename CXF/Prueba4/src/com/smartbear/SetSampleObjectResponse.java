
package com.smartbear;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetSampleObjectResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "setSampleObjectResult"
})
@XmlRootElement(name = "SetSampleObjectResponse")
public class SetSampleObjectResponse {

    @XmlElement(name = "SetSampleObjectResult")
    protected String setSampleObjectResult;

    /**
     * Obtiene el valor de la propiedad setSampleObjectResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetSampleObjectResult() {
        return setSampleObjectResult;
    }

    /**
     * Define el valor de la propiedad setSampleObjectResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetSampleObjectResult(String value) {
        this.setSampleObjectResult = value;
    }

}
