package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DocumentData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GenericDataRepresentationListDocumentData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:48:42.893Z")
public class GenericDataRepresentationListDocumentData {
  @SerializedName("data")
  private List<DocumentData> data = null;

  @SerializedName("links")
  private Map<String, String> links = null;

  @SerializedName("meta")
  private Map<String, Object> meta = null;

  public GenericDataRepresentationListDocumentData data(List<DocumentData> data) {
    this.data = data;
    return this;
  }

  public GenericDataRepresentationListDocumentData addDataItem(DocumentData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DocumentData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<DocumentData> getData() {
    return data;
  }

  public void setData(List<DocumentData> data) {
    this.data = data;
  }

  public GenericDataRepresentationListDocumentData links(Map<String, String> links) {
    this.links = links;
    return this;
  }

  public GenericDataRepresentationListDocumentData putLinksItem(String key, String linksItem) {
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

  public GenericDataRepresentationListDocumentData meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public GenericDataRepresentationListDocumentData putMetaItem(String key, Object metaItem) {
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
    GenericDataRepresentationListDocumentData genericDataRepresentationListDocumentData = (GenericDataRepresentationListDocumentData) o;
    return Objects.equals(this.data, genericDataRepresentationListDocumentData.data) &&
        Objects.equals(this.links, genericDataRepresentationListDocumentData.links) &&
        Objects.equals(this.meta, genericDataRepresentationListDocumentData.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericDataRepresentationListDocumentData {\n");
    
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

