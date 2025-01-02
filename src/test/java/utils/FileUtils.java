package utils;

import lombok.experimental.UtilityClass;
import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;
import java.io.File;
import java.util.concurrent.TimeUnit;

import static aquality.selenium.browser.AqualityServices.getBrowser;

@UtilityClass
public class FileUtils {

    public boolean isFileExist(File file) {
        try {
            Awaitility.await().atMost(EnvDataReader.getEnvData().getWait(), TimeUnit.SECONDS).until(file::exists);
        }
        catch (ConditionTimeoutException exception) {
            return false;
        }
        return true;
    }

    public boolean isFileDownloaded(String fileName) {
        File file = new File(getBrowser().getDownloadDirectory() + File.separator + fileName);
        return isFileExist(file);
    }
}
