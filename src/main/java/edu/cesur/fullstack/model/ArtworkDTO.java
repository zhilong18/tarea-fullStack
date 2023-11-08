package edu.cesur.fullstack.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArtworkDTO {

	Integer id;

	String title;

	String description;

	Integer artistId;

	
}
