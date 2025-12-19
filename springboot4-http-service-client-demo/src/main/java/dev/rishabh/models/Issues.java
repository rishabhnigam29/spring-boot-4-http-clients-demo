package dev.rishabh.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Issues(

	@JsonProperty("labels_url")
	String labelsUrl,

	@JsonProperty("number")
	int number,

	@JsonProperty("events_url")
	String eventsUrl,

	@JsonProperty("html_url")
	String htmlUrl,

	@JsonProperty("comments_url")
	String commentsUrl,

	@JsonProperty("repository_url")
	String repositoryUrl,

	@JsonProperty("id")
	long id,

	@JsonProperty("title")
	String title,

	@JsonProperty("url")
	String url,

	@JsonProperty("node_id")
	String nodeId
) {
}