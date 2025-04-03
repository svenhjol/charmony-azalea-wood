package svenhjol.charmony.azalea_wood.common.features.azalea_wood;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import svenhjol.charmony.core.base.Setup;
import svenhjol.charmony.core.common.CommonRegistry;
import svenhjol.charmony.core.common.features.wood.WoodMaterial;
import svenhjol.charmony.core.common.features.wood.WoodRegistry;
import svenhjol.charmony.core.common.features.wood.types.Door;
import svenhjol.charmony.core.common.features.wood.types.Log;
import svenhjol.charmony.core.common.features.wood.types.Planks;
import svenhjol.charmony.core.common.features.wood.types.Trapdoor;

import java.util.function.Supplier;

public final class Registers extends Setup<AzaleaWood> {
    public final Supplier<BlockSetType> blockSetType;
    public final Supplier<WoodType> woodType;
    public final Supplier<WoodMaterial> material;

    public Door door;
    public Log log;
    public Planks planks;
    public Trapdoor trapdoor;

    public Registers(AzaleaWood feature) {
        super(feature);
        var commonRegistry = CommonRegistry.forFeature(feature);
        var woodRegistry = WoodRegistry.forRegistry(commonRegistry);

        material = () -> AzaleaWoodMaterial.AZALEA;
        blockSetType = commonRegistry.blockSetType(material);
        woodType = commonRegistry.woodType("azalea", blockSetType);

        var azalea = material.get();

        planks = woodRegistry.planks(azalea);
        log = woodRegistry.log(azalea);
        door = woodRegistry.door(azalea);
        trapdoor = woodRegistry.trapdoor(azalea);

        woodRegistry.boat(azalea);
        woodRegistry.button(azalea);
        woodRegistry.fence(azalea);
        woodRegistry.gate(azalea);
        woodRegistry.hangingSign(azalea);
        woodRegistry.pressurePlate(azalea);
        woodRegistry.sign(azalea);
        woodRegistry.slab(azalea);
        woodRegistry.stairs(azalea, planks);
        woodRegistry.wood(azalea);
    }

    @Override
    public Runnable boot() {
        return () -> {
            ServerLifecycleEvents.SERVER_STARTED.register(this::serverStarting);
            var x = 3;
        };
    }

    @SuppressWarnings("unchecked")
    private void serverStarting(MinecraftServer server) {
        // Make naturally occurring azalea trees use Azalea log.
        var configuredFeatures = server.registryAccess().lookup(Registries.CONFIGURED_FEATURE).orElseThrow();
        ConfiguredFeature<?, ?> feature
            = configuredFeatures.getValueOrThrow(TreeFeatures.AZALEA_TREE);

        ((ConfiguredFeature<TreeConfiguration, ?>)feature).config().trunkProvider
            = new SimpleStateProvider(log.block.get().defaultBlockState());
    }
}
