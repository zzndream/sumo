//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.24 at 04:43:09 PM CEST 
//


package safe.annotation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}azimuthTime"/>
 *         &lt;element ref="{}chirpSource"/>
 *         &lt;element ref="{}pgSource"/>
 *         &lt;element ref="{}amplitudeCoefficients"/>
 *         &lt;element ref="{}phaseCoefficients"/>
 *         &lt;element ref="{}timeDelay"/>
 *         &lt;element ref="{}gain"/>
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
    "azimuthTime",
    "chirpSource",
    "pgSource",
    "amplitudeCoefficients",
    "phaseCoefficients",
    "timeDelay",
    "gain"
})
@XmlRootElement(name = "referenceReplica")
public class ReferenceReplica {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String azimuthTime;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String chirpSource;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String pgSource;
    @XmlElement(required = true)
    protected AmplitudeCoefficients amplitudeCoefficients;
    @XmlElement(required = true)
    protected PhaseCoefficients phaseCoefficients;
    protected double timeDelay;
    @XmlElement(required = true)
    protected Gain gain;

    /**
     * Gets the value of the azimuthTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzimuthTime() {
        return azimuthTime;
    }

    /**
     * Sets the value of the azimuthTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzimuthTime(String value) {
        this.azimuthTime = value;
    }

    /**
     * Gets the value of the chirpSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChirpSource() {
        return chirpSource;
    }

    /**
     * Sets the value of the chirpSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChirpSource(String value) {
        this.chirpSource = value;
    }

    /**
     * Gets the value of the pgSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgSource() {
        return pgSource;
    }

    /**
     * Sets the value of the pgSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgSource(String value) {
        this.pgSource = value;
    }

    /**
     * Gets the value of the amplitudeCoefficients property.
     * 
     * @return
     *     possible object is
     *     {@link AmplitudeCoefficients }
     *     
     */
    public AmplitudeCoefficients getAmplitudeCoefficients() {
        return amplitudeCoefficients;
    }

    /**
     * Sets the value of the amplitudeCoefficients property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmplitudeCoefficients }
     *     
     */
    public void setAmplitudeCoefficients(AmplitudeCoefficients value) {
        this.amplitudeCoefficients = value;
    }

    /**
     * Gets the value of the phaseCoefficients property.
     * 
     * @return
     *     possible object is
     *     {@link PhaseCoefficients }
     *     
     */
    public PhaseCoefficients getPhaseCoefficients() {
        return phaseCoefficients;
    }

    /**
     * Sets the value of the phaseCoefficients property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhaseCoefficients }
     *     
     */
    public void setPhaseCoefficients(PhaseCoefficients value) {
        this.phaseCoefficients = value;
    }

    /**
     * Gets the value of the timeDelay property.
     * 
     */
    public double getTimeDelay() {
        return timeDelay;
    }

    /**
     * Sets the value of the timeDelay property.
     * 
     */
    public void setTimeDelay(double value) {
        this.timeDelay = value;
    }

    /**
     * Gets the value of the gain property.
     * 
     * @return
     *     possible object is
     *     {@link Gain }
     *     
     */
    public Gain getGain() {
        return gain;
    }

    /**
     * Sets the value of the gain property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gain }
     *     
     */
    public void setGain(Gain value) {
        this.gain = value;
    }

}
