package com.major;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.major.model.Property;
import com.major.model.Review;
import com.major.model.User;

@Configuration
public class RestConfiguration extends RepositoryRestMvcConfiguration {
 
    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Property.class, Review.class, User.class);
    }
    
    @Bean
    public Filter tokenFilter() {
      return new TokenFilter();
    }
}
