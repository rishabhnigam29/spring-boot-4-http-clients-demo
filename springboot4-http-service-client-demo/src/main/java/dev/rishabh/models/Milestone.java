package dev.rishabh.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Milestone(

	@JsonProperty("number")
	int number,

	@JsonProperty("description")
	String description,

	@JsonProperty("id")
	int id,

	@JsonProperty("title")
	String title,

	@JsonProperty("url")
	String url,

	@JsonProperty("node_id")
	String nodeId
) {
}