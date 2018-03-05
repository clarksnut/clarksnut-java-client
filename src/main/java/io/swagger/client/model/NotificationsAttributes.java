package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RequestData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * NotificationsAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:25:36.501Z")
public class NotificationsAttributes {
  @SerializedName("requestAccesses")
  private List<RequestData> requestAccesses = null;

  public NotificationsAttributes requestAccesses(List<RequestData> requestAccesses) {
    this.requestAccesses = requestAccesses;
    return this;
  }

  public NotificationsAttributes addRequestAccessesItem(RequestData requestAccessesItem) {
    if (this.requestAccesses == null) {
      this.requestAccesses = new ArrayList<RequestData>();
    }
    this.requestAccesses.add(requestAccessesItem);
    return this;
  }

   /**
   * Get requestAccesses
   * @return requestAccesses
  **/
  @ApiModelProperty(value = "")
  public List<RequestData> getRequestAccesses() {
    return requestAccesses;
  }

  public void setRequestAccesses(List<RequestData> requestAccesses) {
    this.requestAccesses = requestAccesses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationsAttributes notificationsAttributes = (NotificationsAttributes) o;
    return Objects.equals(this.requestAccesses, notificationsAttributes.requestAccesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestAccesses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationsAttributes {\n");
    
    sb.append("    requestAccesses: ").append(toIndentedString(requestAccesses)).append("\n");
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

