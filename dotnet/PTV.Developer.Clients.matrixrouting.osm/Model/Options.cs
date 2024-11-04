/*
 * Matrix Routing OSM
 *
 * With the Matrix Routing OSM service you can compute distances and travel times between a set of origins and destinations based on open street map data.
 *
 * The version of the OpenAPI document: 1.5
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
using OpenAPIDateConverter = PTV.Developer.Clients.matrixrouting.osm.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.matrixrouting.osm.Model
{
    /// <summary>
    /// Options
    /// </summary>
    [DataContract(Name = "Options")]
    public partial class Options : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Options" /> class.
        /// </summary>
        /// <param name="detourFactor">Defines the average detour an actual route on the road requires, compared to the direct distance. This factor is used to estimate by direct distance a relation that could not be calculated using the road network. If not specified, the factor is selected based on the profile..</param>
        /// <param name="averageSpeed">Defines the average speed of the vehicle. This parameter is used to calculate the travel time for a relation that could not be calculated using the road network. If not specified, the average speed is selected based on the profile..</param>
        public Options(double? detourFactor = default(double?), double? averageSpeed = default(double?))
        {
            this.DetourFactor = detourFactor;
            this.AverageSpeed = averageSpeed;
        }

        /// <summary>
        /// Defines the average detour an actual route on the road requires, compared to the direct distance. This factor is used to estimate by direct distance a relation that could not be calculated using the road network. If not specified, the factor is selected based on the profile.
        /// </summary>
        /// <value>Defines the average detour an actual route on the road requires, compared to the direct distance. This factor is used to estimate by direct distance a relation that could not be calculated using the road network. If not specified, the factor is selected based on the profile.</value>
        [DataMember(Name = "detourFactor", EmitDefaultValue = true)]
        public double? DetourFactor { get; set; }

        /// <summary>
        /// Defines the average speed of the vehicle. This parameter is used to calculate the travel time for a relation that could not be calculated using the road network. If not specified, the average speed is selected based on the profile.
        /// </summary>
        /// <value>Defines the average speed of the vehicle. This parameter is used to calculate the travel time for a relation that could not be calculated using the road network. If not specified, the average speed is selected based on the profile.</value>
        [DataMember(Name = "averageSpeed", EmitDefaultValue = true)]
        public double? AverageSpeed { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Options {\n");
            sb.Append("  DetourFactor: ").Append(DetourFactor).Append("\n");
            sb.Append("  AverageSpeed: ").Append(AverageSpeed).Append("\n");
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
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // DetourFactor (double?) minimum
            if (this.DetourFactor < (double?)1)
            {
                yield return new ValidationResult("Invalid value for DetourFactor, must be a value greater than or equal to 1.", new [] { "DetourFactor" });
            }

            // AverageSpeed (double?) minimum
            if (this.AverageSpeed < (double?)1)
            {
                yield return new ValidationResult("Invalid value for AverageSpeed, must be a value greater than or equal to 1.", new [] { "AverageSpeed" });
            }

            yield break;
        }
    }

}