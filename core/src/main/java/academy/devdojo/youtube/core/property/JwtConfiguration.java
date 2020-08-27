package academy.devdojo.youtube.core.property;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "jwt.config")
@Getter
@Setter
@ToString
public class JwtConfiguration {

    private String loginUrl = "/login/**";
    private Header header = new Header();
    private int expiration = 3600;
    private String privateKey="hQoDsi5guU3TCFmJ1ZfhXQI3BfN0W2Tf";
    private String type = "encrypted";


    @Getter
    @Setter
    public static class Header {
        private  String name = "Authorization";
        private String prefix = "Bearer ";

    }

}
