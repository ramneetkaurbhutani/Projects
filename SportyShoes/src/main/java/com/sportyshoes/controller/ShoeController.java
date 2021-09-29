package com.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.entity.Shoe;
import com.sportyshoes.repository.ShoeRepository;

@RestController
@RequestMapping("/admin")
public class ShoeController {
	
	@Autowired
	ShoeRepository shoeRepository;
	
	//List of Shoes
	@GetMapping("/shoes")
	public List<Shoe> getShoes(){
		List<Shoe> shoes = shoeRepository.findAll();
		return shoes;
	}
	
	@GetMapping("/shoes/{id}")
	public Shoe getOneShoe(@PathVariable(value = "id") int id) {
		Shoe shoe = shoeRepository.findById(id).get();
		return shoe;
	}
	
	@PostMapping("/shoes")
	public Shoe addOneShoe(@RequestBody Shoe shoeObj) {
		Shoe shoe = shoeRepository.save(shoeObj);
		return shoe;
	}
	
	//Update Shoe Details
	@PutMapping("/shoes/{id}")
	public String updateShoe( @PathVariable(value = "id") int id, @RequestBody Shoe shoeObj) {
		Shoe fetchShoe = shoeRepository.findById(id).get();
		fetchShoe.setShoeName(shoeObj.getShoeName());
		fetchShoe.setShoeBrand(shoeObj.getShoeBrand());
		fetchShoe.setShoeCategory(shoeObj.getShoeCategory());
		fetchShoe.setShoePrice(shoeObj.getShoePrice());
		fetchShoe.setShoeSize(shoeObj.getShoeSize());
		
		Shoe shoe = shoeRepository.save(fetchShoe);
		return "Shoe Details updated";
		
	}
	
	@DeleteMapping("/shoes/{id}")
	public void deleteShoe(@PathVariable(value = "id") int id) {
		Shoe fetchShoe = shoeRepository.findById(id).get();
		shoeRepository.delete(fetchShoe);
	}
	
	
}
