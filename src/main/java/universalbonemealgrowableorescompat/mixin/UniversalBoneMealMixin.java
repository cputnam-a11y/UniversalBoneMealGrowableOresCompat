package universalbonemealgrowableorescompat.mixin;

import com.skniro.growableores.conifg.GrowableOresConfig;
import fuzs.universalbonemeal.UniversalBoneMeal;
import net.fabricmc.loader.api.FabricLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import universalbonemealgrowableorescompat.behaviorregister.*;

@Mixin(value = UniversalBoneMeal.class, remap = false)
public class UniversalBoneMealMixin {
    @Inject(method = "registerBonemealBehaviors", at = @At("TAIL"))
    private static void registerBonemealBehaviors(CallbackInfo ci) {
        VanillaBoneMealBehaviors.registerBehaviors();
        if (FabricLoader.getInstance().isModLoaded("ae2") || GrowableOresConfig.All_Item_Mode) {
            AEUniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("maple") || GrowableOresConfig.All_Item_Mode) {
            MapleBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("ad_astra") || GrowableOresConfig.All_Item_Mode) {
            AdAstraUniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("betterend") || GrowableOresConfig.All_Item_Mode) {
            BetterEndUniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("create") || GrowableOresConfig.All_Item_Mode) {
            CreateUniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("ic2") || GrowableOresConfig.All_Item_Mode) {
            IC2UniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("indrev") || GrowableOresConfig.All_Item_Mode) {
            IndustrialRevolutionBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("modern_industrialization") || GrowableOresConfig.All_Item_Mode) {
            ModernIndustrializationBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("powah") || GrowableOresConfig.All_Item_Mode) {
            PowahUniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("techreborn") || GrowableOresConfig.All_Item_Mode) {
            TechRebornUniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("thermal") || GrowableOresConfig.All_Item_Mode) {
            ThermalUniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("mekanism") || GrowableOresConfig.All_Item_Mode) {
            MekanismUniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("betternether") || GrowableOresConfig.All_Item_Mode) {
            BetterNetherUniversalBoneMealBehaviors.registerBehaviors();
        }

        if (FabricLoader.getInstance().isModLoaded("energizedpower") || GrowableOresConfig.All_Item_Mode) {
            EnergizedPowerBoneMealBehaviors.registerBehaviors();
        }
    }
}
