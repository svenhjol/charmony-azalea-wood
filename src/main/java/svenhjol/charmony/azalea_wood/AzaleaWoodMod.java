package svenhjol.charmony.azalea_wood;

import svenhjol.charmony.api.core.ModDefinition;
import svenhjol.charmony.api.core.Side;
import svenhjol.charmony.core.base.Mod;

@ModDefinition(
    id = AzaleaWoodMod.ID,
    sides = {Side.Client, Side.Common},
    name = "Azalea Wood",
    description = "A wood type obtainable from naturally occuring azalea trees.")
public final class AzaleaWoodMod extends Mod {
    public static final String ID = "charmony-azalea-wood";
    private static AzaleaWoodMod instance;

    private AzaleaWoodMod() {}

    public static AzaleaWoodMod instance() {
        if (instance == null) {
            instance = new AzaleaWoodMod();
        }
        return instance;
    }
}