package jordan.java.chap3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "config-app")
@Component
public class ConfigurationService {
    private String url;
    private String username;
    private int host;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHost() {
        return host;
    }

    public void setHost(int host) {
        this.host = host;
    }
}
