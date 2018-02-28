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
 * GenericDataRepresentationListUserData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:48:42.893Z")
public class GenericDataRepresentationListUserData {
  @SerializedName("data")
  private List<UserData> data = null;

  @SerializedName("links")
  private Map<String, String> links = null;

  @SerializedName("meta")
  private Map<String, Object> meta = null;

  public GenericDataRepresentationListUserData data(List<UserData> data) {
    this.data = data;
    return this;
  }

  public GenericDataRepresentationListUserData addDataItem(UserData dataItem) {
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

  public GenericDataRepresentationListUserData links(Map<String, String> links) {
    this.links = links;
    return this;
  }

  public GenericDataRepresentationListUserData putLinksItem(String key, String linksItem) {
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

  public GenericDataRepresentationListUserData meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public GenericDataRepresentationListUserData putMetaItem(String key, Object metaItem) {
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
    GenericDataRepresentationListUserData genericDataRepresentationListUserData = (GenericDataRepresentationListUserData) o;
    return Objects.equals(this.data, genericDataRepresentationListUserData.data) &&
        Objects.equals(this.links, genericDataRepresentationListUserData.links) &&
        Objects.equals(this.meta, genericDataRepresentationListUserData.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericDataRepresentationListUserData {\n");
    
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

