package codeanywhere.foamformula.mapper;

import codeanywhere.foamformula.dto.request.FormulationDTO;
import codeanywhere.foamformula.entity.Formulation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FormulationMapper {

    FormulationMapper INSTANCE = Mappers.getMapper(FormulationMapper.class);

    @Mapping(target = "c", source = "c", dateFormat = "dd-MM-yyyy")
    Formulation toModel(FormulationDTO formulationDTO);

    @Mapping(target = "c", source = "c", dateFormat = "dd-MM-yyyy")
    FormulationDTO toDTO(Formulation formulation);
}
