package tfar.fixedbowfov;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraftforge.client.event.ComputeFovModifierEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(FixedBowFOV.MOD_ID)
public class FixedBowFOVForge {
    
    public FixedBowFOVForge() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
        MinecraftForge.EVENT_BUS.addListener((ComputeFovModifierEvent event)->{
            Player player = event.getPlayer();
            if (player.getUseItem().getItem() instanceof BowItem) {
                event.setNewFovModifier(1);
            }
        });
        // Use Forge to bootstrap the Common mod.

        FixedBowFOV.init();
        
    }

}