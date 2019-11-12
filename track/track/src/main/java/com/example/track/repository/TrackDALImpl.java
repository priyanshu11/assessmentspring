package com.example.track.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.track.model.Track;


@Repository
public class TrackDALImpl implements TrackDAL {

	
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Track create(Track tl) {
		// TODO Auto-generated method stub
		return mongo.insert(tl);
	}

	@Override
	public Boolean delete(Track tl) {
		// TODO Auto-generated method stub
		return mongo.remove(tl).wasAcknowledged();
	}

	@Override
	public List<Track> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Track.class);
	}

	@Override
	public Track findById(String id) {
		// TODO Auto-generated method stub
		return (Track) mongo.findAndRemove(new Query(Criteria.where("id").is(id)),Track.class);
	}

	@Override
	public Track update(Track tl) {
		// TODO Auto-generated method stub
		return mongo.save(tl);
	}

}
