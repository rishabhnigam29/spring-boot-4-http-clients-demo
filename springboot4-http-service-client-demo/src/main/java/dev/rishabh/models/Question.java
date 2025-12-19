package dev.rishabh.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public record Question(

	@JsonProperty("items")
	List<ItemsItem> items
) {
}