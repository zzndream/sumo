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
 * Annotation record for raw data analysis information.
 * 
 * <p>Java class for rawDataAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rawDataAnalysisType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="azimuthTime" type="{}timeType"/>
 *         &lt;element name="iBias" type="{}double"/>
 *         &lt;element name="qBias" type="{}double"/>
 *         &lt;element name="iqQuadratureDeparture" type="{}double"/>
 *         &lt;element name="iqGainImbalance" type="{}double"/>
 *         &lt;element name="support" type="{}rawDataAnalysisSupportType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rawDataAnalysisType", propOrder = {
    "azimuthTime",
    "iBias",
    "qBias",
    "iqQuadratureDeparture",
    "iqGainImbalance",
    "support"
})
public class RawDataAnalysisType {

    @XmlElement(required = true)
    protected XMLGregorianCalendar azimuthTime;
    @XmlElement(required = true)
    protected Double iBias;
    @XmlElement(required = true)
    protected Double qBias;
    @XmlElement(required = true)
    protected Double iqQuadratureDeparture;
    @XmlElement(required = true)
    protected Double iqGainImbalance;
    @XmlElement(required = true)
    protected RawDataAnalysisSupportType support;

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
     * Gets the value of the iBias property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIBias() {
        return iBias;
    }

    /**
     * Sets the value of the iBias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIBias(Double value) {
        this.iBias = value;
    }

    /**
     * Gets the value of the qBias property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQBias() {
        return qBias;
    }

    /**
     * Sets the value of the qBias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQBias(Double value) {
        this.qBias = value;
    }

    /**
     * Gets the value of the iqQuadratureDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIqQuadratureDeparture() {
        return iqQuadratureDeparture;
    }

    /**
     * Sets the value of the iqQuadratureDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIqQuadratureDeparture(Double value) {
        this.iqQuadratureDeparture = value;
    }

    /**
     * Gets the value of the iqGainImbalance property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIqGainImbalance() {
        return iqGainImbalance;
    }

    /**
     * Sets the value of the iqGainImbalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIqGainImbalance(Double value) {
        this.iqGainImbalance = value;
    }

    /**
     * Gets the value of the support property.
     * 
     * @return
     *     possible object is
     *     {@link RawDataAnalysisSupportType }
     *     
     */
    public RawDataAnalysisSupportType getSupport() {
        return support;
    }

    /**
     * Sets the value of the support property.
     * 
     * @param value
     *     allowed object is
     *     {@link RawDataAnalysisSupportType }
     *     
     */
    public void setSupport(RawDataAnalysisSupportType value) {
        this.support = value;
    }

}
