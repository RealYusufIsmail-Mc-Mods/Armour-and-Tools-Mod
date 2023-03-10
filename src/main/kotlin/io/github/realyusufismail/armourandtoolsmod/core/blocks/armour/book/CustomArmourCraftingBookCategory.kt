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
package io.github.realyusufismail.armourandtoolsmod.core.blocks.armour.book

import net.minecraft.util.StringRepresentable

enum class CustomArmourCraftingBookCategory(private var bookName: String) : StringRepresentable {
    EQUIPMENT("equipment"),
    MISC("misc"),
    UNKNOWN("unknown");

    companion object {
        val CODEC: StringRepresentable.EnumCodec<CustomArmourCraftingBookCategory> =
            StringRepresentable.fromEnum { CustomArmourCraftingBookCategory.values() }

        fun fromName(name: String): CustomArmourCraftingBookCategory {
            return CustomArmourCraftingBookCategory.values().first { it.name == name }
        }
    }

    override fun getSerializedName(): String {
        return bookName
    }
}
