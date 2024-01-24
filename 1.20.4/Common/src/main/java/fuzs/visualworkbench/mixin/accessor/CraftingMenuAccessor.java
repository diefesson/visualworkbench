package fuzs.visualworkbench.mixin.accessor;

import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.inventory.ResultContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(CraftingMenu.class)
public interface CraftingMenuAccessor {

    @Mutable
    @Accessor("craftSlots")
    void visualworkbench$setCraftSlots(CraftingContainer craftSlots);

    @Mutable
    @Accessor("resultSlots")
    void visualworkbench$setResultSlots(ResultContainer resultSlots);

    @Mutable
    @Accessor("craftSlots")
    CraftingContainer visualworkbench$getCraftSlots();

    @Accessor("resultSlots")
    ResultContainer visualworkbench$getResultSlots();
}
