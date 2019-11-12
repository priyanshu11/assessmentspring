package com.example.album.controller;

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

import com.example.album.model.Album;
import com.example.album.repository.AlbumDAL;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AlbumController {

	
	@Autowired
	private AlbumDAL alDal;

	@RequestMapping(value = "/albums", method = RequestMethod.GET, produces = "application/json")
	public List<Album> firstPage() {

		return alDal.findAll();
	}

	@DeleteMapping(path = { "/albums/{id}" })
	public Album delete(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Album deletedAl = alDal.findById(id);
		System.out.println(deletedAl);

		if (alDal.delete(deletedAl))
			return deletedAl;
		else
			return null;
	}

	@PostMapping("/albums")
	public void create(@RequestBody Album al) {
		alDal.create(al);
		System.out.println(al + " insert");
		// return emp;

	}

	@PutMapping("/albums")
	public Album update(@RequestBody Album al) {
		alDal.update(al);

		System.out.println(al + " updated");
		return al;
	}

}