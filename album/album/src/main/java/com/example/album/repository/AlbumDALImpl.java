package com.example.album.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.album.model.Album;


@Repository
public class AlbumDALImpl implements AlbumDAL {

	
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Album create(Album al) {
		// TODO Auto-generated method stub
		return mongo.insert(al);
	}

	@Override
	public Boolean delete(Album al) {
		// TODO Auto-generated method stub
		return mongo.remove(al).wasAcknowledged();
	}

	@Override
	public List<Album> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Album.class);
	}

	@Override
	public Album findById(String id) {
		// TODO Auto-generated method stub
		return (Album) mongo.findAndRemove(new Query(Criteria.where("id").is(id)),Album.class);
	}

	@Override
	public Album update(Album al) {
		// TODO Auto-generated method stub
		return mongo.save(al);
	}

}