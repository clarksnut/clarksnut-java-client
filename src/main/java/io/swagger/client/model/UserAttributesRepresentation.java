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
import org.threeten.bp.OffsetDateTime;

/**
 * UserAttributesRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:48:42.893Z")
public class UserAttributesRepresentation {
  @SerializedName("userID")
  private String userID = null;

  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("imageURL")
  private String imageURL = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("registrationCompleted")
  private Boolean registrationCompleted = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("bio")
  private String bio = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("providerType")
  private String providerType = null;

  @SerializedName("defaultLanguage")
  private String defaultLanguage = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public UserAttributesRepresentation userID(String userID) {
    this.userID = userID;
    return this;
  }

   /**
   * Get userID
   * @return userID
  **/
  @ApiModelProperty(value = "")
  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public UserAttributesRepresentation fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserAttributesRepresentation imageURL(String imageURL) {
    this.imageURL = imageURL;
    return this;
  }

   /**
   * Get imageURL
   * @return imageURL
  **/
  @ApiModelProperty(value = "")
  public String getImageURL() {
    return imageURL;
  }

  public void setImageURL(String imageURL) {
    this.imageURL = imageURL;
  }

  public UserAttributesRepresentation username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserAttributesRepresentation registrationCompleted(Boolean registrationCompleted) {
    this.registrationCompleted = registrationCompleted;
    return this;
  }

   /**
   * Get registrationCompleted
   * @return registrationCompleted
  **/
  @ApiModelProperty(value = "")
  public Boolean isRegistrationCompleted() {
    return registrationCompleted;
  }

  public void setRegistrationCompleted(Boolean registrationCompleted) {
    this.registrationCompleted = registrationCompleted;
  }

  public UserAttributesRepresentation email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserAttributesRepresentation bio(String bio) {
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @ApiModelProperty(value = "")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public UserAttributesRepresentation url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public UserAttributesRepresentation company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public UserAttributesRepresentation providerType(String providerType) {
    this.providerType = providerType;
    return this;
  }

   /**
   * Get providerType
   * @return providerType
  **/
  @ApiModelProperty(value = "")
  public String getProviderType() {
    return providerType;
  }

  public void setProviderType(String providerType) {
    this.providerType = providerType;
  }

  public UserAttributesRepresentation defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

   /**
   * Get defaultLanguage
   * @return defaultLanguage
  **/
  @ApiModelProperty(value = "")
  public String getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public UserAttributesRepresentation createdAt(OffsetDateTime createdAt) {
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

  public UserAttributesRepresentation updatedAt(OffsetDateTime updatedAt) {
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
    UserAttributesRepresentation userAttributesRepresentation = (UserAttributesRepresentation) o;
    return Objects.equals(this.userID, userAttributesRepresentation.userID) &&
        Objects.equals(this.fullName, userAttributesRepresentation.fullName) &&
        Objects.equals(this.imageURL, userAttributesRepresentation.imageURL) &&
        Objects.equals(this.username, userAttributesRepresentation.username) &&
        Objects.equals(this.registrationCompleted, userAttributesRepresentation.registrationCompleted) &&
        Objects.equals(this.email, userAttributesRepresentation.email) &&
        Objects.equals(this.bio, userAttributesRepresentation.bio) &&
        Objects.equals(this.url, userAttributesRepresentation.url) &&
        Objects.equals(this.company, userAttributesRepresentation.company) &&
        Objects.equals(this.providerType, userAttributesRepresentation.providerType) &&
        Objects.equals(this.defaultLanguage, userAttributesRepresentation.defaultLanguage) &&
        Objects.equals(this.createdAt, userAttributesRepresentation.createdAt) &&
        Objects.equals(this.updatedAt, userAttributesRepresentation.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userID, fullName, imageURL, username, registrationCompleted, email, bio, url, company, providerType, defaultLanguage, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAttributesRepresentation {\n");
    
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    imageURL: ").append(toIndentedString(imageURL)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    registrationCompleted: ").append(toIndentedString(registrationCompleted)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
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

