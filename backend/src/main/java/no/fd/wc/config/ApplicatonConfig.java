package no.fd.wc.config;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.apache.commons.configuration.reloading.ReloadingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * @author Kjetil Fjellheim
 */

@Configuration
@EnableScheduling
public class ApplicatonConfig {

   private static final String CATALINA_BASE = "catalina.base";

    /**
     * Configuration object for communicating with property data.
     *
     * @return Configuration object containg properties.
     * @throws ConfigurationException Error during instansiation.
     */
    @Bean(name = "configuration")
    public PropertiesConfiguration configuration() throws ConfigurationException {
        PropertiesConfiguration configuration = new PropertiesConfiguration(System.getProperty(CATALINA_BASE) + "/appconf/" + System.getProperty("application.conf") + ".properties");
        ReloadingStrategy reloadingStrategy = new FileChangedReloadingStrategy();
        configuration.setReloadingStrategy(reloadingStrategy);
        return configuration;
    }

}
