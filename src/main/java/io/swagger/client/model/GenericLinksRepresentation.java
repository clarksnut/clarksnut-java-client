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

/**
 * GenericLinksRepresentation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:25:36.501Z")
public class GenericLinksRepresentation {
  @SerializedName("self")
  private String self = null;

  @SerializedName("related")
  private String related = null;

  @SerializedName("meta")
  private String meta = null;

  public GenericLinksRepresentation self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public GenericLinksRepresentation related(String related) {
    this.related = related;
    return this;
  }

   /**
   * Get related
   * @return related
  **/
  @ApiModelProperty(value = "")
  public String getRelated() {
    return related;
  }

  public void setRelated(String related) {
    this.related = related;
  }

  public GenericLinksRepresentation meta(String meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public String getMeta() {
    return meta;
  }

  public void setMeta(String meta) {
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
    GenericLinksRepresentation genericLinksRepresentation = (GenericLinksRepresentation) o;
    return Objects.equals(this.self, genericLinksRepresentation.self) &&
        Objects.equals(this.related, genericLinksRepresentation.related) &&
        Objects.equals(this.meta, genericLinksRepresentation.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, related, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericLinksRepresentation {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
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

