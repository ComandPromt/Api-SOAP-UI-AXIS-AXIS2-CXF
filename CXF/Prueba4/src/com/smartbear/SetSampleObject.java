
package com.smartbear;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="obj" type="{http://smartbear.com}SampleTestClass" minOccurs="0"/>
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
    "obj"
})
@XmlRootElement(name = "SetSampleObject")
public class SetSampleObject {

    protected SampleTestClass obj;

    /**
     * Obtiene el valor de la propiedad obj.
     * 
     * @return
     *     possible object is
     *     {@link SampleTestClass }
     *     
     */
    public SampleTestClass getObj() {
        return obj;
    }

    /**
     * Define el valor de la propiedad obj.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleTestClass }
     *     
     */
    public void setObj(SampleTestClass value) {
        this.obj = value;
    }

}
