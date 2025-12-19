package dev.rishabh.controller;

import dev.rishabh.service.github.IssueService;
import dev.rishabh.service.github.MilestoneService;
import dev.rishabh.service.stackoverflow.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/services")
@RequiredArgsConstructor
public class ServiceController {

    private final MilestoneService milestoneService;
    private final IssueService issueService;
    private final QuestionService questionService;

    @GetMapping("/milestones/{org}/{repo}")
    public ResponseEntity<?> getMilestones(@PathVariable String org,
                                           @PathVariable String repo) {
        return ResponseEntity.ok(milestoneService.getMilestones(org, repo));
    }

    @GetMapping("/issues/{org}/{repo}")
    public ResponseEntity<?> getIssues(@PathVariable String org,
                                       @PathVariable String repo) {
        return ResponseEntity.ok(issueService.getIssues(org, repo));
    }

    @GetMapping("/questions")
    public ResponseEntity<?> getQuestions(
            @RequestParam(value = "site", defaultValue = "stackoverflow") String site) {
        return ResponseEntity.ok(questionService.getQuestions(site));
    }
}
