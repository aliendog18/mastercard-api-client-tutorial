/*
 * MDES Digital Enablement API
 *
 * These APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br><br> **Authentication** <br><br> Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br><br> 1. A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br><br> **Encryption** <br><br> All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br><br> **Additional Encryption of Sensitive Data** <br><br> In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.3.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Acme.App.MastercardApi.Client.Client.OpenAPIDateConverter;

namespace Acme.App.MastercardApi.Client.Model
{
    /// <summary>
    /// FundingAccountInfo
    /// </summary>
    [DataContract(Name = "fundingAccountInfo")]
    public partial class FundingAccountInfo : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundingAccountInfo" /> class.
        /// </summary>
        /// <param name="panUniqueReference">**(CONDITIONAL)** For repeat digitizations, the unique reference allocated to the Primary Account Number. When supplied, the tokenUniqueReferenceForPanInfo, accountNumber, expiryMonth and expiryYear must be omitted from CardInfoData. Only allowed if Only allowed if tokenUniqueReference and pushAccountReceipt are not present and encrypted data does not contain the account information. .</param>
        /// <param name="tokenUniqueReference">**(CONDITIONAL)** A unique reference assigned following the allocation of a token used to identify the token for the duration of its lifetime.  For repeat digitizations, the unique reference allocated to the token will be used to retrieve the financial account information. When supplied, the account information is omitted from FundingAccountData. Only allowed if panUniqueReference and pushAccountReceipt are not present and encrypted data does not contain the account information. .</param>
        /// <param name="encryptedPayload">encryptedPayload.</param>
        public FundingAccountInfo(string panUniqueReference = default(string), string tokenUniqueReference = default(string), FundingAccountInfoEncryptedPayload encryptedPayload = default(FundingAccountInfoEncryptedPayload))
        {
            this.PanUniqueReference = panUniqueReference;
            this.TokenUniqueReference = tokenUniqueReference;
            this.EncryptedPayload = encryptedPayload;
        }

        /// <summary>
        /// **(CONDITIONAL)** For repeat digitizations, the unique reference allocated to the Primary Account Number. When supplied, the tokenUniqueReferenceForPanInfo, accountNumber, expiryMonth and expiryYear must be omitted from CardInfoData. Only allowed if Only allowed if tokenUniqueReference and pushAccountReceipt are not present and encrypted data does not contain the account information. 
        /// </summary>
        /// <value>**(CONDITIONAL)** For repeat digitizations, the unique reference allocated to the Primary Account Number. When supplied, the tokenUniqueReferenceForPanInfo, accountNumber, expiryMonth and expiryYear must be omitted from CardInfoData. Only allowed if Only allowed if tokenUniqueReference and pushAccountReceipt are not present and encrypted data does not contain the account information. </value>
        [DataMember(Name = "panUniqueReference", EmitDefaultValue = false)]
        public string PanUniqueReference { get; set; }

        /// <summary>
        /// **(CONDITIONAL)** A unique reference assigned following the allocation of a token used to identify the token for the duration of its lifetime.  For repeat digitizations, the unique reference allocated to the token will be used to retrieve the financial account information. When supplied, the account information is omitted from FundingAccountData. Only allowed if panUniqueReference and pushAccountReceipt are not present and encrypted data does not contain the account information. 
        /// </summary>
        /// <value>**(CONDITIONAL)** A unique reference assigned following the allocation of a token used to identify the token for the duration of its lifetime.  For repeat digitizations, the unique reference allocated to the token will be used to retrieve the financial account information. When supplied, the account information is omitted from FundingAccountData. Only allowed if panUniqueReference and pushAccountReceipt are not present and encrypted data does not contain the account information. </value>
        [DataMember(Name = "tokenUniqueReference", EmitDefaultValue = false)]
        public string TokenUniqueReference { get; set; }

        /// <summary>
        /// Gets or Sets EncryptedPayload
        /// </summary>
        [DataMember(Name = "encryptedPayload", EmitDefaultValue = false)]
        public FundingAccountInfoEncryptedPayload EncryptedPayload { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FundingAccountInfo {\n");
            sb.Append("  PanUniqueReference: ").Append(PanUniqueReference).Append("\n");
            sb.Append("  TokenUniqueReference: ").Append(TokenUniqueReference).Append("\n");
            sb.Append("  EncryptedPayload: ").Append(EncryptedPayload).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // PanUniqueReference (string) maxLength
            if (this.PanUniqueReference != null && this.PanUniqueReference.Length > 64)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for PanUniqueReference, length must be less than 64.", new [] { "PanUniqueReference" });
            }

            // TokenUniqueReference (string) maxLength
            if (this.TokenUniqueReference != null && this.TokenUniqueReference.Length > 64)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for TokenUniqueReference, length must be less than 64.", new [] { "TokenUniqueReference" });
            }

            yield break;
        }
    }

}
