package eblue.hub.eblue.hub.speciesRepository;

import eblue.hub.eblue.hub.speciesModel.Species;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpeciesRepo extends JpaRepository<Species, Long> {
void deleteSpeciesById(Long id);

Optional<Species> findSpeciesById(Long id);
}
