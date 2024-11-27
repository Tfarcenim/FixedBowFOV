package tfar.fixedbowfov.mixin;

import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import org.spongepowered.asm.mixin.Overwrite;
import tfar.fixedbowfov.FixedBowFOV;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BowItem.class)
public class MixinMinecraft {

    /**
     * @author yes
     * @reason no
     */
    @Overwrite
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.NONE;
    }
}