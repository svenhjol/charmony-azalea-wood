package svenhjol.charmony.azalea_wood;

import net.minecraft.resources.ResourceLocation;
import svenhjol.charmony.core.annotations.ModDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.core.enums.Side;

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

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}