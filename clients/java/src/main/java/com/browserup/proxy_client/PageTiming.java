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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;

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
 * PageTiming
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageTiming {
  public static final String SERIALIZED_NAME_FIRST_INPUT_DELAY = "_firstInputDelay";
  @SerializedName(SERIALIZED_NAME_FIRST_INPUT_DELAY)
  private BigDecimal firstInputDelay;

  public static final String SERIALIZED_NAME_DOM_INTERACTIVE = "_domInteractive";
  @SerializedName(SERIALIZED_NAME_DOM_INTERACTIVE)
  private BigDecimal domInteractive;

  public static final String SERIALIZED_NAME_CUMULATIVE_LAYOUT_SHIFT = "_cumulativeLayoutShift";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_LAYOUT_SHIFT)
  private BigDecimal cumulativeLayoutShift;

  public static final String SERIALIZED_NAME_DNS = "_dns";
  @SerializedName(SERIALIZED_NAME_DNS)
  private BigDecimal dns;

  public static final String SERIALIZED_NAME_HREF = "_href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_FIRST_PAINT = "_firstPaint";
  @SerializedName(SERIALIZED_NAME_FIRST_PAINT)
  private BigDecimal firstPaint;

  public static final String SERIALIZED_NAME_LARGEST_CONTENTFUL_PAINT = "_largestContentfulPaint";
  @SerializedName(SERIALIZED_NAME_LARGEST_CONTENTFUL_PAINT)
  private BigDecimal largestContentfulPaint;

  public static final String SERIALIZED_NAME_TIME_TO_FIRST_BYTE = "_timeToFirstByte";
  @SerializedName(SERIALIZED_NAME_TIME_TO_FIRST_BYTE)
  private BigDecimal timeToFirstByte;

  public static final String SERIALIZED_NAME_SSL = "_ssl";
  @SerializedName(SERIALIZED_NAME_SSL)
  private BigDecimal ssl;

  public static final String SERIALIZED_NAME_FIRST_CONTENTFUL_PAINT = "_firstContentfulPaint";
  @SerializedName(SERIALIZED_NAME_FIRST_CONTENTFUL_PAINT)
  private BigDecimal firstContentfulPaint;

  public static final String SERIALIZED_NAME_ON_LOAD = "onLoad";
  @SerializedName(SERIALIZED_NAME_ON_LOAD)
  private BigDecimal onLoad;

  public static final String SERIALIZED_NAME_ON_CONTENT_LOAD = "onContentLoad";
  @SerializedName(SERIALIZED_NAME_ON_CONTENT_LOAD)
  private BigDecimal onContentLoad;

  public PageTiming() {
  }

  public PageTiming firstInputDelay(BigDecimal firstInputDelay) {
    
    this.firstInputDelay = firstInputDelay;
    return this;
  }

   /**
   * firstInputDelay from the browser
   * @return firstInputDelay
  **/
  @javax.annotation.Nullable

  public BigDecimal getFirstInputDelay() {
    return firstInputDelay;
  }


  public void setFirstInputDelay(BigDecimal firstInputDelay) {
    this.firstInputDelay = firstInputDelay;
  }


  public PageTiming domInteractive(BigDecimal domInteractive) {
    
    this.domInteractive = domInteractive;
    return this;
  }

   /**
   * domInteractive from the browser
   * @return domInteractive
  **/
  @javax.annotation.Nullable

  public BigDecimal getDomInteractive() {
    return domInteractive;
  }


  public void setDomInteractive(BigDecimal domInteractive) {
    this.domInteractive = domInteractive;
  }


  public PageTiming cumulativeLayoutShift(BigDecimal cumulativeLayoutShift) {
    
    this.cumulativeLayoutShift = cumulativeLayoutShift;
    return this;
  }

   /**
   * cumulativeLayoutShift metric from the browser
   * @return cumulativeLayoutShift
  **/
  @javax.annotation.Nullable

  public BigDecimal getCumulativeLayoutShift() {
    return cumulativeLayoutShift;
  }


  public void setCumulativeLayoutShift(BigDecimal cumulativeLayoutShift) {
    this.cumulativeLayoutShift = cumulativeLayoutShift;
  }


  public PageTiming dns(BigDecimal dns) {
    
    this.dns = dns;
    return this;
  }

   /**
   * dns lookup time from the browser
   * @return dns
  **/
  @javax.annotation.Nullable

  public BigDecimal getDns() {
    return dns;
  }


  public void setDns(BigDecimal dns) {
    this.dns = dns;
  }


  public PageTiming href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Top level href, including hashtag, etc per the browser
   * @return href
  **/
  @javax.annotation.Nullable

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public PageTiming firstPaint(BigDecimal firstPaint) {
    
    this.firstPaint = firstPaint;
    return this;
  }

   /**
   * firstPaint from the browser
   * @return firstPaint
  **/
  @javax.annotation.Nullable

  public BigDecimal getFirstPaint() {
    return firstPaint;
  }


  public void setFirstPaint(BigDecimal firstPaint) {
    this.firstPaint = firstPaint;
  }


  public PageTiming largestContentfulPaint(BigDecimal largestContentfulPaint) {
    
    this.largestContentfulPaint = largestContentfulPaint;
    return this;
  }

   /**
   * largestContentfulPaint from the browser
   * @return largestContentfulPaint
  **/
  @javax.annotation.Nullable

  public BigDecimal getLargestContentfulPaint() {
    return largestContentfulPaint;
  }


  public void setLargestContentfulPaint(BigDecimal largestContentfulPaint) {
    this.largestContentfulPaint = largestContentfulPaint;
  }


  public PageTiming timeToFirstByte(BigDecimal timeToFirstByte) {
    
    this.timeToFirstByte = timeToFirstByte;
    return this;
  }

   /**
   * Time to first byte of the page&#39;s first request per the browser
   * @return timeToFirstByte
  **/
  @javax.annotation.Nullable

  public BigDecimal getTimeToFirstByte() {
    return timeToFirstByte;
  }


  public void setTimeToFirstByte(BigDecimal timeToFirstByte) {
    this.timeToFirstByte = timeToFirstByte;
  }


  public PageTiming ssl(BigDecimal ssl) {
    
    this.ssl = ssl;
    return this;
  }

   /**
   * Ssl connect time from the browser
   * @return ssl
  **/
  @javax.annotation.Nullable

  public BigDecimal getSsl() {
    return ssl;
  }


  public void setSsl(BigDecimal ssl) {
    this.ssl = ssl;
  }


  public PageTiming firstContentfulPaint(BigDecimal firstContentfulPaint) {
    
    this.firstContentfulPaint = firstContentfulPaint;
    return this;
  }

   /**
   * firstContentfulPaint from the browser
   * @return firstContentfulPaint
  **/
  @javax.annotation.Nullable

  public BigDecimal getFirstContentfulPaint() {
    return firstContentfulPaint;
  }


  public void setFirstContentfulPaint(BigDecimal firstContentfulPaint) {
    this.firstContentfulPaint = firstContentfulPaint;
  }


  public PageTiming onLoad(BigDecimal onLoad) {
    
    this.onLoad = onLoad;
    return this;
  }

   /**
   * onLoad per the browser
   * @return onLoad
  **/
  @javax.annotation.Nullable

  public BigDecimal getOnLoad() {
    return onLoad;
  }


  public void setOnLoad(BigDecimal onLoad) {
    this.onLoad = onLoad;
  }


  public PageTiming onContentLoad(BigDecimal onContentLoad) {
    
    this.onContentLoad = onContentLoad;
    return this;
  }

   /**
   * onContentLoad per the browser
   * @return onContentLoad
  **/
  @javax.annotation.Nullable

  public BigDecimal getOnContentLoad() {
    return onContentLoad;
  }


  public void setOnContentLoad(BigDecimal onContentLoad) {
    this.onContentLoad = onContentLoad;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageTiming pageTiming = (PageTiming) o;
    return Objects.equals(this.firstInputDelay, pageTiming.firstInputDelay) &&
        Objects.equals(this.domInteractive, pageTiming.domInteractive) &&
        Objects.equals(this.cumulativeLayoutShift, pageTiming.cumulativeLayoutShift) &&
        Objects.equals(this.dns, pageTiming.dns) &&
        Objects.equals(this.href, pageTiming.href) &&
        Objects.equals(this.firstPaint, pageTiming.firstPaint) &&
        Objects.equals(this.largestContentfulPaint, pageTiming.largestContentfulPaint) &&
        Objects.equals(this.timeToFirstByte, pageTiming.timeToFirstByte) &&
        Objects.equals(this.ssl, pageTiming.ssl) &&
        Objects.equals(this.firstContentfulPaint, pageTiming.firstContentfulPaint) &&
        Objects.equals(this.onLoad, pageTiming.onLoad) &&
        Objects.equals(this.onContentLoad, pageTiming.onContentLoad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstInputDelay, domInteractive, cumulativeLayoutShift, dns, href, firstPaint, largestContentfulPaint, timeToFirstByte, ssl, firstContentfulPaint, onLoad, onContentLoad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageTiming {\n");
    sb.append("    firstInputDelay: ").append(toIndentedString(firstInputDelay)).append("\n");
    sb.append("    domInteractive: ").append(toIndentedString(domInteractive)).append("\n");
    sb.append("    cumulativeLayoutShift: ").append(toIndentedString(cumulativeLayoutShift)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    firstPaint: ").append(toIndentedString(firstPaint)).append("\n");
    sb.append("    largestContentfulPaint: ").append(toIndentedString(largestContentfulPaint)).append("\n");
    sb.append("    timeToFirstByte: ").append(toIndentedString(timeToFirstByte)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    firstContentfulPaint: ").append(toIndentedString(firstContentfulPaint)).append("\n");
    sb.append("    onLoad: ").append(toIndentedString(onLoad)).append("\n");
    sb.append("    onContentLoad: ").append(toIndentedString(onContentLoad)).append("\n");
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
    openapiFields.add("_firstInputDelay");
    openapiFields.add("_domInteractive");
    openapiFields.add("_cumulativeLayoutShift");
    openapiFields.add("_dns");
    openapiFields.add("_href");
    openapiFields.add("_firstPaint");
    openapiFields.add("_largestContentfulPaint");
    openapiFields.add("_timeToFirstByte");
    openapiFields.add("_ssl");
    openapiFields.add("_firstContentfulPaint");
    openapiFields.add("onLoad");
    openapiFields.add("onContentLoad");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageTiming
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PageTiming.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageTiming is not found in the empty JSON string", PageTiming.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PageTiming.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageTiming` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("_href") != null && !jsonObj.get("_href").isJsonNull()) && !jsonObj.get("_href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `_href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("_href").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageTiming.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageTiming' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageTiming> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageTiming.class));

       return (TypeAdapter<T>) new TypeAdapter<PageTiming>() {
           @Override
           public void write(JsonWriter out, PageTiming value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageTiming read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageTiming given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageTiming
  * @throws IOException if the JSON string is invalid with respect to PageTiming
  */
  public static PageTiming fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageTiming.class);
  }

 /**
  * Convert an instance of PageTiming to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
