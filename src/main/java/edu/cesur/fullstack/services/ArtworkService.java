package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.model.ArtworkDTO;

public interface ArtworkService {

	ArrayList<ArtworkDTO>getAllArtworks();
	
	ArrayList< ArtworkDTO > getAllArtworks(Integer artistId);
	
	void createArtwork(ArtworkDTO artworkDTO);

	
}
