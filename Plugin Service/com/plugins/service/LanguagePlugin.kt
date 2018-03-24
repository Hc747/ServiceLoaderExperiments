package plugins.service

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 21/3/18
 */

@Target(AnnotationTarget.CLASS)
annotation class PluginMetaData(val name: String, val description: String, val authors: Array<String>)

@PluginMetaData(name = "LanguagePlugin", description = "The base language plugin interface", authors = ["Hc747"])
abstract class LanguagePlugin {

    abstract val language: String

    abstract val greeting: String

    val meta = this::class.java.getAnnotation(PluginMetaData::class.java)!!

}

