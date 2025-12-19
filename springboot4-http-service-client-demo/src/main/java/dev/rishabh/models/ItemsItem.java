package dev.rishabh.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public record ItemsItem(

	@JsonProperty("content_license")
	String contentLicense,

	@JsonProperty("score")
	int score,

	@JsonProperty("accepted_answer_id")
	Integer acceptedAnswerId,

	@JsonProperty("link")
	String link,

	@JsonProperty("last_activity_date")
	int lastActivityDate,

	@JsonProperty("is_answered")
	boolean isAnswered,

	@JsonProperty("creation_date")
	int creationDate,

	@JsonProperty("answer_count")
	int answerCount,

	@JsonProperty("title")
	String title,

	@JsonProperty("question_id")
	int questionId,

	@JsonProperty("view_count")
	int viewCount,

	@JsonProperty("tags")
	List<String> tags
) {
}