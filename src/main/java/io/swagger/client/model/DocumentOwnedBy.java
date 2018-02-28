package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SpaceData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentOwnedBy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T23:15:11.911Z")
public class DocumentOwnedBy {
  @SerializedName("data")
  private List<SpaceData> data = null;

  public DocumentOwnedBy data(List<SpaceData> data) {
    this.data = data;
    return this;
  }

  public DocumentOwnedBy addDataItem(SpaceData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<SpaceData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<SpaceData> getData() {
    return data;
  }

  public void setData(List<SpaceData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentOwnedBy documentOwnedBy = (DocumentOwnedBy) o;
    return Objects.equals(this.data, documentOwnedBy.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentOwnedBy {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

