
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.new_crops.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.new_crops.block.entity.TomatoPlantAge4BlockEntity;
import net.mcreator.new_crops.block.entity.TomatoPlantAge3BlockEntity;
import net.mcreator.new_crops.block.entity.TomatoPlantAge2BlockEntity;
import net.mcreator.new_crops.block.entity.TomatoPlantAge1BlockEntity;
import net.mcreator.new_crops.NewCropsMod;

public class NewCropsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, NewCropsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> TOMATO_PLANT_AGE_2 = register("tomato_plant_age_2", NewCropsModBlocks.TOMATO_PLANT_AGE_2, TomatoPlantAge2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOMATO_PLANT_AGE_1 = register("tomato_plant_age_1", NewCropsModBlocks.TOMATO_PLANT_AGE_1, TomatoPlantAge1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOMATO_PLANT_AGE_3 = register("tomato_plant_age_3", NewCropsModBlocks.TOMATO_PLANT_AGE_3, TomatoPlantAge3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOMATO_PLANT_AGE_4 = register("tomato_plant_age_4", NewCropsModBlocks.TOMATO_PLANT_AGE_4, TomatoPlantAge4BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
