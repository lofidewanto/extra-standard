//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.24 at 11:30:02 AM CEST 
//


package de.drv.dsrv.spoc.extra.v1_3.jaxb.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CheckpointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckpointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Layer" type="{http://www.extra-standard.de/namespace/message/1}ExtraLayerNamesType"/>
 *         &lt;element name="Status" type="{http://www.extra-standard.de/namespace/message/1}StatusNamesType"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Report" type="{http://www.extra-standard.de/namespace/message/1}ReportType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckpointType", propOrder = {
    "layer",
    "status",
    "timestamp",
    "report"
})
public class CheckpointType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Layer", required = true)
    protected ExtraLayerNamesType layer;
    @XmlElement(name = "Status", required = true)
    protected StatusNamesType status;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "Report")
    protected ReportType report;

    /**
     * Gets the value of the layer property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraLayerNamesType }
     *     
     */
    public ExtraLayerNamesType getLayer() {
        return layer;
    }

    /**
     * Sets the value of the layer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraLayerNamesType }
     *     
     */
    public void setLayer(ExtraLayerNamesType value) {
        this.layer = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusNamesType }
     *     
     */
    public StatusNamesType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusNamesType }
     *     
     */
    public void setStatus(StatusNamesType value) {
        this.status = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType }
     *     
     */
    public ReportType getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType }
     *     
     */
    public void setReport(ReportType value) {
        this.report = value;
    }

}
