package plugins

import java.util.*

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 21/3/18
 */
annotation class PluginMetaData(val name: String, val description: String, val authors: Array<String>)


@PluginMetaData(name = "LanguagePlugin", description = "The base language plugin interface.", authors = ["Hc747"])
interface LanguagePlugin {

    val language: String

    val greeting: String

}

class EnglishPlugin : LanguagePlugin {

    override val language = "English"

    override val greeting = "Hello"

}

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
            println("A common greeting in ${it.language} is ${it.greeting}!")
        }
    }

}
