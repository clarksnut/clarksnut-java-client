package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MediaType;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * InputPart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:47:11.040Z")
public class InputPart {
  @SerializedName("contentTypeFromMessage")
  private Boolean contentTypeFromMessage = null;

  @SerializedName("bodyAsString")
  private String bodyAsString = null;

  @SerializedName("headers")
  private Map<String, List<String>> headers = null;

  @SerializedName("mediaType")
  private MediaType mediaType = null;

  public InputPart contentTypeFromMessage(Boolean contentTypeFromMessage) {
    this.contentTypeFromMessage = contentTypeFromMessage;
    return this;
  }

   /**
   * Get contentTypeFromMessage
   * @return contentTypeFromMessage
  **/
  @ApiModelProperty(value = "")
  public Boolean isContentTypeFromMessage() {
    return contentTypeFromMessage;
  }

  public void setContentTypeFromMessage(Boolean contentTypeFromMessage) {
    this.contentTypeFromMessage = contentTypeFromMessage;
  }

  public InputPart bodyAsString(String bodyAsString) {
    this.bodyAsString = bodyAsString;
    return this;
  }

   /**
   * Get bodyAsString
   * @return bodyAsString
  **/
  @ApiModelProperty(value = "")
  public String getBodyAsString() {
    return bodyAsString;
  }

  public void setBodyAsString(String bodyAsString) {
    this.bodyAsString = bodyAsString;
  }

  public InputPart headers(Map<String, List<String>> headers) {
    this.headers = headers;
    return this;
  }

  public InputPart putHeadersItem(String key, List<String> headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, List<String>>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, List<String>> headers) {
    this.headers = headers;
  }

  public InputPart mediaType(MediaType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @ApiModelProperty(value = "")
  public MediaType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaType mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputPart inputPart = (InputPart) o;
    return Objects.equals(this.contentTypeFromMessage, inputPart.contentTypeFromMessage) &&
        Objects.equals(this.bodyAsString, inputPart.bodyAsString) &&
        Objects.equals(this.headers, inputPart.headers) &&
        Objects.equals(this.mediaType, inputPart.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentTypeFromMessage, bodyAsString, headers, mediaType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputPart {\n");
    
    sb.append("    contentTypeFromMessage: ").append(toIndentedString(contentTypeFromMessage)).append("\n");
    sb.append("    bodyAsString: ").append(toIndentedString(bodyAsString)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

