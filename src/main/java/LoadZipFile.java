import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class LoadZipFile {
    public File getZippedFile() throws URISyntaxException {
        URL resource = getClass().getClassLoader().getResource("state.zip");
        if (resource == null) {
            throw new IllegalArgumentException("file not found!");
        } else {
            return new File(resource.toURI());
        }
    }
}
