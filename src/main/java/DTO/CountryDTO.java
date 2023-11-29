package DTO;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonValue;

import java.util.List;

public class CountryDTO {
    @JsonProperty("post code")
      int postCode;
    @JsonProperty("country")
       String country;
    @JsonProperty("country abbreviation")
              String countryAbbreviation;
    @JsonProperty("places")
              List<StateDTO> places;

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public List<StateDTO> getPlaces() {
        return places;
    }

    public void setPlaces(List<StateDTO> places) {
        this.places = places;
    }
}
