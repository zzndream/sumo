//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.05 at 04:36:39 PM CET 
//


package jrc.it.annotation.reader.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Annotation record for downlink information.
 * 
 * <p>Java class for downlinkInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="downlinkInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="swath" type="{}swathType"/>
 *         &lt;element name="azimuthTime" type="{}timeType"/>
 *         &lt;element name="firstLineSensingTime" type="{}timeType"/>
 *         &lt;element name="lastLineSensingTime" type="{}timeType"/>
 *         &lt;element name="prf" type="{}double"/>
 *         &lt;element name="bitErrorCount" type="{}bitErrorCountType"/>
 *         &lt;element name="downlinkValues" type="{}downlinkValuesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downlinkInformationType", propOrder = {
    "swath",
    "azimuthTime",
    "firstLineSensingTime",
    "lastLineSensingTime",
    "prf",
    "bitErrorCount",
    "downlinkValues"
})
public class DownlinkInformationType {

    @XmlElement(required = true)
    protected SwathType swath;
    @XmlElement(required = true)
    protected XMLGregorianCalendar azimuthTime;
    @XmlElement(required = true)
    protected XMLGregorianCalendar firstLineSensingTime;
    @XmlElement(required = true)
    protected XMLGregorianCalendar lastLineSensingTime;
    @XmlElement(required = true)
    protected Double prf;
    @XmlElement(required = true)
    protected BitErrorCountType bitErrorCount;
    @XmlElement(required = true)
    protected DownlinkValuesType downlinkValues;

    /**
     * Gets the value of the swath property.
     * 
     * @return
     *     possible object is
     *     {@link SwathType }
     *     
     */
    public SwathType getSwath() {
        return swath;
    }

    /**
     * Sets the value of the swath property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwathType }
     *     
     */
    public void setSwath(SwathType value) {
        this.swath = value;
    }

    /**
     * Gets the value of the azimuthTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAzimuthTime() {
        return azimuthTime;
    }

    /**
     * Sets the value of the azimuthTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAzimuthTime(XMLGregorianCalendar value) {
        this.azimuthTime = value;
    }

    /**
     * Gets the value of the firstLineSensingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstLineSensingTime() {
        return firstLineSensingTime;
    }

    /**
     * Sets the value of the firstLineSensingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstLineSensingTime(XMLGregorianCalendar value) {
        this.firstLineSensingTime = value;
    }

    /**
     * Gets the value of the lastLineSensingTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLineSensingTime() {
        return lastLineSensingTime;
    }

    /**
     * Sets the value of the lastLineSensingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLineSensingTime(XMLGregorianCalendar value) {
        this.lastLineSensingTime = value;
    }

    /**
     * Gets the value of the prf property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrf() {
        return prf;
    }

    /**
     * Sets the value of the prf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrf(Double value) {
        this.prf = value;
    }

    /**
     * Gets the value of the bitErrorCount property.
     * 
     * @return
     *     possible object is
     *     {@link BitErrorCountType }
     *     
     */
    public BitErrorCountType getBitErrorCount() {
        return bitErrorCount;
    }

    /**
     * Sets the value of the bitErrorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BitErrorCountType }
     *     
     */
    public void setBitErrorCount(BitErrorCountType value) {
        this.bitErrorCount = value;
    }

    /**
     * Gets the value of the downlinkValues property.
     * 
     * @return
     *     possible object is
     *     {@link DownlinkValuesType }
     *     
     */
    public DownlinkValuesType getDownlinkValues() {
        return downlinkValues;
    }

    /**
     * Sets the value of the downlinkValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownlinkValuesType }
     *     
     */
    public void setDownlinkValues(DownlinkValuesType value) {
        this.downlinkValues = value;
    }

}
