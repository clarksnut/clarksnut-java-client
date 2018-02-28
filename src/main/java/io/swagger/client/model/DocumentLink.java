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
 * DocumentLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-28T23:15:11.911Z")
public class DocumentLink {
  @SerializedName("self")
  private String self = null;

  @SerializedName("filelink")
  private String filelink = null;

  public DocumentLink self(String self) {
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

  public DocumentLink filelink(String filelink) {
    this.filelink = filelink;
    return this;
  }

   /**
   * Get filelink
   * @return filelink
  **/
  @ApiModelProperty(value = "")
  public String getFilelink() {
    return filelink;
  }

  public void setFilelink(String filelink) {
    this.filelink = filelink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentLink documentLink = (DocumentLink) o;
    return Objects.equals(this.self, documentLink.self) &&
        Objects.equals(this.filelink, documentLink.filelink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, filelink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentLink {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    filelink: ").append(toIndentedString(filelink)).append("\n");
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

