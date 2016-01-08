//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.24 at 04:43:09 PM CEST 
//


package safe.annotation;

import java.math.BigInteger;
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
 *         &lt;element ref="{}linesPerBurst"/>
 *         &lt;element ref="{}samplesPerBurst"/>
 *         &lt;element ref="{}burstList"/>
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
    "linesPerBurst",
    "samplesPerBurst",
    "burstList"
})
@XmlRootElement(name = "swathTiming")
public class SwathTiming {

    @XmlElement(required = true)
    protected BigInteger linesPerBurst;
    @XmlElement(required = true)
    protected BigInteger samplesPerBurst;
    @XmlElement(required = true)
    protected BurstList burstList;

    /**
     * Gets the value of the linesPerBurst property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinesPerBurst() {
        return linesPerBurst;
    }

    /**
     * Sets the value of the linesPerBurst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinesPerBurst(BigInteger value) {
        this.linesPerBurst = value;
    }

    /**
     * Gets the value of the samplesPerBurst property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSamplesPerBurst() {
        return samplesPerBurst;
    }

    /**
     * Sets the value of the samplesPerBurst property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSamplesPerBurst(BigInteger value) {
        this.samplesPerBurst = value;
    }

    /**
     * Gets the value of the burstList property.
     * 
     * @return
     *     possible object is
     *     {@link BurstList }
     *     
     */
    public BurstList getBurstList() {
        return burstList;
    }

    /**
     * Sets the value of the burstList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BurstList }
     *     
     */
    public void setBurstList(BurstList value) {
        this.burstList = value;
    }

}
