package com.example.artist.model;

import java.util.List;

import javax.sound.midi.Track;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Album {

	
	@Id
	private String id;
	private String name;
	@DBRef
	private List<Artist> a1;
	@DBRef
	private List<Track> t1;
	
	
	public Album(){
		
	}
	public Album(String id, String name, List<Artist> a1, List<Track> t1) {
		super();
		this.id = id;
		this.name = name;
		this.a1 = a1;
		this.t1 = t1;
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
	public List<Artist> getA1() {
		return a1;
	}
	public void setA1(List<Artist> a1) {
		this.a1 = a1;
	}
	public List<Track> getT1() {
		return t1;
	}
	public void setT1(List<Track> t1) {
		this.t1 = t1;
	}
	
	
}
