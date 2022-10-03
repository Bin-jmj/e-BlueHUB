package eblue.hub.eblue.hub.services;

import eblue.hub.eblue.hub.exception.UserNotFoundException;
import eblue.hub.eblue.hub.speciesModel.Species;
import eblue.hub.eblue.hub.speciesRepository.SpeciesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SpeciesService {
    private final SpeciesRepo speciesRepo;

    @Autowired
    public  SpeciesService(SpeciesRepo speciesRepo ) {
        this.speciesRepo = speciesRepo;
    }

    public Species addSpecies(Species species) {
        species.setSpeciesCode(UUID.randomUUID().toString());
        return speciesRepo.save(species);
    }

    public List<Species> findAllSpecies() {
        return speciesRepo.findAll();
    }
    public Species updateSpecies(Species species) {
        return speciesRepo.save(species);
    }

    public Species findSpeciesById(Long id) {
        return speciesRepo.findSpeciesById(id)
                .orElseThrow( () -> new UserNotFoundException("Species by id "+id+" Was not found"));
    }

    public void deleteSpecies(Long id) {
        speciesRepo.deleteSpeciesById(id);
    }
}
