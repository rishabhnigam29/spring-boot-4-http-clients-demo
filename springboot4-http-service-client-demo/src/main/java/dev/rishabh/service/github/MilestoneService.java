package dev.rishabh.service.github;

import dev.rishabh.models.Milestone;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface MilestoneService {
    @GetExchange("/repos/{org}/{repo}/milestones")
    List<Milestone> getMilestones(@PathVariable String org, @PathVariable String repo);
}
