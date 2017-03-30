/*******************************************************************************
 *   BSD License
 *    
 *   Copyright (c) 2017, AT&T Intellectual Property.  All other rights reserved.
 *    
 *   Redistribution and use in source and binary forms, with or without modification, are permitted
 *   provided that the following conditions are met:
 *    
 *   1. Redistributions of source code must retain the above copyright notice, this list of conditions
 *      and the following disclaimer.
 *   2. Redistributions in binary form must reproduce the above copyright notice, this list of
 *      conditions and the following disclaimer in the documentation and/or other materials provided
 *      with the distribution.
 *   3. All advertising materials mentioning features or use of this software must display the
 *      following acknowledgement:  This product includes software developed by the AT&T.
 *   4. Neither the name of AT&T nor the names of its contributors may be used to endorse or
 *      promote products derived from this software without specific prior written permission.
 *    
 *   THIS SOFTWARE IS PROVIDED BY AT&T INTELLECTUAL PROPERTY ''AS IS'' AND ANY EXPRESS OR
 *   IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 *   MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *   SHALL AT&T INTELLECTUAL PROPERTY BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 *   SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *   PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;  LOSS OF USE, DATA, OR PROFITS;
 *   OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 *   CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 *   ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH
 *   DAMAGE.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.02 at 10:42:06 AM CST 
//

package com.att.ajsc.csi.logging;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginalMessageId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UniqueTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConversationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OriginationSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginationSystemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginationSystemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SourceClass" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SourceMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HostIPAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaultTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FaultSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaultLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaultDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalFaultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalFaultDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FaultEntity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InitiatedTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ElapsedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceKeyData1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceKeyData2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vtier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HttpMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "description", "instanceName", "applicationId", "originalMessageId",
		"uniqueTransactionId", "originatorId", "subject", "conversationId", "originationSystemId",
		"originationSystemVersion", "originationSystemName", "sourceClass", "sourceMethod", "transactionName",
		"transactionStatus", "hostIPAddress", "hostName", "responseCode", "responseDescription", "faultTimestamp",
		"faultSequenceNumber", "faultLevel", "faultCode", "faultDescription", "externalFaultCode",
		"externalFaultDescription", "faultEntity", "initiatedTimestamp", "elapsedTime", "mode", "serviceKeyData1",
		"serviceKeyData2", "cluster", "clientApp", "vtier", "clientIP", "httpMethod", "requestURL" })
@XmlRootElement(name = "AuditRecord")
public class AuditRecord {

	@XmlElement(name = "Description")
	protected String description;
	@XmlElement(name = "InstanceName", required = true)
	protected String instanceName;
	@XmlElement(name = "ApplicationId", required = true)
	protected String applicationId;
	@XmlElement(name = "OriginalMessageId", required = true)
	protected String originalMessageId;
	@XmlElement(name = "UniqueTransactionId")
	protected String uniqueTransactionId;
	@XmlElement(name = "OriginatorId")
	protected String originatorId;
	@XmlElement(name = "Subject", required = true)
	protected String subject;
	@XmlElement(name = "ConversationId", required = true)
	protected String conversationId;
	@XmlElement(name = "OriginationSystemId")
	protected String originationSystemId;
	@XmlElement(name = "OriginationSystemVersion")
	protected String originationSystemVersion;
	@XmlElement(name = "OriginationSystemName", required = true)
	protected String originationSystemName;
	@XmlElement(name = "SourceClass", required = true)
	protected String sourceClass;
	@XmlElement(name = "SourceMethod")
	protected String sourceMethod;
	@XmlElement(name = "TransactionName", required = true)
	protected String transactionName;
	@XmlElement(name = "TransactionStatus", required = true)
	protected String transactionStatus;
	@XmlElement(name = "HostIPAddress", required = true)
	protected String hostIPAddress;
	@XmlElement(name = "HostName", required = true)
	protected String hostName;
	@XmlElement(name = "ResponseCode")
	protected String responseCode;
	@XmlElement(name = "ResponseDescription")
	protected String responseDescription;
	@XmlElement(name = "FaultTimestamp")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar faultTimestamp;
	@XmlElement(name = "FaultSequenceNumber")
	protected String faultSequenceNumber;
	@XmlElement(name = "FaultLevel")
	protected String faultLevel;
	@XmlElement(name = "FaultCode")
	protected String faultCode;
	@XmlElement(name = "FaultDescription")
	protected String faultDescription;
	@XmlElement(name = "ExternalFaultCode")
	protected String externalFaultCode;
	@XmlElement(name = "ExternalFaultDescription")
	protected String externalFaultDescription;
	@XmlElement(name = "FaultEntity")
	protected String faultEntity;
	@XmlElement(name = "InitiatedTimestamp")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar initiatedTimestamp;
	@XmlElement(name = "ElapsedTime")
	protected String elapsedTime;
	@XmlElement(name = "Mode")
	protected String mode;
	@XmlElement(name = "ServiceKeyData1")
	protected String serviceKeyData1;
	@XmlElement(name = "ServiceKeyData2")
	protected String serviceKeyData2;
	@XmlElement(name = "Cluster")
	protected String cluster;
	@XmlElement(name = "ClientApp")
	protected String clientApp;
	@XmlElement(name = "Vtier")
	protected String vtier;
	@XmlElement(name = "ClientIP")
	protected String clientIP;
	@XmlElement(name = "HttpMethod")
	protected String httpMethod;
	@XmlElement(name = "RequestURL")
	protected String requestURL;

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the instanceName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * Sets the value of the instanceName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInstanceName(String value) {
		this.instanceName = value;
	}

	/**
	 * Gets the value of the applicationId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * Sets the value of the applicationId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setApplicationId(String value) {
		this.applicationId = value;
	}

	/**
	 * Gets the value of the originalMessageId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginalMessageId() {
		return originalMessageId;
	}

	/**
	 * Sets the value of the originalMessageId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginalMessageId(String value) {
		this.originalMessageId = value;
	}

	/**
	 * Gets the value of the uniqueTransactionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUniqueTransactionId() {
		return uniqueTransactionId;
	}

	/**
	 * Sets the value of the uniqueTransactionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUniqueTransactionId(String value) {
		this.uniqueTransactionId = value;
	}

	/**
	 * Gets the value of the originatorId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginatorId() {
		return originatorId;
	}

	/**
	 * Sets the value of the originatorId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginatorId(String value) {
		this.originatorId = value;
	}

	/**
	 * Gets the value of the subject property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * Sets the value of the subject property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSubject(String value) {
		this.subject = value;
	}

	/**
	 * Gets the value of the conversationId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConversationId() {
		return conversationId;
	}

	/**
	 * Sets the value of the conversationId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConversationId(String value) {
		this.conversationId = value;
	}

	/**
	 * Gets the value of the originationSystemId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginationSystemId() {
		return originationSystemId;
	}

	/**
	 * Sets the value of the originationSystemId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginationSystemId(String value) {
		this.originationSystemId = value;
	}

	/**
	 * Gets the value of the originationSystemVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginationSystemVersion() {
		return originationSystemVersion;
	}

	/**
	 * Sets the value of the originationSystemVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginationSystemVersion(String value) {
		this.originationSystemVersion = value;
	}

	/**
	 * Gets the value of the originationSystemName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOriginationSystemName() {
		return originationSystemName;
	}

	/**
	 * Sets the value of the originationSystemName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOriginationSystemName(String value) {
		this.originationSystemName = value;
	}

	/**
	 * Gets the value of the sourceClass property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSourceClass() {
		return sourceClass;
	}

	/**
	 * Sets the value of the sourceClass property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSourceClass(String value) {
		this.sourceClass = value;
	}

	/**
	 * Gets the value of the sourceMethod property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSourceMethod() {
		return sourceMethod;
	}

	/**
	 * Sets the value of the sourceMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSourceMethod(String value) {
		this.sourceMethod = value;
	}

	/**
	 * Gets the value of the transactionName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionName() {
		return transactionName;
	}

	/**
	 * Sets the value of the transactionName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionName(String value) {
		this.transactionName = value;
	}

	/**
	 * Gets the value of the transactionStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTransactionStatus() {
		return transactionStatus;
	}

	/**
	 * Sets the value of the transactionStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTransactionStatus(String value) {
		this.transactionStatus = value;
	}

	/**
	 * Gets the value of the hostIPAddress property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHostIPAddress() {
		return hostIPAddress;
	}

	/**
	 * Sets the value of the hostIPAddress property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHostIPAddress(String value) {
		this.hostIPAddress = value;
	}

	/**
	 * Gets the value of the hostName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * Sets the value of the hostName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHostName(String value) {
		this.hostName = value;
	}

	/**
	 * Gets the value of the responseCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * Sets the value of the responseCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponseCode(String value) {
		this.responseCode = value;
	}

	/**
	 * Gets the value of the responseDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResponseDescription() {
		return responseDescription;
	}

	/**
	 * Sets the value of the responseDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setResponseDescription(String value) {
		this.responseDescription = value;
	}

	/**
	 * Gets the value of the faultTimestamp property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getFaultTimestamp() {
		return faultTimestamp;
	}

	/**
	 * Sets the value of the faultTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setFaultTimestamp(XMLGregorianCalendar value) {
		this.faultTimestamp = value;
	}

	/**
	 * Gets the value of the faultSequenceNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaultSequenceNumber() {
		return faultSequenceNumber;
	}

	/**
	 * Sets the value of the faultSequenceNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaultSequenceNumber(String value) {
		this.faultSequenceNumber = value;
	}

	/**
	 * Gets the value of the faultLevel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaultLevel() {
		return faultLevel;
	}

	/**
	 * Sets the value of the faultLevel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaultLevel(String value) {
		this.faultLevel = value;
	}

	/**
	 * Gets the value of the faultCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaultCode() {
		return faultCode;
	}

	/**
	 * Sets the value of the faultCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaultCode(String value) {
		this.faultCode = value;
	}

	/**
	 * Gets the value of the faultDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaultDescription() {
		return faultDescription;
	}

	/**
	 * Sets the value of the faultDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaultDescription(String value) {
		this.faultDescription = value;
	}

	/**
	 * Gets the value of the externalFaultCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExternalFaultCode() {
		return externalFaultCode;
	}

	/**
	 * Sets the value of the externalFaultCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExternalFaultCode(String value) {
		this.externalFaultCode = value;
	}

	/**
	 * Gets the value of the externalFaultDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExternalFaultDescription() {
		return externalFaultDescription;
	}

	/**
	 * Sets the value of the externalFaultDescription property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExternalFaultDescription(String value) {
		this.externalFaultDescription = value;
	}

	/**
	 * Gets the value of the faultEntity property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaultEntity() {
		return faultEntity;
	}

	/**
	 * Sets the value of the faultEntity property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaultEntity(String value) {
		this.faultEntity = value;
	}

	/**
	 * Gets the value of the initiatedTimestamp property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getInitiatedTimestamp() {
		return initiatedTimestamp;
	}

	/**
	 * Sets the value of the initiatedTimestamp property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setInitiatedTimestamp(XMLGregorianCalendar value) {
		this.initiatedTimestamp = value;
	}

	/**
	 * Gets the value of the elapsedTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * Sets the value of the elapsedTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setElapsedTime(String value) {
		this.elapsedTime = value;
	}

	/**
	 * Gets the value of the mode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * Sets the value of the mode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMode(String value) {
		this.mode = value;
	}

	/**
	 * Gets the value of the serviceKeyData1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceKeyData1() {
		return serviceKeyData1;
	}

	/**
	 * Sets the value of the serviceKeyData1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceKeyData1(String value) {
		this.serviceKeyData1 = value;
	}

	/**
	 * Gets the value of the serviceKeyData2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceKeyData2() {
		return serviceKeyData2;
	}

	/**
	 * Sets the value of the serviceKeyData2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setServiceKeyData2(String value) {
		this.serviceKeyData2 = value;
	}

	/**
	 * Gets the value of the cluster property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCluster() {
		return cluster;
	}

	/**
	 * Sets the value of the cluster property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCluster(String value) {
		this.cluster = value;
	}

	/**
	 * Gets the value of the clientApp property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClientApp() {
		return clientApp;
	}

	/**
	 * Sets the value of the clientApp property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClientApp(String value) {
		this.clientApp = value;
	}

	/**
	 * Gets the value of the vtier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getVtier() {
		return vtier;
	}

	/**
	 * Sets the value of the vtier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setVtier(String value) {
		this.vtier = value;
	}

	/**
	 * Gets the value of the clientIP property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClientIP() {
		return clientIP;
	}

	/**
	 * Sets the value of the clientIP property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClientIP(String value) {
		this.clientIP = value;
	}

	/**
	 * Gets the value of the httpMethod property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHttpMethod() {
		return httpMethod;
	}

	/**
	 * Sets the value of the httpMethod property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHttpMethod(String value) {
		this.httpMethod = value;
	}

	/**
	 * Gets the value of the requestURL property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRequestURL() {
		return requestURL;
	}

	/**
	 * Sets the value of the requestURL property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRequestURL(String value) {
		this.requestURL = value;
	}

}