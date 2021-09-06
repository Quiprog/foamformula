package codeanywhere.foamformula.controller;

import codeanywhere.foamformula.dto.request.FormulationDTO;
import codeanywhere.foamformula.dto.response.MessageResponseDTO;
import codeanywhere.foamformula.exception.FormulationNotFoundException;
import codeanywhere.foamformula.service.FormulationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v3/api/formula")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class FormulationController {

    private FormulationService formulationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createFormulation(@RequestBody @Valid FormulationDTO formulationDTO) {
        return formulationService.createFormulation(formulationDTO);
    }

    @GetMapping
    public List<FormulationDTO> listAll() {

        return formulationService.listAll();
    }

    @GetMapping("/{id}")
    public FormulationDTO findById(@PathVariable Long id) throws FormulationNotFoundException {
        return formulationService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid FormulationDTO formulationDTO) throws FormulationNotFoundException {
        return formulationService.updateById(id, formulationDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws FormulationNotFoundException {
        formulationService.delete(id);
    }
}

