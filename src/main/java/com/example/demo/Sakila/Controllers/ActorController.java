package com.example.demo.Sakila.Controllers;

import com.example.demo.Sakila.Entities.Actor;
import com.example.demo.Sakila.Repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class ActorController {
    @Autowired
    @Qualifier("actorRepository")
    private ActorRepository actorRepository;
    
    @GetMapping("/addData")
	public String addData2DB() {
    	Actor ac = new Actor();
    	ac.setActorId(1234);
    	ac.setFirstName("hello");
    	ac.setLastName("hai");
    	actorRepository.save(ac);
    	
		return "Data Added Successfully";
	}

//    @GetMapping("/actors")
//    public List<Actor> actors(){
//        return actorRepository.findAll();
//    }
}
