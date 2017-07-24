package prod.config;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 12.07.2017.
 */
@Configuration
@EnableTransactionManagement
public class PersistenceConfig {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        dataSource.setUsername("stereo");
        dataSource.setPassword("test");
        return dataSource;
    }

    private Map<String,?> jpaProperties(){
        Map<String, String> jpaProperiesMap = new HashMap<String, String>();
        jpaProperiesMap.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
        jpaProperiesMap.put("hibernate.hbm2ddl.auto", "update");
        return jpaProperiesMap;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan("prod");
        factoryBean.setJpaPropertyMap(jpaProperties());
        return factoryBean;
    }
}
