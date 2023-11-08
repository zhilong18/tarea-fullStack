package edu.cesur.fullstack.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;


import edu.cesur.fullstack.model.ArtistDTO;

@Service
public class ArtistServiceImpl implements ArtistService{

	ArrayList<ArtistDTO> artistas = new ArrayList(Arrays.asList(
			 new ArtistDTO(8,  "Javier"),
			 new ArtistDTO(3,  "Adrian")
			 ));
	
	
	@Override
	public ArtistDTO getArtistById(Integer id) {
		
		for(ArtistDTO art : artistas) {
			if(art.getId() == id) {
				return art;
			}
		}
		
		return null;
		
	}




}