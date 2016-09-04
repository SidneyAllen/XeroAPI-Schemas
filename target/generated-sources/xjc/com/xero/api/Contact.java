//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.03 at 05:37:57 PM PDT 
//


package com.xero.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ValidationErrors" type="{http://www.xero.com/BaseTypes}ArrayOfValidationError" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{http://www.xero.com/BaseTypes}ArrayOfWarning" minOccurs="0"/>
 *         &lt;element name="ContactID" type="{http://www.xero.com/BaseTypes}uniqueIdentifier" minOccurs="0"/>
 *         &lt;element name="ContactNumber" type="{http://www.xero.com/Contact}contactNumber" minOccurs="0"/>
 *         &lt;element name="ContactStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.xero.com/BaseTypes}contactName" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.xero.com/BaseTypes}contactFirstName" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.xero.com/BaseTypes}contactLastName" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.xero.com/BaseTypes}emailAddress" minOccurs="0"/>
 *         &lt;element name="SkypeUserName" type="{http://www.xero.com/BaseTypes}skypeUserName" minOccurs="0"/>
 *         &lt;element name="BankAccountDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TaxNumber" type="{http://www.xero.com/BaseTypes}taxNumberType" minOccurs="0"/>
 *         &lt;element name="AccountsReceivableTaxType" type="{http://www.xero.com/BaseTypes}taxType" minOccurs="0"/>
 *         &lt;element name="AccountsPayableTaxType" type="{http://www.xero.com/BaseTypes}taxType" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://www.xero.com/Address}ArrayOfAddress" minOccurs="0"/>
 *         &lt;element name="Phones" type="{http://www.xero.com/Phone}ArrayOfPhone" minOccurs="0"/>
 *         &lt;element name="UpdatedDateUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ContactGroups" type="{http://www.xero.com/Contact}ArrayOfContactGroup" minOccurs="0"/>
 *         &lt;element name="IsSupplier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BrandingTheme" type="{http://www.xero.com/BrandingTheme}BrandingTheme" minOccurs="0"/>
 *         &lt;element name="DefaultCurrency" type="{http://www.xero.com/CurrencyCode}currencyCode" minOccurs="0"/>
 *         &lt;element name="Balances" type="{http://www.xero.com/Contact}Balances" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactPersons" type="{http://www.xero.com/Contact}ArrayOfContactPerson" minOccurs="0"/>
 *         &lt;element name="HasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="validationstatus" type="{http://www.xero.com/BaseTypes}entityValidationStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {

})
public class Contact {

    @XmlElement(name = "ValidationErrors")
    protected ArrayOfValidationError validationErrors;
    @XmlElement(name = "Warnings")
    protected ArrayOfWarning warnings;
    @XmlElement(name = "ContactID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactID;
    @XmlElement(name = "ContactNumber")
    protected String contactNumber;
    @XmlElement(name = "ContactStatus")
    protected String contactStatus;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "SkypeUserName")
    protected String skypeUserName;
    @XmlElement(name = "BankAccountDetails")
    protected String bankAccountDetails;
    @XmlElement(name = "TaxNumber")
    protected String taxNumber;
    @XmlElement(name = "AccountsReceivableTaxType")
    protected String accountsReceivableTaxType;
    @XmlElement(name = "AccountsPayableTaxType")
    protected String accountsPayableTaxType;
    @XmlElement(name = "Addresses")
    protected ArrayOfAddress addresses;
    @XmlElement(name = "Phones")
    protected ArrayOfPhone phones;
    @XmlElementRef(name = "UpdatedDateUTC", namespace = "http://www.xero.com/Contact", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> updatedDateUTC;
    @XmlElement(name = "ContactGroups")
    protected ArrayOfContactGroup contactGroups;
    @XmlElement(name = "IsSupplier")
    protected Boolean isSupplier;
    @XmlElement(name = "IsCustomer")
    protected Boolean isCustomer;
    @XmlElement(name = "BrandingTheme")
    protected BrandingTheme brandingTheme;
    @XmlElement(name = "DefaultCurrency")
    protected CurrencyCode defaultCurrency;
    @XmlElement(name = "Balances")
    protected Balances balances;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "ContactPersons")
    protected ArrayOfContactPerson contactPersons;
    @XmlElement(name = "HasAttachments")
    protected Boolean hasAttachments;
    @XmlAttribute(name = "validationstatus")
    protected EntityValidationStatus validationstatus;

    /**
     * Gets the value of the validationErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public ArrayOfValidationError getValidationErrors() {
        return validationErrors;
    }

    /**
     * Sets the value of the validationErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValidationError }
     *     
     */
    public void setValidationErrors(ArrayOfValidationError value) {
        this.validationErrors = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarning }
     *     
     */
    public ArrayOfWarning getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarning }
     *     
     */
    public void setWarnings(ArrayOfWarning value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactID(String value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the contactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the value of the contactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNumber(String value) {
        this.contactNumber = value;
    }

    /**
     * Gets the value of the contactStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactStatus() {
        return contactStatus;
    }

    /**
     * Sets the value of the contactStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactStatus(String value) {
        this.contactStatus = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the skypeUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkypeUserName() {
        return skypeUserName;
    }

    /**
     * Sets the value of the skypeUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkypeUserName(String value) {
        this.skypeUserName = value;
    }

    /**
     * Gets the value of the bankAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountDetails() {
        return bankAccountDetails;
    }

    /**
     * Sets the value of the bankAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountDetails(String value) {
        this.bankAccountDetails = value;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * Sets the value of the taxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumber(String value) {
        this.taxNumber = value;
    }

    /**
     * Gets the value of the accountsReceivableTaxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountsReceivableTaxType() {
        return accountsReceivableTaxType;
    }

    /**
     * Sets the value of the accountsReceivableTaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountsReceivableTaxType(String value) {
        this.accountsReceivableTaxType = value;
    }

    /**
     * Gets the value of the accountsPayableTaxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountsPayableTaxType() {
        return accountsPayableTaxType;
    }

    /**
     * Sets the value of the accountsPayableTaxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountsPayableTaxType(String value) {
        this.accountsPayableTaxType = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddress }
     *     
     */
    public ArrayOfAddress getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddress }
     *     
     */
    public void setAddresses(ArrayOfAddress value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the phones property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhone }
     *     
     */
    public ArrayOfPhone getPhones() {
        return phones;
    }

    /**
     * Sets the value of the phones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhone }
     *     
     */
    public void setPhones(ArrayOfPhone value) {
        this.phones = value;
    }

    /**
     * Gets the value of the updatedDateUTC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUpdatedDateUTC() {
        return updatedDateUTC;
    }

    /**
     * Sets the value of the updatedDateUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUpdatedDateUTC(JAXBElement<XMLGregorianCalendar> value) {
        this.updatedDateUTC = value;
    }

    /**
     * Gets the value of the contactGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactGroup }
     *     
     */
    public ArrayOfContactGroup getContactGroups() {
        return contactGroups;
    }

    /**
     * Sets the value of the contactGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactGroup }
     *     
     */
    public void setContactGroups(ArrayOfContactGroup value) {
        this.contactGroups = value;
    }

    /**
     * Gets the value of the isSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupplier() {
        return isSupplier;
    }

    /**
     * Sets the value of the isSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupplier(Boolean value) {
        this.isSupplier = value;
    }

    /**
     * Gets the value of the isCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomer() {
        return isCustomer;
    }

    /**
     * Sets the value of the isCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomer(Boolean value) {
        this.isCustomer = value;
    }

    /**
     * Gets the value of the brandingTheme property.
     * 
     * @return
     *     possible object is
     *     {@link BrandingTheme }
     *     
     */
    public BrandingTheme getBrandingTheme() {
        return brandingTheme;
    }

    /**
     * Sets the value of the brandingTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrandingTheme }
     *     
     */
    public void setBrandingTheme(BrandingTheme value) {
        this.brandingTheme = value;
    }

    /**
     * Gets the value of the defaultCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Sets the value of the defaultCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setDefaultCurrency(CurrencyCode value) {
        this.defaultCurrency = value;
    }

    /**
     * Gets the value of the balances property.
     * 
     * @return
     *     possible object is
     *     {@link Balances }
     *     
     */
    public Balances getBalances() {
        return balances;
    }

    /**
     * Sets the value of the balances property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balances }
     *     
     */
    public void setBalances(Balances value) {
        this.balances = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Gets the value of the contactPersons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactPerson }
     *     
     */
    public ArrayOfContactPerson getContactPersons() {
        return contactPersons;
    }

    /**
     * Sets the value of the contactPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactPerson }
     *     
     */
    public void setContactPersons(ArrayOfContactPerson value) {
        this.contactPersons = value;
    }

    /**
     * Gets the value of the hasAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachments() {
        return hasAttachments;
    }

    /**
     * Sets the value of the hasAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachments(Boolean value) {
        this.hasAttachments = value;
    }

    /**
     * Gets the value of the validationstatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityValidationStatus }
     *     
     */
    public EntityValidationStatus getValidationstatus() {
        return validationstatus;
    }

    /**
     * Sets the value of the validationstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityValidationStatus }
     *     
     */
    public void setValidationstatus(EntityValidationStatus value) {
        this.validationstatus = value;
    }

}
