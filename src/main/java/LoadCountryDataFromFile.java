import DTO.CountryDTO;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class LoadCountryDataFromFile {

    public CountryDTO getCountryFromFile() {

        try {
            LoadZipFile loadZipFile = new LoadZipFile();

            ZipFile zipFile = null;
            zipFile = new ZipFile(loadZipFile.getZippedFile());

            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                InputStream stream = zipFile.getInputStream(entry);

                String text = new BufferedReader(
                        new InputStreamReader(stream, StandardCharsets.UTF_8))
                        .lines()
                        .collect(Collectors.joining("\n"));

                ObjectMapper mapper = new ObjectMapper();
                mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);


                CountryDTO countryDTO = mapper.readValue(text, CountryDTO.class);
                return countryDTO;

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return new CountryDTO();
    }
}
