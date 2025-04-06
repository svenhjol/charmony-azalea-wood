package svenhjol.charmony.azalea_wood.common.features.azalea_wood;

import svenhjol.charmony.core.annotations.FeatureDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.core.base.SidedFeature;
import svenhjol.charmony.core.enums.Side;

@FeatureDefinition(side = Side.Common, description = """
    Azalea wood is obtainable from naturally occurring azalea trees or by growing azalea saplings.""")
public final class AzaleaWood extends SidedFeature {
    public final Registers registers;

    public AzaleaWood(Mod mod) {
        super(mod);
        registers = new Registers(this);
    }

    public static AzaleaWood feature() {
        return Mod.getSidedFeature(AzaleaWood.class);
    }
}
