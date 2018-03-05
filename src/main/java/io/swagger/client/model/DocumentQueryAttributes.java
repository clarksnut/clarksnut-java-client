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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DocumentQueryAttributes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-05T15:20:58.350Z")
public class DocumentQueryAttributes {
  /**
   * Gets or Sets role
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    SENDER("SENDER"),
    
    RECEIVER("RECEIVER");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RoleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  @SerializedName("filterText")
  private String filterText = null;

  @SerializedName("types")
  private List<String> types = null;

  @SerializedName("currencies")
  private List<String> currencies = null;

  @SerializedName("after")
  private OffsetDateTime after = null;

  @SerializedName("before")
  private OffsetDateTime before = null;

  @SerializedName("lessThan")
  private Float lessThan = null;

  @SerializedName("greaterThan")
  private Float greaterThan = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("spaces")
  private List<String> spaces = null;

  @SerializedName("orderBy")
  private String orderBy = null;

  @SerializedName("asc")
  private Boolean asc = null;

  @SerializedName("offset")
  private Integer offset = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("starred")
  private Boolean starred = null;

  @SerializedName("viewed")
  private Boolean viewed = null;

  @SerializedName("checked")
  private Boolean checked = null;

  public DocumentQueryAttributes role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public DocumentQueryAttributes filterText(String filterText) {
    this.filterText = filterText;
    return this;
  }

   /**
   * Get filterText
   * @return filterText
  **/
  @ApiModelProperty(value = "")
  public String getFilterText() {
    return filterText;
  }

  public void setFilterText(String filterText) {
    this.filterText = filterText;
  }

  public DocumentQueryAttributes types(List<String> types) {
    this.types = types;
    return this;
  }

  public DocumentQueryAttributes addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @ApiModelProperty(value = "")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public DocumentQueryAttributes currencies(List<String> currencies) {
    this.currencies = currencies;
    return this;
  }

  public DocumentQueryAttributes addCurrenciesItem(String currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<String>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * Get currencies
   * @return currencies
  **/
  @ApiModelProperty(value = "")
  public List<String> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<String> currencies) {
    this.currencies = currencies;
  }

  public DocumentQueryAttributes after(OffsetDateTime after) {
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getAfter() {
    return after;
  }

  public void setAfter(OffsetDateTime after) {
    this.after = after;
  }

  public DocumentQueryAttributes before(OffsetDateTime before) {
    this.before = before;
    return this;
  }

   /**
   * Get before
   * @return before
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBefore() {
    return before;
  }

  public void setBefore(OffsetDateTime before) {
    this.before = before;
  }

  public DocumentQueryAttributes lessThan(Float lessThan) {
    this.lessThan = lessThan;
    return this;
  }

   /**
   * Get lessThan
   * @return lessThan
  **/
  @ApiModelProperty(value = "")
  public Float getLessThan() {
    return lessThan;
  }

  public void setLessThan(Float lessThan) {
    this.lessThan = lessThan;
  }

  public DocumentQueryAttributes greaterThan(Float greaterThan) {
    this.greaterThan = greaterThan;
    return this;
  }

   /**
   * Get greaterThan
   * @return greaterThan
  **/
  @ApiModelProperty(value = "")
  public Float getGreaterThan() {
    return greaterThan;
  }

  public void setGreaterThan(Float greaterThan) {
    this.greaterThan = greaterThan;
  }

  public DocumentQueryAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public DocumentQueryAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public DocumentQueryAttributes spaces(List<String> spaces) {
    this.spaces = spaces;
    return this;
  }

  public DocumentQueryAttributes addSpacesItem(String spacesItem) {
    if (this.spaces == null) {
      this.spaces = new ArrayList<String>();
    }
    this.spaces.add(spacesItem);
    return this;
  }

   /**
   * Get spaces
   * @return spaces
  **/
  @ApiModelProperty(value = "")
  public List<String> getSpaces() {
    return spaces;
  }

  public void setSpaces(List<String> spaces) {
    this.spaces = spaces;
  }

  public DocumentQueryAttributes orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @ApiModelProperty(value = "")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public DocumentQueryAttributes asc(Boolean asc) {
    this.asc = asc;
    return this;
  }

   /**
   * Get asc
   * @return asc
  **/
  @ApiModelProperty(value = "")
  public Boolean isAsc() {
    return asc;
  }

  public void setAsc(Boolean asc) {
    this.asc = asc;
  }

  public DocumentQueryAttributes offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @ApiModelProperty(value = "")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public DocumentQueryAttributes limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public DocumentQueryAttributes starred(Boolean starred) {
    this.starred = starred;
    return this;
  }

   /**
   * Get starred
   * @return starred
  **/
  @ApiModelProperty(value = "")
  public Boolean isStarred() {
    return starred;
  }

  public void setStarred(Boolean starred) {
    this.starred = starred;
  }

  public DocumentQueryAttributes viewed(Boolean viewed) {
    this.viewed = viewed;
    return this;
  }

   /**
   * Get viewed
   * @return viewed
  **/
  @ApiModelProperty(value = "")
  public Boolean isViewed() {
    return viewed;
  }

  public void setViewed(Boolean viewed) {
    this.viewed = viewed;
  }

  public DocumentQueryAttributes checked(Boolean checked) {
    this.checked = checked;
    return this;
  }

   /**
   * Get checked
   * @return checked
  **/
  @ApiModelProperty(value = "")
  public Boolean isChecked() {
    return checked;
  }

  public void setChecked(Boolean checked) {
    this.checked = checked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentQueryAttributes documentQueryAttributes = (DocumentQueryAttributes) o;
    return Objects.equals(this.role, documentQueryAttributes.role) &&
        Objects.equals(this.filterText, documentQueryAttributes.filterText) &&
        Objects.equals(this.types, documentQueryAttributes.types) &&
        Objects.equals(this.currencies, documentQueryAttributes.currencies) &&
        Objects.equals(this.after, documentQueryAttributes.after) &&
        Objects.equals(this.before, documentQueryAttributes.before) &&
        Objects.equals(this.lessThan, documentQueryAttributes.lessThan) &&
        Objects.equals(this.greaterThan, documentQueryAttributes.greaterThan) &&
        Objects.equals(this.tags, documentQueryAttributes.tags) &&
        Objects.equals(this.spaces, documentQueryAttributes.spaces) &&
        Objects.equals(this.orderBy, documentQueryAttributes.orderBy) &&
        Objects.equals(this.asc, documentQueryAttributes.asc) &&
        Objects.equals(this.offset, documentQueryAttributes.offset) &&
        Objects.equals(this.limit, documentQueryAttributes.limit) &&
        Objects.equals(this.starred, documentQueryAttributes.starred) &&
        Objects.equals(this.viewed, documentQueryAttributes.viewed) &&
        Objects.equals(this.checked, documentQueryAttributes.checked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, filterText, types, currencies, after, before, lessThan, greaterThan, tags, spaces, orderBy, asc, offset, limit, starred, viewed, checked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentQueryAttributes {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    filterText: ").append(toIndentedString(filterText)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    lessThan: ").append(toIndentedString(lessThan)).append("\n");
    sb.append("    greaterThan: ").append(toIndentedString(greaterThan)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    spaces: ").append(toIndentedString(spaces)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    asc: ").append(toIndentedString(asc)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
    sb.append("    viewed: ").append(toIndentedString(viewed)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
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

