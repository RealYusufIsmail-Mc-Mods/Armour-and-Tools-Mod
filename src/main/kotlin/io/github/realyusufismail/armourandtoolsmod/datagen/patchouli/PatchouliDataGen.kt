package io.github.realyusufismail.armourandtoolsmod.datagen.patchouli

import com.khanhpham.patchoulidatagen.bookelement.BookElement
import com.khanhpham.patchoulidatagen.provider.PatchouliBookProvider
import io.github.realyusufismail.armourandtoolsmod.MOD_ID
import net.minecraft.data.CachedOutput
import net.minecraft.data.DataGenerator
import net.minecraft.network.chat.Component
import net.minecraftforge.common.data.ExistingFileHelper
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class PatchouliDataGen(dataGen : DataGenerator, fileHelper : ExistingFileHelper, bookName : String)
    : PatchouliBookProvider(dataGen, fileHelper, bookName, MOD_ID) {
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