package svenhjol.charmony.azalea_wood.common.mixins;

import svenhjol.charmony.core.base.MixinConfig;
import svenhjol.charmony.core.enums.Side;
import svenhjol.charmony.azalea_wood.AzaleaWoodMod;

public class CommonMixinConfig extends MixinConfig {
    @Override
    protected String modId() {
        return AzaleaWoodMod.ID;
    }

    @Override
    protected String modRoot() {
        return "svenhjol.charmony.azalea_wood";
    }

    @Override
    protected Side side() {
        return Side.Common;
    }
}
