/*
 * Matrix Routing OSM
 *
 * With the Matrix Routing OSM service you can compute distances and travel times between a set of origins and destinations for bicycles based on open street map data.
 *
 * The version of the OpenAPI document: 1.2
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
using OpenAPIDateConverter = PTV.Developer.Clients.matrixrouting_osm.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.matrixrouting_osm.Model
{
    /// <summary>
    /// Use these coordinates for matching to the nearest road. Implies **includeLastMeters**, i.e. the air-line connection between the location coordinates and the matched coordinates is included in the relation distance and travel time. This is useful if the location should not be matched to the nearest possible road but to some road further away, e.g. garage exit at a different road.
    /// </summary>
    [DataContract(Name = "RoadAccess")]
    public partial class RoadAccess : IEquatable<RoadAccess>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RoadAccess" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RoadAccess() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RoadAccess" /> class.
        /// </summary>
        /// <param name="latitude">The latitude value in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="longitude">The longitude value in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        public RoadAccess(double latitude = default(double), double longitude = default(double))
        {
            this.Latitude = latitude;
            this.Longitude = longitude;
        }

        /// <summary>
        /// The latitude value in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude value in degrees (WGS84/EPSG:4326) from south to north.</value>
        [DataMember(Name = "latitude", IsRequired = true, EmitDefaultValue = false)]
        public double Latitude { get; set; }

        /// <summary>
        /// The longitude value in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude value in degrees (WGS84/EPSG:4326) from west to east.</value>
        [DataMember(Name = "longitude", IsRequired = true, EmitDefaultValue = false)]
        public double Longitude { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RoadAccess {\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as RoadAccess);
        }

        /// <summary>
        /// Returns true if RoadAccess instances are equal
        /// </summary>
        /// <param name="input">Instance of RoadAccess to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RoadAccess input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Latitude == input.Latitude ||
                    this.Latitude.Equals(input.Latitude)
                ) && 
                (
                    this.Longitude == input.Longitude ||
                    this.Longitude.Equals(input.Longitude)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = hashCode * 59 + this.Latitude.GetHashCode();
                hashCode = hashCode * 59 + this.Longitude.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // Latitude (double) maximum
            if(this.Latitude > (double)90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value less than or equal to 90.", new [] { "Latitude" });
            }

            // Latitude (double) minimum
            if(this.Latitude < (double)-90)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Latitude, must be a value greater than or equal to -90.", new [] { "Latitude" });
            }

            // Longitude (double) maximum
            if(this.Longitude > (double)180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value less than or equal to 180.", new [] { "Longitude" });
            }

            // Longitude (double) minimum
            if(this.Longitude < (double)-180)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Longitude, must be a value greater than or equal to -180.", new [] { "Longitude" });
            }

            yield break;
        }
    }

}
