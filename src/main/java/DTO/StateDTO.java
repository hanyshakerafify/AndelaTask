package DTO;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

public class StateDTO {
    @JsonProperty("place name")
    String placeName;
    @JsonProperty("longitude")
    String longitude;
    @JsonProperty("state")
    String state;
    @JsonProperty("state abbreviation")
    String stateAbbreviation;
    @JsonIgnore
       @JsonProperty("latitude")
    long latitude;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }
}
