package com.example.demo;

import com.example.demo.redis_entity.FIPDetails;
import com.example.demo.redis_repository.FIPDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FIP")
public class FIPController {

    @Autowired
    FIPDetailsRepository fipDetailsRepository;

    @PostMapping("/saveFIPDetails")
    public FIPDetails saveFIPDetails(@RequestBody FIPDetails fipDetails) {
        return fipDetailsRepository.saveFIPDetails(fipDetails);
    }

    @GetMapping("/getFIPDetailsByFIPId/{fipId}")
    public FIPDetails getFipDetailsByFIPId(@PathVariable Integer fipId) {
        return fipDetailsRepository.getFIPDetailsByFIPId(fipId);
    }

    @DeleteMapping("/deletedFIPDetailsByFIPId/{fipId}")
    public String deleteFipDetailsByFIPId(@PathVariable Integer fipId) {
        return fipDetailsRepository.deleteFIPByFIPId(fipId);
    }

    @GetMapping("/getAllFIPDetails")
    public List<FIPDetails> getAllFIPDetails() {
        return fipDetailsRepository.getFIPDetails();
    }
}
