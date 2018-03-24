package plugins.provider

import plugins.service.LanguagePlugin
import plugins.service.PluginMetaData

@PluginMetaData(name = "EnglishPlugin", description = "A language plugin for English", authors = ["Hc747"])
class EnglishPlugin : LanguagePlugin() {

    override val language = "English"

    override val greeting = "Hello"

}

@PluginMetaData(name = "FrenchPlugin", description = "A language plugin for French", authors = ["Hc747"])
class FrenchPlugin : LanguagePlugin() {

    override val language = "French"

    override val greeting = "Bonjour"

}