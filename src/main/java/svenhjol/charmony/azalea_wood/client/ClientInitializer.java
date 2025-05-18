package svenhjol.charmony.azalea_wood.client;

import net.fabricmc.api.ClientModInitializer;
import svenhjol.charmony.azalea_wood.AzaleaWoodMod;
import svenhjol.charmony.azalea_wood.client.features.azalea_wood.AzaleaWood;
import svenhjol.charmony.api.core.Side;

public final class ClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Ensure charmony is launched first.
        svenhjol.charmony.core.client.ClientInitializer.init();

        // Prepare and run the mod.
        var mod = AzaleaWoodMod.instance();

        mod.addSidedFeature(AzaleaWood.class);
        mod.run(Side.Client);
    }
}
