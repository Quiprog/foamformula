package codeanywhere.foamformula.service;

import codeanywhere.foamformula.dto.request.FormulationDTO;
import codeanywhere.foamformula.dto.response.MessageResponseDTO;
import codeanywhere.foamformula.entity.Formulation;
import codeanywhere.foamformula.exception.FormulationNotFoundException;
import codeanywhere.foamformula.mapper.FormulationMapper;
import codeanywhere.foamformula.repository.FormulationRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FormulationService {

    private FormulationRepository formulationRepository;

    private final FormulationMapper formulationMapper = FormulationMapper.INSTANCE;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createFormulation(FormulationDTO formulationDTO) {
        Formulation formulationToSave = formulationMapper.toModel(formulationDTO);

        Formulation savedFormulation = formulationRepository.save(formulationToSave);
        return createMessageResponse(savedFormulation.getId(), "Created formulation with ID");
    }

    public List<FormulationDTO> listAll() {
        List<Formulation> allFormula = formulationRepository.findAll();
        return allFormula.stream()
                .map(formulationMapper::toDTO)
                .collect(Collectors.toList());
    }

    public FormulationDTO findById(Long id) throws FormulationNotFoundException {
        Formulation formulation = verifyIfExists(id);

        return formulationMapper.toDTO(formulation);
    }

    public void delete(Long id) throws FormulationNotFoundException {
        verifyIfExists(id);

        formulationRepository.deleteById(id);
    }


    public MessageResponseDTO updateById(Long id, FormulationDTO formulationDTO) throws FormulationNotFoundException {
        verifyIfExists(id);

        Formulation formulationToUpdate = formulationMapper.toModel(formulationDTO);

        Formulation updatedFormulation = formulationRepository.save(formulationToUpdate);
        return createMessageResponse(updatedFormulation.getId(), "Updated formulation with ID");
    }

    private Formulation verifyIfExists(Long id) throws FormulationNotFoundException {
        return formulationRepository.findById(id)
                .orElseThrow(() -> new FormulationNotFoundException(id));
    }

    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}



