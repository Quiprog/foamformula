package codeanywhere.foamformula.dto.request;

import codeanywhere.foamformula.entity.Gel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FormulationDTO {

    private Long id;

    private String a;

    @NotEmpty
    @CPF
    private String b;

    private LocalDate c;

    @Size(max = 1, min = 1)
    private String d;

    @Size(max = 5, min = 3)
    private String e;

    @Size(max = 5, min = 3)
    private String f;

    @Size(max = 5, min = 3)
    private String g;

    @Size(max = 5, min = 3)
    private String h;

    @Size(max = 5, min = 3)
    private String i;

    @Size(max = 6, min = 6)
    private String total;

    @NotEmpty
    @Valid
    private List<Gel> gels;
}
