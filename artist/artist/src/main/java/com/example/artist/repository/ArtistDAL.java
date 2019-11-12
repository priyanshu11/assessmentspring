package com.example.artist.repository;

import java.util.List;

import com.example.artist.model.Artist;



public interface ArtistDAL {

	
	public Artist create(Artist art);
	
	public Boolean delete(Artist art);
	
	public Artist update(Artist art);
	
	public List<Artist> findAll();
	
	public Artist findByName(String name);
}
