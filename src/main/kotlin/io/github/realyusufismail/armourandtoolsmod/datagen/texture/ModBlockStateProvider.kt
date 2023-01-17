/*
 * Copyright 2022 RealYusufIsmail.
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 
package io.github.realyusufismail.armourandtoolsmod.datagen.texture

import io.github.realyusufismail.armourandtoolsmod.MOD_ID
import io.github.realyusufismail.armourandtoolsmod.core.init.BlockInit
import net.minecraft.data.PackOutput
import net.minecraft.world.level.block.Block
import net.minecraftforge.client.model.generators.BlockStateProvider
import net.minecraftforge.common.data.ExistingFileHelper
import net.minecraftforge.registries.ForgeRegistries

class ModBlockStateProvider(output: PackOutput, exFileHelper: ExistingFileHelper) :
    BlockStateProvider(output, MOD_ID, exFileHelper) {

    override fun getName(): String {
        return "Armour and Tools Mod Blockstates"
    }
    override fun registerStatesAndModels() {
        normalBlock(BlockInit.RUBY_ORE.get())
        normalBlock(BlockInit.RAINBOW_ORE.get())
        normalBlock(BlockInit.SAPPHIRE_ORE.get())
        normalBlock(BlockInit.GRAPHITE_ORE.get())
        normalBlock(BlockInit.AQUMARINE_ORE.get())
        normalBlock(BlockInit.DEEPSLATE_RUBY_ORE.get())
        normalBlock(BlockInit.DEEPSLATE_RAINBOW_ORE.get())
        normalBlock(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get())
        normalBlock(BlockInit.DEEPSLATE_GRAPHITE_ORE.get())
        normalBlock(BlockInit.DEEPSLATE_AQUMARINE_ORE.get())
        normalBlock(BlockInit.RUBY_BLOCK.get())
        normalBlock(BlockInit.RAINBOW_BLOCK.get())
        normalBlock(BlockInit.SAPPHIRE_BLOCK.get())
        normalBlock(BlockInit.GRAPHITE_BLOCK.get())
        normalBlock(BlockInit.AQUMARINE_BLOCK.get())
    }

    private fun normalBlock(block: Block) {
        val name = ForgeRegistries.BLOCKS.getKey(block) ?: return
        simpleBlock(block, models().cubeAll(name.path, modLoc("block/${name.path}")))
        simpleBlockItem(block, models().cubeAll(name.path, modLoc("block/${name.path}")))
    }
}
