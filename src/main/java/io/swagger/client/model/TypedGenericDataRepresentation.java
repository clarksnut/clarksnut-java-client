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
 * TypedGenericDataRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:48:42.893Z")
public class TypedGenericDataRepresentation {
  @SerializedName("data")
  private Object data = null;

  @SerializedName("links")
  private Map<String, String> links = null;

  @SerializedName("meta")
  private Map<String, Object> meta = null;

  public TypedGenericDataRepresentation data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public TypedGenericDataRepresentation links(Map<String, String> links) {
    this.links = links;
    return this;
  }

  public TypedGenericDataRepresentation putLinksItem(String key, String linksItem) {
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

  public TypedGenericDataRepresentation meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public TypedGenericDataRepresentation putMetaItem(String key, Object metaItem) {
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
    TypedGenericDataRepresentation typedGenericDataRepresentation = (TypedGenericDataRepresentation) o;
    return Objects.equals(this.data, typedGenericDataRepresentation.data) &&
        Objects.equals(this.links, typedGenericDataRepresentation.links) &&
        Objects.equals(this.meta, typedGenericDataRepresentation.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypedGenericDataRepresentation {\n");
    
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

