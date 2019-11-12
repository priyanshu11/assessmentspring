package com.example.track.repository;

import java.util.List;

import com.example.track.model.Track;

public interface TrackDAL {

	
	public Track create(Track t);
	
	public Boolean delete(Track t);
	
	public Track update(Track t);
	
	public List<Track> findAll();
	
	public Track findById(String id);
}

