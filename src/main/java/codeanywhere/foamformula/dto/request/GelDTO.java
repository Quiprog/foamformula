package codeanywhere.foamformula.dto.request;

import codeanywhere.foamformula.enums.GelType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GelDTO {

    private Long id;

   @Enumerated(EnumType.STRING)
    private GelType type;

    @NotEmpty
    @Size(max = 3, min = 1)
    private String time;
}
