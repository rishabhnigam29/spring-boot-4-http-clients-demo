package dev.rishabh.service.stackoverflow;

import dev.rishabh.models.Question;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface QuestionService {
    @GetExchange("/questions")
    Question getQuestions(@RequestParam("site") String site);
}
