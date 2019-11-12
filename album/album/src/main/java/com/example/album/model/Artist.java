package com.example.album.model;


import java.util.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Artist {

	
	@Id
	private String id;
	private String name;
	@DBRef
	private List<Album> a1;
	@DBRef
	private List<Track> tracks;
	
	public Artist(){
		
	}
	public Artist(String id, String name, List<Album> a1, List<Track> tracks) {
		super();
		this.id = id;
		this.name = name;
		this.a1 = a1;
		this.tracks = tracks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Album> getA1() {
		return a1;
	}
	public void setA1(List<Album> a1) {
		this.a1 = a1;
	}
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
  	
}
