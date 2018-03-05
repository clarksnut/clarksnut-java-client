package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PartyData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GenericDataRepresentationListPartyData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:20:58.350Z")
public class GenericDataRepresentationListPartyData {
  @SerializedName("data")
  private List<PartyData> data = null;

  @SerializedName("links")
  private Map<String, String> links = null;

  @SerializedName("meta")
  private Map<String, Object> meta = null;

  public GenericDataRepresentationListPartyData data(List<PartyData> data) {
    this.data = data;
    return this;
  }

  public GenericDataRepresentationListPartyData addDataItem(PartyData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<PartyData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<PartyData> getData() {
    return data;
  }

  public void setData(List<PartyData> data) {
    this.data = data;
  }

  public GenericDataRepresentationListPartyData links(Map<String, String> links) {
    this.links = links;
    return this;
  }

  public GenericDataRepresentationListPartyData putLinksItem(String key, String linksItem) {
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

  public GenericDataRepresentationListPartyData meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public GenericDataRepresentationListPartyData putMetaItem(String key, Object metaItem) {
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
    GenericDataRepresentationListPartyData genericDataRepresentationListPartyData = (GenericDataRepresentationListPartyData) o;
    return Objects.equals(this.data, genericDataRepresentationListPartyData.data) &&
        Objects.equals(this.links, genericDataRepresentationListPartyData.links) &&
        Objects.equals(this.meta, genericDataRepresentationListPartyData.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericDataRepresentationListPartyData {\n");
    
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

