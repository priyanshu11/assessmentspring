package com.example.track.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Track {

	
	@Id
	private String id;
	private String name;
	@DBRef
	private List<Artist> a2;
	
	
	public Track(){
		
	}
	
	public Track(String id, String name, List<Artist> a2) {
		super();
		this.id = id;
		this.name = name;
		this.a2 = a2;
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

	public List<Artist> getA2() {
		return a2;
	}

	public void setA2(List<Artist> a2) {
		this.a2 = a2;
	}
	
	
	
	
	
	
}
