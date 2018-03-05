package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DocumentAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:20:58.350Z")
public class DocumentAttributes {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("assignedId")
  private String assignedId = null;

  @SerializedName("supplierAssignedId")
  private String supplierAssignedId = null;

  @SerializedName("customerAssignedId")
  private String customerAssignedId = null;

  @SerializedName("issueDate")
  private OffsetDateTime issueDate = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("tax")
  private Float tax = null;

  @SerializedName("supplierName")
  private String supplierName = null;

  @SerializedName("supplierStreetAddress")
  private String supplierStreetAddress = null;

  @SerializedName("supplierCity")
  private String supplierCity = null;

  @SerializedName("supplierCountry")
  private String supplierCountry = null;

  @SerializedName("customerName")
  private String customerName = null;

  @SerializedName("customerStreetAddress")
  private String customerStreetAddress = null;

  @SerializedName("customerCity")
  private String customerCity = null;

  @SerializedName("customerCountry")
  private String customerCountry = null;

  @SerializedName("viewed")
  private Boolean viewed = null;

  @SerializedName("starred")
  private Boolean starred = null;

  @SerializedName("checked")
  private Boolean checked = null;

  @SerializedName("versions")
  private List<String> versions = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public DocumentAttributes id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DocumentAttributes type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DocumentAttributes assignedId(String assignedId) {
    this.assignedId = assignedId;
    return this;
  }

   /**
   * Get assignedId
   * @return assignedId
  **/
  @ApiModelProperty(value = "")
  public String getAssignedId() {
    return assignedId;
  }

  public void setAssignedId(String assignedId) {
    this.assignedId = assignedId;
  }

  public DocumentAttributes supplierAssignedId(String supplierAssignedId) {
    this.supplierAssignedId = supplierAssignedId;
    return this;
  }

   /**
   * Get supplierAssignedId
   * @return supplierAssignedId
  **/
  @ApiModelProperty(value = "")
  public String getSupplierAssignedId() {
    return supplierAssignedId;
  }

  public void setSupplierAssignedId(String supplierAssignedId) {
    this.supplierAssignedId = supplierAssignedId;
  }

  public DocumentAttributes customerAssignedId(String customerAssignedId) {
    this.customerAssignedId = customerAssignedId;
    return this;
  }

   /**
   * Get customerAssignedId
   * @return customerAssignedId
  **/
  @ApiModelProperty(value = "")
  public String getCustomerAssignedId() {
    return customerAssignedId;
  }

  public void setCustomerAssignedId(String customerAssignedId) {
    this.customerAssignedId = customerAssignedId;
  }

  public DocumentAttributes issueDate(OffsetDateTime issueDate) {
    this.issueDate = issueDate;
    return this;
  }

   /**
   * Get issueDate
   * @return issueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(OffsetDateTime issueDate) {
    this.issueDate = issueDate;
  }

  public DocumentAttributes currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public DocumentAttributes amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public DocumentAttributes tax(Float tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public Float getTax() {
    return tax;
  }

  public void setTax(Float tax) {
    this.tax = tax;
  }

  public DocumentAttributes supplierName(String supplierName) {
    this.supplierName = supplierName;
    return this;
  }

   /**
   * Get supplierName
   * @return supplierName
  **/
  @ApiModelProperty(value = "")
  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }

  public DocumentAttributes supplierStreetAddress(String supplierStreetAddress) {
    this.supplierStreetAddress = supplierStreetAddress;
    return this;
  }

   /**
   * Get supplierStreetAddress
   * @return supplierStreetAddress
  **/
  @ApiModelProperty(value = "")
  public String getSupplierStreetAddress() {
    return supplierStreetAddress;
  }

  public void setSupplierStreetAddress(String supplierStreetAddress) {
    this.supplierStreetAddress = supplierStreetAddress;
  }

  public DocumentAttributes supplierCity(String supplierCity) {
    this.supplierCity = supplierCity;
    return this;
  }

   /**
   * Get supplierCity
   * @return supplierCity
  **/
  @ApiModelProperty(value = "")
  public String getSupplierCity() {
    return supplierCity;
  }

  public void setSupplierCity(String supplierCity) {
    this.supplierCity = supplierCity;
  }

  public DocumentAttributes supplierCountry(String supplierCountry) {
    this.supplierCountry = supplierCountry;
    return this;
  }

   /**
   * Get supplierCountry
   * @return supplierCountry
  **/
  @ApiModelProperty(value = "")
  public String getSupplierCountry() {
    return supplierCountry;
  }

  public void setSupplierCountry(String supplierCountry) {
    this.supplierCountry = supplierCountry;
  }

  public DocumentAttributes customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public DocumentAttributes customerStreetAddress(String customerStreetAddress) {
    this.customerStreetAddress = customerStreetAddress;
    return this;
  }

   /**
   * Get customerStreetAddress
   * @return customerStreetAddress
  **/
  @ApiModelProperty(value = "")
  public String getCustomerStreetAddress() {
    return customerStreetAddress;
  }

  public void setCustomerStreetAddress(String customerStreetAddress) {
    this.customerStreetAddress = customerStreetAddress;
  }

  public DocumentAttributes customerCity(String customerCity) {
    this.customerCity = customerCity;
    return this;
  }

   /**
   * Get customerCity
   * @return customerCity
  **/
  @ApiModelProperty(value = "")
  public String getCustomerCity() {
    return customerCity;
  }

  public void setCustomerCity(String customerCity) {
    this.customerCity = customerCity;
  }

  public DocumentAttributes customerCountry(String customerCountry) {
    this.customerCountry = customerCountry;
    return this;
  }

   /**
   * Get customerCountry
   * @return customerCountry
  **/
  @ApiModelProperty(value = "")
  public String getCustomerCountry() {
    return customerCountry;
  }

  public void setCustomerCountry(String customerCountry) {
    this.customerCountry = customerCountry;
  }

  public DocumentAttributes viewed(Boolean viewed) {
    this.viewed = viewed;
    return this;
  }

   /**
   * Get viewed
   * @return viewed
  **/
  @ApiModelProperty(value = "")
  public Boolean isViewed() {
    return viewed;
  }

  public void setViewed(Boolean viewed) {
    this.viewed = viewed;
  }

  public DocumentAttributes starred(Boolean starred) {
    this.starred = starred;
    return this;
  }

   /**
   * Get starred
   * @return starred
  **/
  @ApiModelProperty(value = "")
  public Boolean isStarred() {
    return starred;
  }

  public void setStarred(Boolean starred) {
    this.starred = starred;
  }

  public DocumentAttributes checked(Boolean checked) {
    this.checked = checked;
    return this;
  }

   /**
   * Get checked
   * @return checked
  **/
  @ApiModelProperty(value = "")
  public Boolean isChecked() {
    return checked;
  }

  public void setChecked(Boolean checked) {
    this.checked = checked;
  }

  public DocumentAttributes versions(List<String> versions) {
    this.versions = versions;
    return this;
  }

  public DocumentAttributes addVersionsItem(String versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<String>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @ApiModelProperty(value = "")
  public List<String> getVersions() {
    return versions;
  }

  public void setVersions(List<String> versions) {
    this.versions = versions;
  }

  public DocumentAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DocumentAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentAttributes documentAttributes = (DocumentAttributes) o;
    return Objects.equals(this.id, documentAttributes.id) &&
        Objects.equals(this.type, documentAttributes.type) &&
        Objects.equals(this.assignedId, documentAttributes.assignedId) &&
        Objects.equals(this.supplierAssignedId, documentAttributes.supplierAssignedId) &&
        Objects.equals(this.customerAssignedId, documentAttributes.customerAssignedId) &&
        Objects.equals(this.issueDate, documentAttributes.issueDate) &&
        Objects.equals(this.currency, documentAttributes.currency) &&
        Objects.equals(this.amount, documentAttributes.amount) &&
        Objects.equals(this.tax, documentAttributes.tax) &&
        Objects.equals(this.supplierName, documentAttributes.supplierName) &&
        Objects.equals(this.supplierStreetAddress, documentAttributes.supplierStreetAddress) &&
        Objects.equals(this.supplierCity, documentAttributes.supplierCity) &&
        Objects.equals(this.supplierCountry, documentAttributes.supplierCountry) &&
        Objects.equals(this.customerName, documentAttributes.customerName) &&
        Objects.equals(this.customerStreetAddress, documentAttributes.customerStreetAddress) &&
        Objects.equals(this.customerCity, documentAttributes.customerCity) &&
        Objects.equals(this.customerCountry, documentAttributes.customerCountry) &&
        Objects.equals(this.viewed, documentAttributes.viewed) &&
        Objects.equals(this.starred, documentAttributes.starred) &&
        Objects.equals(this.checked, documentAttributes.checked) &&
        Objects.equals(this.versions, documentAttributes.versions) &&
        Objects.equals(this.createdAt, documentAttributes.createdAt) &&
        Objects.equals(this.updatedAt, documentAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, assignedId, supplierAssignedId, customerAssignedId, issueDate, currency, amount, tax, supplierName, supplierStreetAddress, supplierCity, supplierCountry, customerName, customerStreetAddress, customerCity, customerCountry, viewed, starred, checked, versions, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentAttributes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    assignedId: ").append(toIndentedString(assignedId)).append("\n");
    sb.append("    supplierAssignedId: ").append(toIndentedString(supplierAssignedId)).append("\n");
    sb.append("    customerAssignedId: ").append(toIndentedString(customerAssignedId)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    supplierName: ").append(toIndentedString(supplierName)).append("\n");
    sb.append("    supplierStreetAddress: ").append(toIndentedString(supplierStreetAddress)).append("\n");
    sb.append("    supplierCity: ").append(toIndentedString(supplierCity)).append("\n");
    sb.append("    supplierCountry: ").append(toIndentedString(supplierCountry)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerStreetAddress: ").append(toIndentedString(customerStreetAddress)).append("\n");
    sb.append("    customerCity: ").append(toIndentedString(customerCity)).append("\n");
    sb.append("    customerCountry: ").append(toIndentedString(customerCountry)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
    sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

