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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MediaType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:47:11.040Z")
public class MediaType {
  @SerializedName("type")
  private String type = null;

  @SerializedName("subtype")
  private String subtype = null;

  @SerializedName("parameters")
  private Map<String, String> parameters = null;

  @SerializedName("wildcardType")
  private Boolean wildcardType = null;

  @SerializedName("wildcardSubtype")
  private Boolean wildcardSubtype = null;

  public MediaType type(String type) {
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

  public MediaType subtype(String subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @ApiModelProperty(value = "")
  public String getSubtype() {
    return subtype;
  }

  public void setSubtype(String subtype) {
    this.subtype = subtype;
  }

  public MediaType parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public MediaType putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, String>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public MediaType wildcardType(Boolean wildcardType) {
    this.wildcardType = wildcardType;
    return this;
  }

   /**
   * Get wildcardType
   * @return wildcardType
  **/
  @ApiModelProperty(value = "")
  public Boolean isWildcardType() {
    return wildcardType;
  }

  public void setWildcardType(Boolean wildcardType) {
    this.wildcardType = wildcardType;
  }

  public MediaType wildcardSubtype(Boolean wildcardSubtype) {
    this.wildcardSubtype = wildcardSubtype;
    return this;
  }

   /**
   * Get wildcardSubtype
   * @return wildcardSubtype
  **/
  @ApiModelProperty(value = "")
  public Boolean isWildcardSubtype() {
    return wildcardSubtype;
  }

  public void setWildcardSubtype(Boolean wildcardSubtype) {
    this.wildcardSubtype = wildcardSubtype;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaType mediaType = (MediaType) o;
    return Objects.equals(this.type, mediaType.type) &&
        Objects.equals(this.subtype, mediaType.subtype) &&
        Objects.equals(this.parameters, mediaType.parameters) &&
        Objects.equals(this.wildcardType, mediaType.wildcardType) &&
        Objects.equals(this.wildcardSubtype, mediaType.wildcardSubtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtype, parameters, wildcardType, wildcardSubtype);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaType {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    wildcardType: ").append(toIndentedString(wildcardType)).append("\n");
    sb.append("    wildcardSubtype: ").append(toIndentedString(wildcardSubtype)).append("\n");
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

