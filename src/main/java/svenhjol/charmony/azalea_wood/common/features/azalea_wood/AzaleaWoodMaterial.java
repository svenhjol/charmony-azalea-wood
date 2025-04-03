package svenhjol.charmony.azalea_wood.common.features.azalea_wood;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import svenhjol.charmony.core.common.features.wood.WoodMaterial;

import java.util.Locale;

public enum AzaleaWoodMaterial implements WoodMaterial {
    AZALEA;

    @Override
    public BlockSetType blockSetType() {
        return AzaleaWood.feature().registers.blockSetType.get();
    }

    @Override
    public WoodType woodType() {
        return AzaleaWood.feature().registers.woodType.get();
    }

    @Override
    public SoundType soundType() {
        return SoundType.WOOD;
    }

    @Override
    public String getSerializedName() {
        return name().toLowerCase(Locale.ENGLISH);
    }
}
