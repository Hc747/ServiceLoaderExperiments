package plugins.main.registry

import plugins.service.LanguagePlugin
import java.util.*

/**
 * @author Harrison | Hc747
 * Contact: harrisoncole05@gmail.com | harrison.cole@uts.edu.au | harrison.cole-1@student.uts.edu.au
 * @version 1.0
 * @since 24/3/18
 */
object PluginRegistry {

    val plugins: ServiceLoader<LanguagePlugin> = ServiceLoader.load(LanguagePlugin::class.java)

}