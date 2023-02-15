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
package io.github.realyusufismail.armourandtoolsmod.datagen.patchouli

import com.khanhpham.patchoulidatagen.bookelement.BookElement
import com.khanhpham.patchoulidatagen.provider.PatchouliBookProvider
import io.github.realyusufismail.armourandtoolsmod.MOD_ID
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import net.minecraft.data.CachedOutput
import net.minecraft.data.DataGenerator
import net.minecraft.network.chat.Component
import net.minecraftforge.common.data.ExistingFileHelper

class ArmourAndToolsRecipeBookDataGen(dataGen: DataGenerator, fileHelper: ExistingFileHelper) :
    PatchouliBookProvider(dataGen, fileHelper, "ArmourAndToolsRecipeBook", MOD_ID) {

    override fun run(pOutput: CachedOutput): CompletableFuture<*> {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        TODO("Not yet implemented")
    }

    override fun buildPages(consumer: Consumer<BookElement>?) {
        TODO("Not yet implemented")
    }

    private fun translate(key: String): Component {
        return Component.translatable(key)
    }
}