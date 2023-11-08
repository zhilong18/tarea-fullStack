package edu.cesur.fullstack.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cesur.fullstack.exeptions.artistNotFoundException;
import edu.cesur.fullstack.model.ArtworkDTO;

public class ArtworkServiceImpl implements ArtworkService{

	ArrayList<ArtworkDTO> artes = new ArrayList<>();
	Integer cont = 1;
	@Autowired
	ArtworkService artworkService;
	
	
	@Override
	public ArrayList<ArtworkDTO> getAllArtworks() {
		
		
		return artes;
	}

	@Override
	public ArrayList<ArtworkDTO> getAllArtworks(Integer artistId) {
		ArrayList<ArtworkDTO> allartworks = new ArrayList<>();
		
		for(ArtworkDTO ar : artes) {
			if (ar.getArtistId() == artistId) {
			      allartworks.add(ar);
			}
		}
			
		if (allartworks.isEmpty()) {
			throw new artistNotFoundException(
					"El autor con artist id:" + artistId + " no ha pubricado ningun libro ");
		}

		return allartworks;
	}

	@Override
	public void createArtwork(ArtworkDTO artworkDTO) {
		
		
			
		}
		
	}
	


