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
 * PartyAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T21:47:11.040Z")
public class PartyAttributes {
  @SerializedName("assignedId")
  private String assignedId = null;

  @SerializedName("name")
  private String name = null;

  public PartyAttributes assignedId(String assignedId) {
    this.assignedId = assignedId;
    return this;
  }

   /**
   * Get assignedId
   * @return assignedId
  **/
  @ApiModelProperty(value = "")
  public String getAssignedId() {
    return assignedId;
  }

  public void setAssignedId(String assignedId) {
    this.assignedId = assignedId;
  }

  public PartyAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartyAttributes partyAttributes = (PartyAttributes) o;
    return Objects.equals(this.assignedId, partyAttributes.assignedId) &&
        Objects.equals(this.name, partyAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartyAttributes {\n");
    
    sb.append("    assignedId: ").append(toIndentedString(assignedId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

