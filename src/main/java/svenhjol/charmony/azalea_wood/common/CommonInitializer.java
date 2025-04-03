package svenhjol.charmony.azalea_wood.common;

import net.fabricmc.api.ModInitializer;
import svenhjol.charmony.azalea_wood.AzaleaWoodMod;
import svenhjol.charmony.azalea_wood.common.features.azalea_wood.AzaleaWood;
import svenhjol.charmony.core.enums.Side;

public final class CommonInitializer implements ModInitializer {
    @Override
    public void onInitialize() {
        // Ensure charmony is launched first.
        svenhjol.charmony.core.common.CommonInitializer.init();

        // Prepare and run the mod.
        var mod = AzaleaWoodMod.instance();

        mod.addSidedFeature(AzaleaWood.class);
        mod.run(Side.Common);
    }
}
