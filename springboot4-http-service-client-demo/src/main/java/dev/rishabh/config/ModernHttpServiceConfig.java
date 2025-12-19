package dev.rishabh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.support.RestClientHttpServiceGroupConfigurer;
import org.springframework.web.service.registry.ImportHttpServices;

@Configuration
@ImportHttpServices(group = "github", basePackages = "dev.rishabh.service.github")
@ImportHttpServices(group = "stackoverflow", basePackages = "dev.rishabh.service.stackoverflow")
public class ModernHttpServiceConfig {

//    @Bean
//    RestClientHttpServiceGroupConfigurer groupConfigurer(){
//        return groups -> {
//            //Configure GitHub group
//            groups.filterByName("github")
//                    .forEachClient((client,builder)->
//                            builder.baseUrl("https://api.github.com"));
//
//            //Configure StackOverflow group
//            groups.filterByName("stackoverflow")
//                    .forEachClient((client,builder)->
//                            builder.baseUrl("https://api.stackexchange.com/2.3"));
//        };
//    }
}
