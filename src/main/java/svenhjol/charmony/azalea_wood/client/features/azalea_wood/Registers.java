package svenhjol.charmony.azalea_wood.client.features.azalea_wood;

import net.minecraft.client.renderer.RenderType;
import svenhjol.charmony.core.base.Setup;
import svenhjol.charmony.core.client.ClientRegistry;

public class Registers extends Setup<AzaleaWood> {
    public Registers(AzaleaWood feature) {
        super(feature);

        var clientRegistry = ClientRegistry.forFeature(feature);
        var commonRegisters = feature.common.get().registers;

        var door = commonRegisters.door;
        var trapdoor = commonRegisters.trapdoor;

        // Cut out transparent areas of doors and trapdoors.
        clientRegistry.blockRenderType(door.block, RenderType::cutout);
        clientRegistry.blockRenderType(trapdoor.block, RenderType::cutout);
    }
}
