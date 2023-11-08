package edu.cesur.fullstack.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.exeptions.ArtworkCreationException;
import edu.cesur.fullstack.exeptions.artistNotFoundException;
import edu.cesur.fullstack.model.ArtistDTO;
import edu.cesur.fullstack.model.ArtworkDTO;

@Service
public class ArtworkServiceImpl implements ArtworkService{

	ArrayList<ArtworkDTO> artes = new ArrayList<>();
	
	@Autowired
	ArtistService artistService;
	
	
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
		ArtistDTO artist;
		artist = artistService.getArtistById(artworkDTO.getArtistId());
        if(artworkDTO.getArtistId() == artist.getId()) {
            artes.add(artworkDTO);
        }
        else {
            throw new ArtworkCreationException("el artista no esta comprendido entre la élite");


    }
			
		}
		
	}
	


