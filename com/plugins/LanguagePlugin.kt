package plugins

import java.util.*

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 21/3/18
 */

@Target(AnnotationTarget.CLASS)
annotation class PluginMetaData(val name: String, val description: String, val authors: Array<String>)

@PluginMetaData(name = "LanguagePlugin", description = "The base language plugin interface", authors = ["Hc747"])
interface LanguagePlugin {

    val language: String

    val greeting: String

    fun meta(): PluginMetaData {
        return if (this::class.java.isAnnotationPresent(PluginMetaData::class.java))
            this::class.java.getAnnotation(PluginMetaData::class.java)
        else
            LanguagePlugin::class.java.getAnnotation(PluginMetaData::class.java)
    }

}

@PluginMetaData(name = "EnglishPlugin", description = "A language plugin for English", authors = ["Hc747"])
class EnglishPlugin : LanguagePlugin {

    override val language = "English"

    override val greeting = "Hello"

}

@PluginMetaData(name = "FrenchPlugin", description = "A language plugin for French", authors = ["Hc747"])
class FrenchPlugin : LanguagePlugin {

    override val language = "French"

    override val greeting = "Bonjour"

}

object PluginService {

    val plugins: ServiceLoader<LanguagePlugin> = ServiceLoader.load(LanguagePlugin::class.java)

}

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        PluginService.plugins.forEach {
            printMeta(it.meta())
            printPlugin(it)
        }
    }

    private fun printMeta(meta: PluginMetaData) {
        println("Plugin [name: ${meta.name}, description: ${meta.description}, author(s): ${Arrays.toString(meta.authors)}]")
    }

    private fun printPlugin(plugin: LanguagePlugin) {
        println("A common greeting in ${plugin.language} is ${plugin.greeting}!")
    }

}
