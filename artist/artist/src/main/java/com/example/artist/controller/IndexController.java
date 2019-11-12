package com.example.artist.controller;

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

import com.example.artist.model.Artist;
import com.example.artist.repository.ArtistDAL;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class IndexController {

	
	@Autowired
	private ArtistDAL artDal;

	@RequestMapping(value = "/artists", method = RequestMethod.GET, produces = "application/json")
	public List<Artist> firstPage() {

		return artDal.findAll();
	}

	@DeleteMapping(path = { "/artists/{name}" })
	public Artist delete(@PathVariable("name") String name) {
		System.out.println("name " + name);
		Artist deletedArt = artDal.findByName(name);
		System.out.println(deletedArt);

		if (artDal.delete(deletedArt))
			return deletedArt;
		else
			return null;
	}

	@PostMapping("/artists")
	public void create(@RequestBody Artist art) {
		artDal.create(art);
		System.out.println(art + " insert");
		// return emp;

	}

	@PutMapping("/artists")
	public Artist update(@RequestBody Artist art) {
		artDal.update(art);

		System.out.println(art + " updated");
		return art;
	}

}
