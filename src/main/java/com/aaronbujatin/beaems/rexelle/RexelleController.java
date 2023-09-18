package com.aaronbujatin.beaems.rexelle;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/rexelle")
public class RexelleController {

    private final RexelleRepository rexelleRepository;

    @PostMapping()
    public Rexelle save(@RequestBody Rexelle rexelle){
        return rexelleRepository.save(rexelle);
    }

    @GetMapping("/{id}")
    public Rexelle getData(@PathVariable String id){
        return rexelleRepository.findById(id).get();
    }


}
