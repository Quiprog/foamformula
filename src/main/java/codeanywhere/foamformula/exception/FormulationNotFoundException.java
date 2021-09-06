package codeanywhere.foamformula.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FormulationNotFoundException extends Exception {
    public FormulationNotFoundException(Long id) {
        super("Formulation not found with ID" + id);
    }
}
