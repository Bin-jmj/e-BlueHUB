package eblue.hub.eblue.hub.speciesController;

import eblue.hub.eblue.hub.services.SpeciesService;
import eblue.hub.eblue.hub.speciesModel.Species;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Species")
public class SpeciesResource {
    private  final SpeciesService speciesService;

    public SpeciesResource(SpeciesService speciesService) {
        this.speciesService = speciesService;
    }

    //kupata species zote

    @GetMapping("/all")
    public ResponseEntity<List<Species>> getAllSpecies() {
        List<Species> species = speciesService.findAllSpecies();
        return  new ResponseEntity<>(species, HttpStatus.OK);
    }

    //ku find species kwa id yake
    @GetMapping("/find/{id}")
    public ResponseEntity<Species> getSpeciesById(@PathVariable("id") Long id) {
         Species species = speciesService.findSpeciesById(id);
        return  new ResponseEntity<>(species, HttpStatus.OK);
    }

    //ku add new species
    @PostMapping("/add")
    public ResponseEntity<Species> addSpecies(@RequestBody Species species) {
        Species newSpecies = speciesService.addSpecies(species);
        return new ResponseEntity<>(newSpecies, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Species> updateSpecies(@RequestBody Species species) {
        Species updateSpecies = speciesService.updateSpecies(species);
        return new ResponseEntity<>(updateSpecies, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Species> deleteSpecies(@PathVariable("id") Long id) {
         speciesService.deleteSpecies(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
