package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TypedGenericDataRepresentationListUserData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-02T13:36:37.501Z")
public class TypedGenericDataRepresentationListUserData {
  @SerializedName("data")
  private List<UserData> data = null;

  @SerializedName("links")
  private Map<String, String> links = null;

  @SerializedName("meta")
  private Map<String, Object> meta = null;

  public TypedGenericDataRepresentationListUserData data(List<UserData> data) {
    this.data = data;
    return this;
  }

  public TypedGenericDataRepresentationListUserData addDataItem(UserData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<UserData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<UserData> getData() {
    return data;
  }

  public void setData(List<UserData> data) {
    this.data = data;
  }

  public TypedGenericDataRepresentationListUserData links(Map<String, String> links) {
    this.links = links;
    return this;
  }

  public TypedGenericDataRepresentationListUserData putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, String>();
    }
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) {
    this.links = links;
  }

  public TypedGenericDataRepresentationListUserData meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public TypedGenericDataRepresentationListUserData putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<String, Object>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypedGenericDataRepresentationListUserData typedGenericDataRepresentationListUserData = (TypedGenericDataRepresentationListUserData) o;
    return Objects.equals(this.data, typedGenericDataRepresentationListUserData.data) &&
        Objects.equals(this.links, typedGenericDataRepresentationListUserData.links) &&
        Objects.equals(this.meta, typedGenericDataRepresentationListUserData.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypedGenericDataRepresentationListUserData {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

