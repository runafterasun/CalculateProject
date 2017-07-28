package prod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan(basePackages = {"prod"})
@Import(value = {WebAppConfig.class, PersistenceConfig.class})
public class AppConfig {

    @Bean
    public InternalResourceViewResolver getModelAndViewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/test/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }



}
