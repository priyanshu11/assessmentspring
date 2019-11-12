package com.example.track.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.track.model.Track;

import com.example.track.repository.TrackDAL;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TrackController {

	
	@Autowired
	private TrackDAL tlDal;

	@RequestMapping(value = "/tracks", method = RequestMethod.GET, produces = "application/json")
	public List<Track> firstPage() {

		return tlDal.findAll();
	}

	@DeleteMapping(path = { "/Tracks/{id}" })
	public Track delete(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Track deletedAl = tlDal.findById(id);
		System.out.println(deletedAl);

		if (tlDal.delete(deletedAl))
			return deletedAl;
		else
			return null;
	}

	@PostMapping("/Tracks")
	public void create(@RequestBody Track tl) {
		tlDal.create(tl);
		System.out.println(tl + " insert");
		// return emp;

	}

	@PutMapping("/Tracks")
	public Track update(@RequestBody Track tl) {
		tlDal.update(tl);

		System.out.println(tl + " updated");
		return tl;
	}

}
