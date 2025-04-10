package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.STRANGER_THINGS] category.
 */
@Suppress("unused")
class StrangerThings internal constructor(fakerService: FakerService) : YamlFakeDataProvider<StrangerThings>(fakerService) {
    override val yamlCategory = YamlCategory.STRANGER_THINGS
    override val localUniqueDataProvider = LocalUniqueDataProvider<StrangerThings>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun character() = resolve("character")
    fun quote() = resolve("quote")
}
