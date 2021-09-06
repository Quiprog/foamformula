package codeanywhere.foamformula.repository;

import codeanywhere.foamformula.entity.Formulation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormulationRepository extends JpaRepository<Formulation, Long> {
}
