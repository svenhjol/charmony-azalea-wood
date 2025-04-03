package svenhjol.charmony.azalea_wood.client.features.azalea_wood;

import svenhjol.charmony.azalea_wood.common.features.azalea_wood.AzaleaWood;
import svenhjol.charmony.azalea_wood.common.features.azalea_wood.Registers;

public class Common {
    public final Registers registers;

    public Common() {
        var feature = AzaleaWood.feature();
        registers = feature.registers;
    }
}
