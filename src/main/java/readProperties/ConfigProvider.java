package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("application.conf");
    }

    String URL = readConfig().getString("url");
    String LOCAL_URL = readConfig().getString("local_url");
    String LOGIN = readConfig().getString("userParams.login");
    String PASSWORD = readConfig().getString("userParams.password");
    String USERNAME = readConfig().getString("userParams.username");
    String SUCCESS_ADD = readConfig().getString("toastText.success_add");
    String SUCCESS_CHANGES = readConfig().getString("toastText.success_changes");
    String SUCCESS_DELETE = readConfig().getString("toastText.success_delete");
    String FAIL_DUPLICATE_ADD = readConfig().getString("toastText.fail_duplicate_add");
}
