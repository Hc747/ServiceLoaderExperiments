package plugins.main

import plugins.main.registry.PluginRegistry
import plugins.service.LanguagePlugin
import plugins.service.PluginMetaData
import java.util.*

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 24/3/18
 */
object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        PluginRegistry.plugins.forEach {
            printMeta(it.meta)
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