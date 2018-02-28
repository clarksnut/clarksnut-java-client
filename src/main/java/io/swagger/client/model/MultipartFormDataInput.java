package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InputPart;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MultipartFormDataInput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:48:42.893Z")
public class MultipartFormDataInput {
  @SerializedName("formDataMap")
  private Map<String, List<InputPart>> formDataMap = null;

  @SerializedName("formData")
  private Map<String, InputPart> formData = null;

  @SerializedName("parts")
  private List<InputPart> parts = null;

  @SerializedName("preamble")
  private String preamble = null;

  public MultipartFormDataInput formDataMap(Map<String, List<InputPart>> formDataMap) {
    this.formDataMap = formDataMap;
    return this;
  }

  public MultipartFormDataInput putFormDataMapItem(String key, List<InputPart> formDataMapItem) {
    if (this.formDataMap == null) {
      this.formDataMap = new HashMap<String, List<InputPart>>();
    }
    this.formDataMap.put(key, formDataMapItem);
    return this;
  }

   /**
   * Get formDataMap
   * @return formDataMap
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<InputPart>> getFormDataMap() {
    return formDataMap;
  }

  public void setFormDataMap(Map<String, List<InputPart>> formDataMap) {
    this.formDataMap = formDataMap;
  }

  public MultipartFormDataInput formData(Map<String, InputPart> formData) {
    this.formData = formData;
    return this;
  }

  public MultipartFormDataInput putFormDataItem(String key, InputPart formDataItem) {
    if (this.formData == null) {
      this.formData = new HashMap<String, InputPart>();
    }
    this.formData.put(key, formDataItem);
    return this;
  }

   /**
   * Get formData
   * @return formData
  **/
  @ApiModelProperty(value = "")
  public Map<String, InputPart> getFormData() {
    return formData;
  }

  public void setFormData(Map<String, InputPart> formData) {
    this.formData = formData;
  }

  public MultipartFormDataInput parts(List<InputPart> parts) {
    this.parts = parts;
    return this;
  }

  public MultipartFormDataInput addPartsItem(InputPart partsItem) {
    if (this.parts == null) {
      this.parts = new ArrayList<InputPart>();
    }
    this.parts.add(partsItem);
    return this;
  }

   /**
   * Get parts
   * @return parts
  **/
  @ApiModelProperty(value = "")
  public List<InputPart> getParts() {
    return parts;
  }

  public void setParts(List<InputPart> parts) {
    this.parts = parts;
  }

  public MultipartFormDataInput preamble(String preamble) {
    this.preamble = preamble;
    return this;
  }

   /**
   * Get preamble
   * @return preamble
  **/
  @ApiModelProperty(value = "")
  public String getPreamble() {
    return preamble;
  }

  public void setPreamble(String preamble) {
    this.preamble = preamble;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipartFormDataInput multipartFormDataInput = (MultipartFormDataInput) o;
    return Objects.equals(this.formDataMap, multipartFormDataInput.formDataMap) &&
        Objects.equals(this.formData, multipartFormDataInput.formData) &&
        Objects.equals(this.parts, multipartFormDataInput.parts) &&
        Objects.equals(this.preamble, multipartFormDataInput.preamble);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formDataMap, formData, parts, preamble);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipartFormDataInput {\n");
    
    sb.append("    formDataMap: ").append(toIndentedString(formDataMap)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    preamble: ").append(toIndentedString(preamble)).append("\n");
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

