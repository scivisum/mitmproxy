/*
 * BrowserUp MitmProxy
 * ___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.browserup.proxy_client;

import java.util.Objects;
import java.util.Arrays;
import com.browserup.proxy_client.HarEntry;
import com.browserup.proxy_client.HarLogCreator;
import com.browserup.proxy_client.Page;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.browserup.proxy_client.JSON;

/**
 * HarLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HarLog {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private HarLogCreator creator;

  public static final String SERIALIZED_NAME_BROWSER = "browser";
  @SerializedName(SERIALIZED_NAME_BROWSER)
  private HarLogCreator browser;

  public static final String SERIALIZED_NAME_PAGES = "pages";
  @SerializedName(SERIALIZED_NAME_PAGES)
  private List<Page> pages = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<HarEntry> entries = new ArrayList<>();

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public HarLog() {
  }

  public HarLog version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public HarLog creator(HarLogCreator creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nonnull

  public HarLogCreator getCreator() {
    return creator;
  }


  public void setCreator(HarLogCreator creator) {
    this.creator = creator;
  }


  public HarLog browser(HarLogCreator browser) {
    
    this.browser = browser;
    return this;
  }

   /**
   * Get browser
   * @return browser
  **/
  @javax.annotation.Nullable

  public HarLogCreator getBrowser() {
    return browser;
  }


  public void setBrowser(HarLogCreator browser) {
    this.browser = browser;
  }


  public HarLog pages(List<Page> pages) {
    
    this.pages = pages;
    return this;
  }

  public HarLog addPagesItem(Page pagesItem) {
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @javax.annotation.Nonnull

  public List<Page> getPages() {
    return pages;
  }


  public void setPages(List<Page> pages) {
    this.pages = pages;
  }


  public HarLog entries(List<HarEntry> entries) {
    
    this.entries = entries;
    return this;
  }

  public HarLog addEntriesItem(HarEntry entriesItem) {
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nonnull

  public List<HarEntry> getEntries() {
    return entries;
  }


  public void setEntries(List<HarEntry> entries) {
    this.entries = entries;
  }


  public HarLog comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HarLog harLog = (HarLog) o;
    return Objects.equals(this.version, harLog.version) &&
        Objects.equals(this.creator, harLog.creator) &&
        Objects.equals(this.browser, harLog.browser) &&
        Objects.equals(this.pages, harLog.pages) &&
        Objects.equals(this.entries, harLog.entries) &&
        Objects.equals(this.comment, harLog.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, creator, browser, pages, entries, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HarLog {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    browser: ").append(toIndentedString(browser)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("version");
    openapiFields.add("creator");
    openapiFields.add("browser");
    openapiFields.add("pages");
    openapiFields.add("entries");
    openapiFields.add("comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("creator");
    openapiRequiredFields.add("pages");
    openapiRequiredFields.add("entries");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HarLog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HarLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HarLog is not found in the empty JSON string", HarLog.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HarLog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HarLog` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HarLog.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // validate the required field `creator`
      HarLogCreator.validateJsonObject(jsonObj.getAsJsonObject("creator"));
      // validate the optional field `browser`
      if (jsonObj.get("browser") != null && !jsonObj.get("browser").isJsonNull()) {
        HarLogCreator.validateJsonObject(jsonObj.getAsJsonObject("browser"));
      }
      // ensure the required json array is present
      if (jsonObj.get("pages") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("pages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pages` to be an array in the JSON string but got `%s`", jsonObj.get("pages").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("entries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
      }

      JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
      // validate the required field `entries` (array)
      for (int i = 0; i < jsonArrayentries.size(); i++) {
        HarEntry.validateJsonObject(jsonArrayentries.get(i).getAsJsonObject());
      };
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HarLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HarLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HarLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HarLog.class));

       return (TypeAdapter<T>) new TypeAdapter<HarLog>() {
           @Override
           public void write(JsonWriter out, HarLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HarLog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HarLog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HarLog
  * @throws IOException if the JSON string is invalid with respect to HarLog
  */
  public static HarLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HarLog.class);
  }

 /**
  * Convert an instance of HarLog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

