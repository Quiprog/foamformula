package codeanywhere.foamformula.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GelType {

    SEA("Sea"),
    MOUNTAIN("Mountain"),
    PEAK("Peak");

    private final String description;
}
