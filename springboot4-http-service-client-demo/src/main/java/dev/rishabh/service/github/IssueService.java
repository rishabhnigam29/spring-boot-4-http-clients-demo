package dev.rishabh.service.github;

import dev.rishabh.models.Issues;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface IssueService {
    @GetExchange("/repos/{org}/{repo}/issues")
    List<Issues> getIssues(@PathVariable String org, @PathVariable String repo);
}
