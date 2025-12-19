/*
package dev.rishabh.config;

import dev.rishabh.service.github.IssueService;
import dev.rishabh.service.github.MilestoneService;
import dev.rishabh.service.stackoverflow.QuestionService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class TraditionalHttpServiceConfig {

    @Value("${github.base.url}")
    private String githubBaseUrl;

    @Value("${stackoverflow.base.url}")
    private String stackOverFlowBaseUrl;

    @Bean
    public RestClient githubRestClient() {
        return RestClient.builder()
                .baseUrl(githubBaseUrl)
                .build();
    }

    @Bean
    public RestClient stackOverflowRestClient() {
        return RestClient.builder()
                .baseUrl(stackOverFlowBaseUrl)
                .build();
    }

    @Bean
    public MilestoneService milestoneService(RestClient githubRestClient){
        return HttpServiceProxyFactory
                .builderFor(RestClientAdapter.create(githubRestClient))
                .build()
                .createClient(MilestoneService.class);
    }

    @Bean
    public IssueService issueService(RestClient githubRestClient){
        return HttpServiceProxyFactory
                .builderFor(RestClientAdapter.create(githubRestClient))
                .build()
                .createClient(IssueService.class);
    }

    @Bean
    public QuestionService questionService(RestClient stackOverflowRestClient){
        return HttpServiceProxyFactory
                .builderFor(RestClientAdapter.create(stackOverflowRestClient))
                .build()
                .createClient(QuestionService.class);
    }
}
*/
