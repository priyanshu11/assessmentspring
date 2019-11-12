package com.example.album.repository;

import java.util.List;

import com.example.album.model.Album;

public interface AlbumDAL {

	
	public Album create(Album al);
	
	public Boolean delete(Album a1);
	
	public Album update(Album al);
	
	public List<Album> findAll();
	
	public Album findById(String id);
}
