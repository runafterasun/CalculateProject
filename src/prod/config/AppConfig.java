package prod.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import prod.DAO.UserDAO;
import prod.DAO.UserDAOImpl;


@Configuration
@ComponentScan(basePackages = {"prod"})
@Import(value = {WebAppConfig.class, PersistenceConfig.class})
@EnableWebMvc
public class AppConfig {

    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getModelAndViewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/test/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }



}
