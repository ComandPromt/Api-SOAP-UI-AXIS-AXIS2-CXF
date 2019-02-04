
package com.smartbear;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SampleTestClass complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SampleTestClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntArray" type="{http://smartbear.com}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleTestClass", propOrder = {
    "x",
    "y",
    "name",
    "intArray"
})
public class SampleTestClass {

    @XmlElement(name = "X")
    protected double x;
    @XmlElement(name = "Y")
    protected double y;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IntArray")
    protected ArrayOfInt intArray;

    /**
     * Obtiene el valor de la propiedad x.
     * 
     */
    public double getX() {
        return x;
    }

    /**
     * Define el valor de la propiedad x.
     * 
     */
    public void setX(double value) {
        this.x = value;
    }

    /**
     * Obtiene el valor de la propiedad y.
     * 
     */
    public double getY() {
        return y;
    }

    /**
     * Define el valor de la propiedad y.
     * 
     */
    public void setY(double value) {
        this.y = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad intArray.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getIntArray() {
        return intArray;
    }

    /**
     * Define el valor de la propiedad intArray.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setIntArray(ArrayOfInt value) {
        this.intArray = value;
    }

}
