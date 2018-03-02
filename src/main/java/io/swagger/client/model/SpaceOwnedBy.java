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
import io.swagger.client.model.UserData;
import java.io.IOException;

/**
 * SpaceOwnedBy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-02T13:36:37.501Z")
public class SpaceOwnedBy {
  @SerializedName("data")
  private UserData data = null;

  @SerializedName("links")
  private GenericLinksRepresentation links = null;

  public SpaceOwnedBy data(UserData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public UserData getData() {
    return data;
  }

  public void setData(UserData data) {
    this.data = data;
  }

  public SpaceOwnedBy links(GenericLinksRepresentation links) {
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
    SpaceOwnedBy spaceOwnedBy = (SpaceOwnedBy) o;
    return Objects.equals(this.data, spaceOwnedBy.data) &&
        Objects.equals(this.links, spaceOwnedBy.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceOwnedBy {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

