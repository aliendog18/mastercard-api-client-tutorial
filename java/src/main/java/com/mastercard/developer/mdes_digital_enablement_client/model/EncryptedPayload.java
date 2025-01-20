/*
 * MDES Digital Enablement API
 * These APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br><br> **Authentication** <br><br> Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br><br> 1. A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br><br> **Encryption** <br><br> All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br><br> **Additional Encryption of Sensitive Data** <br><br> In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mdes_digital_enablement_client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mastercard.developer.mdes_digital_enablement_client.model.NotifyTokenEncryptedPayload;
import java.io.IOException;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mastercard.developer.mdes_digital_enablement_client.JSON;

/**
 * EncryptedPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-24T13:37:45.612619+01:00[Europe/Dublin]", comments = "Generator version: 7.5.0")
public class EncryptedPayload {
  public static final String SERIALIZED_NAME_PUBLIC_KEY_FINGERPRINT = "publicKeyFingerprint";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_FINGERPRINT)
  private String publicKeyFingerprint;

  public static final String SERIALIZED_NAME_ENCRYPTED_KEY = "encryptedKey";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_KEY)
  private String encryptedKey;

  public static final String SERIALIZED_NAME_OAEP_HASHING_ALGORITHM = "oaepHashingAlgorithm";
  @SerializedName(SERIALIZED_NAME_OAEP_HASHING_ALGORITHM)
  private String oaepHashingAlgorithm;

  public static final String SERIALIZED_NAME_IV = "iv";
  @SerializedName(SERIALIZED_NAME_IV)
  private String iv;

  public static final String SERIALIZED_NAME_ENCRYPTED_DATA = "encryptedData";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_DATA)
  private NotifyTokenEncryptedPayload encryptedData;

  public EncryptedPayload() {
  }

  public EncryptedPayload publicKeyFingerprint(String publicKeyFingerprint) {
    this.publicKeyFingerprint = publicKeyFingerprint;
    return this;
  }

   /**
   * The fingerprint of the public key used to encrypt the ephemeral AES key. 
   * @return publicKeyFingerprint
  **/
  @javax.annotation.Nonnull
  public String getPublicKeyFingerprint() {
    return publicKeyFingerprint;
  }

  public void setPublicKeyFingerprint(String publicKeyFingerprint) {
    this.publicKeyFingerprint = publicKeyFingerprint;
  }


  public EncryptedPayload encryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
    return this;
  }

   /**
   * One-time use AES key encrypted by the MasterCard public key (as identified by publicKeyFingerprint) using the OAEP or PKCS#1 v1.5 scheme (depending on the value of oaepHashingAlgorithm. 
   * @return encryptedKey
  **/
  @javax.annotation.Nonnull
  public String getEncryptedKey() {
    return encryptedKey;
  }

  public void setEncryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
  }


  public EncryptedPayload oaepHashingAlgorithm(String oaepHashingAlgorithm) {
    this.oaepHashingAlgorithm = oaepHashingAlgorithm;
    return this;
  }

   /**
   * Hashing algorithm used with the OAEP scheme. Must be either SHA256 or SHA512. 
   * @return oaepHashingAlgorithm
  **/
  @javax.annotation.Nullable
  public String getOaepHashingAlgorithm() {
    return oaepHashingAlgorithm;
  }

  public void setOaepHashingAlgorithm(String oaepHashingAlgorithm) {
    this.oaepHashingAlgorithm = oaepHashingAlgorithm;
  }


  public EncryptedPayload iv(String iv) {
    this.iv = iv;
    return this;
  }

   /**
   * The initialization vector used when encrypting data using the one-time use AES key. Must be exactly 16 bytes (32 character hex string) to match the block size. If not present, an IV of zero is assumed. Length - 32. 
   * @return iv
  **/
  @javax.annotation.Nullable
  public String getIv() {
    return iv;
  }

  public void setIv(String iv) {
    this.iv = iv;
  }


  public EncryptedPayload encryptedData(NotifyTokenEncryptedPayload encryptedData) {
    this.encryptedData = encryptedData;
    return this;
  }

   /**
   * Get encryptedData
   * @return encryptedData
  **/
  @javax.annotation.Nonnull
  public NotifyTokenEncryptedPayload getEncryptedData() {
    return encryptedData;
  }

  public void setEncryptedData(NotifyTokenEncryptedPayload encryptedData) {
    this.encryptedData = encryptedData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedPayload encryptedPayload = (EncryptedPayload) o;
    return Objects.equals(this.publicKeyFingerprint, encryptedPayload.publicKeyFingerprint) &&
        Objects.equals(this.encryptedKey, encryptedPayload.encryptedKey) &&
        Objects.equals(this.oaepHashingAlgorithm, encryptedPayload.oaepHashingAlgorithm) &&
        Objects.equals(this.iv, encryptedPayload.iv) &&
        Objects.equals(this.encryptedData, encryptedPayload.encryptedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKeyFingerprint, encryptedKey, oaepHashingAlgorithm, iv, encryptedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedPayload {\n");
    sb.append("    publicKeyFingerprint: ").append(toIndentedString(publicKeyFingerprint)).append("\n");
    sb.append("    encryptedKey: ").append(toIndentedString(encryptedKey)).append("\n");
    sb.append("    oaepHashingAlgorithm: ").append(toIndentedString(oaepHashingAlgorithm)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
    sb.append("    encryptedData: ").append(toIndentedString(encryptedData)).append("\n");
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
    openapiFields.add("publicKeyFingerprint");
    openapiFields.add("encryptedKey");
    openapiFields.add("oaepHashingAlgorithm");
    openapiFields.add("iv");
    openapiFields.add("encryptedData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("publicKeyFingerprint");
    openapiRequiredFields.add("encryptedKey");
    openapiRequiredFields.add("encryptedData");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EncryptedPayload
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EncryptedPayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EncryptedPayload is not found in the empty JSON string", EncryptedPayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EncryptedPayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EncryptedPayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EncryptedPayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("publicKeyFingerprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicKeyFingerprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicKeyFingerprint").toString()));
      }
      if (!jsonObj.get("encryptedKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encryptedKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encryptedKey").toString()));
      }
      if ((jsonObj.get("oaepHashingAlgorithm") != null && !jsonObj.get("oaepHashingAlgorithm").isJsonNull()) && !jsonObj.get("oaepHashingAlgorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oaepHashingAlgorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oaepHashingAlgorithm").toString()));
      }
      if ((jsonObj.get("iv") != null && !jsonObj.get("iv").isJsonNull()) && !jsonObj.get("iv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iv").toString()));
      }
      // validate the required field `encryptedData`
      NotifyTokenEncryptedPayload.validateJsonElement(jsonObj.get("encryptedData"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EncryptedPayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EncryptedPayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EncryptedPayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EncryptedPayload.class));

       return (TypeAdapter<T>) new TypeAdapter<EncryptedPayload>() {
           @Override
           public void write(JsonWriter out, EncryptedPayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EncryptedPayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EncryptedPayload given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EncryptedPayload
  * @throws IOException if the JSON string is invalid with respect to EncryptedPayload
  */
  public static EncryptedPayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EncryptedPayload.class);
  }

 /**
  * Convert an instance of EncryptedPayload to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

