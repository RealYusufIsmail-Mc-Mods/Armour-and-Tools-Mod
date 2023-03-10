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
package io.github.realyusufismail.armourandtoolsmod.core.init

import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BlockTags
import net.minecraft.tags.ItemTags
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block

object TagsInit {

    object BlockTagsInit {
        val ORES_RUBY_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:ores/ruby_ores")?.let { BlockTags.create(it) }
                ?: throw Exception("Failed to create tag")

        val ORES_RAINBOW_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:ores/rainbow_ores")?.let { BlockTags.create(it) }
                ?: throw Exception("Failed to create tag")

        val ORES_SAPPHIRE_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:ores/sapphire_ores")?.let { BlockTags.create(it) }
                ?: throw Exception("Failed to create tag")

        val ORES_GRAPHITE_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:ores/graphite_ores")?.let { BlockTags.create(it) }
                ?: throw Exception("Failed to create tag")

        val ORES_AQUMARINE_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:ores/aqumarine_ores")?.let { BlockTags.create(it) }
                ?: throw Exception("Failed to create tag")

        val DEEPSLATE_ORES_RUBY_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:deepslate_ores/ruby_ores")?.let {
                BlockTags.create(it)
            }
                ?: throw Exception("Failed to create tag")

        val DEEPSLATE_ORES_RAINBOW_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:deepslate_ores/rainbow_ores")?.let {
                BlockTags.create(it)
            }
                ?: throw Exception("Failed to create tag")

        val DEEPSLATE_ORES_SAPPHIRE_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:deepslate_ores/sapphire_ores")?.let {
                BlockTags.create(it)
            }
                ?: throw Exception("Failed to create tag")

        val DEEPSLATE_ORES_GRAPHITE_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:deepslate_ores/graphite_ores")?.let {
                BlockTags.create(it)
            }
                ?: throw Exception("Failed to create tag")

        val DEEPSLATE_ORES_AQUMARINE_ORES: TagKey<Block> =
            ResourceLocation.tryParse("forge:deepslate_ores/aqumarine_ores")?.let {
                BlockTags.create(it)
            }
                ?: throw Exception("Failed to create tag")

        val STORAGE_RUBY =
            ResourceLocation.tryParse("forge:storage_blocks/ruby")?.let { BlockTags.create(it) }
                ?: throw Exception("Failed to create tag")

        val STORAGE_RAINBOW =
            ResourceLocation.tryParse("forge:storage_blocks/rainbow")?.let { BlockTags.create(it) }
                ?: throw Exception("Failed to create tag")

        val STORAGE_SAPPHIRE =
            ResourceLocation.tryParse("forge:storage_blocks/sapphire")?.let { BlockTags.create(it) }
                ?: throw Exception("Failed to create tag")

        val STORAGE_GRAPHITE =
            ResourceLocation.tryParse("forge:storage_blocks/graphite")?.let { BlockTags.create(it) }
                ?: throw Exception("Failed to create tag")

        val STORAGE_AQUMARINE =
            ResourceLocation.tryParse("forge:storage_blocks/aqumarine")?.let {
                BlockTags.create(it)
            }
                ?: throw Exception("Failed to create tag")
    }

    object ItemTagsInit {
        val ORES_RUBY_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ores/ruby_ores")
                    ?: throw Exception("Failed to create tag"))

        val ORES_RAINBOW_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ores/rainbow_ores")
                    ?: throw Exception("Failed to create tag"))

        val ORES_SAPPHIRE_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ores/sapphire_ores")
                    ?: throw Exception("Failed to create tag"))

        val ORES_GRAPHITE_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ores/graphite_ores")
                    ?: throw Exception("Failed to create tag"))

        val ORES_AQUMARINE_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ores/aqumarine_ores")
                    ?: throw Exception("Failed to create tag"))

        val DEEPSLATE_ORES_RUBY_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:deepslate_ores/ruby_ores")
                    ?: throw Exception("Failed to create tag"))

        val DEEPSLATE_ORES_RAINBOW_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:deepslate_ores/rainbow_ores")
                    ?: throw Exception("Failed to create tag"))

        val DEEPSLATE_ORES_SAPPHIRE_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:deepslate_ores/sapphire_ores")
                    ?: throw Exception("Failed to create tag"))

        val DEEPSLATE_ORES_GRAPHITE_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:deepslate_ores/graphite_ores")
                    ?: throw Exception("Failed to create tag"))

        val DEEPSLATE_ORES_AQUMARINE_ORES: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:deepslate_ores/aqumarine_ores")
                    ?: throw Exception("Failed to create tag"))

        val STORAGE_RUBY: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:storage_blocks/ruby")
                    ?: throw Exception("Failed to create tag"))

        val STORAGE_RAINBOW: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:storage_blocks/rainbow")
                    ?: throw Exception("Failed to create tag"))

        val STORAGE_SAPPHIRE: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:storage_blocks/sapphire")
                    ?: throw Exception("Failed to create tag"))

        val STORAGE_GRAPHITE: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:storage_blocks/graphite")
                    ?: throw Exception("Failed to create tag"))

        val STORAGE_AQUMARINE: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:storage_blocks/aqumarine")
                    ?: throw Exception("Failed to create tag"))

        // ore ingots
        val INGOTS_RUBY: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ingots/ruby")
                    ?: throw Exception("Failed to create tag"))

        val INGOTS_RAINBOW: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ingots/rainbow")
                    ?: throw Exception("Failed to create tag"))

        val INGOTS_SAPPHIRE: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ingots/sapphire")
                    ?: throw Exception("Failed to create tag"))

        val INGOTS_GRAPHITE: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ingots/graphite")
                    ?: throw Exception("Failed to create tag"))

        val INGOTS_AQUMARINE: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:ingots/aqumarine")
                    ?: throw Exception("Failed to create tag"))

        // raw ore scraps
        val RAW_RUBY: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:scraps/ruby")
                    ?: throw Exception("Failed to create tag"))

        val RAW_RAINBOW: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:scraps/rainbow")
                    ?: throw Exception("Failed to create tag"))

        val RAW_SAPPHIRE: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:scraps/sapphire")
                    ?: throw Exception("Failed to create tag"))

        val RAW_GRAPHITE: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:scraps/graphite")
                    ?: throw Exception("Failed to create tag"))

        val RAW_AQUMARINE: TagKey<Item> =
            ItemTags.create(
                ResourceLocation.tryParse("forge:scraps/aqumarine")
                    ?: throw Exception("Failed to create tag"))
    }
}
