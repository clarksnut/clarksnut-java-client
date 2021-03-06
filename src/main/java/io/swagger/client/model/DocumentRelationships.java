package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.OwnedBy;
import java.io.IOException;

/**
 * DocumentRelationships
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:48:42.893Z")
public class DocumentRelationships {
  @SerializedName("ownedBy")
  private OwnedBy ownedBy = null;

  public DocumentRelationships ownedBy(OwnedBy ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

   /**
   * Get ownedBy
   * @return ownedBy
  **/
  @ApiModelProperty(value = "")
  public OwnedBy getOwnedBy() {
    return ownedBy;
  }

  public void setOwnedBy(OwnedBy ownedBy) {
    this.ownedBy = ownedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentRelationships documentRelationships = (DocumentRelationships) o;
    return Objects.equals(this.ownedBy, documentRelationships.ownedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentRelationships {\n");
    
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
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

