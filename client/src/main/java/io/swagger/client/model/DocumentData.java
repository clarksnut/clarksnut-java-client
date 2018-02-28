package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DocumentAttributes;
import io.swagger.client.model.DocumentLink;
import io.swagger.client.model.DocumentRelationships;
import java.io.IOException;

/**
 * DocumentData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:47:11.040Z")
public class DocumentData {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("attributes")
  private DocumentAttributes attributes = null;

  @SerializedName("relationships")
  private DocumentRelationships relationships = null;

  @SerializedName("links")
  private DocumentLink links = null;

  public DocumentData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DocumentData type(String type) {
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

  public DocumentData attributes(DocumentAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public DocumentAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(DocumentAttributes attributes) {
    this.attributes = attributes;
  }

  public DocumentData relationships(DocumentRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")
  public DocumentRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(DocumentRelationships relationships) {
    this.relationships = relationships;
  }

  public DocumentData links(DocumentLink links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public DocumentLink getLinks() {
    return links;
  }

  public void setLinks(DocumentLink links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentData documentData = (DocumentData) o;
    return Objects.equals(this.id, documentData.id) &&
        Objects.equals(this.type, documentData.type) &&
        Objects.equals(this.attributes, documentData.attributes) &&
        Objects.equals(this.relationships, documentData.relationships) &&
        Objects.equals(this.links, documentData.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, attributes, relationships, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

