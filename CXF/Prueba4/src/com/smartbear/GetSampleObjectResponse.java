
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
 *         &lt;element name="GetSampleObjectResult" type="{http://smartbear.com}SampleTestClass" minOccurs="0"/>
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
    "getSampleObjectResult"
})
@XmlRootElement(name = "GetSampleObjectResponse")
public class GetSampleObjectResponse {

    @XmlElement(name = "GetSampleObjectResult")
    protected SampleTestClass getSampleObjectResult;

    /**
     * Obtiene el valor de la propiedad getSampleObjectResult.
     * 
     * @return
     *     possible object is
     *     {@link SampleTestClass }
     *     
     */
    public SampleTestClass getGetSampleObjectResult() {
        return getSampleObjectResult;
    }

    /**
     * Define el valor de la propiedad getSampleObjectResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleTestClass }
     *     
     */
    public void setGetSampleObjectResult(SampleTestClass value) {
        this.getSampleObjectResult = value;
    }

}
