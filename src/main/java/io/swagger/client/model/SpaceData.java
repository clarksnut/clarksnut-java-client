package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GenericLinksRepresentation;
import io.swagger.client.model.SpaceAttributes;
import io.swagger.client.model.SpaceRelationships;
import java.io.IOException;

/**
 * SpaceData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:20:58.350Z")
public class SpaceData {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("attributes")
  private SpaceAttributes attributes = null;

  @SerializedName("relationships")
  private SpaceRelationships relationships = null;

  @SerializedName("links")
  private GenericLinksRepresentation links = null;

  public SpaceData id(String id) {
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

  public SpaceData type(String type) {
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

  public SpaceData attributes(SpaceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public SpaceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SpaceAttributes attributes) {
    this.attributes = attributes;
  }

  public SpaceData relationships(SpaceRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")
  public SpaceRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(SpaceRelationships relationships) {
    this.relationships = relationships;
  }

  public SpaceData links(GenericLinksRepresentation links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public GenericLinksRepresentation getLinks() {
    return links;
  }

  public void setLinks(GenericLinksRepresentation links) {
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
    SpaceData spaceData = (SpaceData) o;
    return Objects.equals(this.id, spaceData.id) &&
        Objects.equals(this.type, spaceData.type) &&
        Objects.equals(this.attributes, spaceData.attributes) &&
        Objects.equals(this.relationships, spaceData.relationships) &&
        Objects.equals(this.links, spaceData.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, attributes, relationships, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceData {\n");
    
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

