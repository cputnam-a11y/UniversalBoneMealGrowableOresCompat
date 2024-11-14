package universalbonemealgrowableorescompat.behaviorregister;

import com.skniro.growableores.block.GrowableThermalSeriesOresBlocks;
import fuzs.universalbonemeal.handler.UseBoneMealHandler;
import fuzs.universalbonemeal.world.level.block.behavior.SimpleGrowingPlantBehavior;

public class ThermalUniversalBoneMealBehaviors {
    public static void registerBehaviors() {
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Apatite_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Cinnabar_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Copper_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Lead_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Nickel_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Niter_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Ruby_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Sapphire_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Silver_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Sulfur_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
        UseBoneMealHandler.registerBehavior(
                GrowableThermalSeriesOresBlocks.TF_Tin_Cane,
                SimpleGrowingPlantBehavior::new,
                () -> true
        );
    }
}
