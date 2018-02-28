package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SpaceCollaborators;
import io.swagger.client.model.SpaceOwnedBy;
import java.io.IOException;

/**
 * SpaceRelationships
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:47:11.040Z")
public class SpaceRelationships {
  @SerializedName("ownedBy")
  private SpaceOwnedBy ownedBy = null;

  @SerializedName("collaborators")
  private SpaceCollaborators collaborators = null;

  public SpaceRelationships ownedBy(SpaceOwnedBy ownedBy) {
    this.ownedBy = ownedBy;
    return this;
  }

   /**
   * Get ownedBy
   * @return ownedBy
  **/
  @ApiModelProperty(value = "")
  public SpaceOwnedBy getOwnedBy() {
    return ownedBy;
  }

  public void setOwnedBy(SpaceOwnedBy ownedBy) {
    this.ownedBy = ownedBy;
  }

  public SpaceRelationships collaborators(SpaceCollaborators collaborators) {
    this.collaborators = collaborators;
    return this;
  }

   /**
   * Get collaborators
   * @return collaborators
  **/
  @ApiModelProperty(value = "")
  public SpaceCollaborators getCollaborators() {
    return collaborators;
  }

  public void setCollaborators(SpaceCollaborators collaborators) {
    this.collaborators = collaborators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceRelationships spaceRelationships = (SpaceRelationships) o;
    return Objects.equals(this.ownedBy, spaceRelationships.ownedBy) &&
        Objects.equals(this.collaborators, spaceRelationships.collaborators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownedBy, collaborators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceRelationships {\n");
    
    sb.append("    ownedBy: ").append(toIndentedString(ownedBy)).append("\n");
    sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
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

