import DTO.CountryDTO;

public class StateSearch {

    public String getStateByPostCode(int postCode){
        LoadCountryDataFromFile loadCountryDataFromFile = new  LoadCountryDataFromFile();
        CountryDTO countryDTO= loadCountryDataFromFile.getCountryFromFile();
        if(countryDTO.getPostCode() == postCode){

           return countryDTO.getPlaces().get(0).getPlaceName();
        }

        return "No State Found";
    }

}
