package svenhjol.charmony.azalea_wood.client.features.azalea_wood;

import svenhjol.charmony.core.annotations.FeatureDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.core.base.SidedFeature;
import svenhjol.charmony.core.enums.Side;

import java.util.function.Supplier;

@FeatureDefinition(side = Side.Client, canBeDisabled = false)
public final class AzaleaWood extends SidedFeature {
    public final Registers registers;
    public final Supplier<Common> common;

    public AzaleaWood(Mod mod) {
        super(mod);
        common = Common::new;
        registers = new Registers(this);
    }

    public static AzaleaWood feature() {
        return Mod.getSidedFeature(AzaleaWood.class);
    }
}
