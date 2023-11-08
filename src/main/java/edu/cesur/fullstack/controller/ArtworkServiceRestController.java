package edu.cesur.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cesur.fullstack.services.ArtworkService;

@RestController
@RequestMapping("/ObrasDeArte")
public class ArtworkServiceRestController {

	@Autowired
	ArtworkService artworkService;

	@GetMapping()
	public ResponseEntity<?> getObras() {

		return ResponseEntity.ok(artworkService.getAllArtworks());
	}
	@GetMapping("/{artistId}")
	public ResponseEntity<?> getObras(@PathVariable Integer artistId) {

		return ResponseEntity.ok(artworkService.getAllArtworks(artistId));
	}
	
}