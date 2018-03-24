import plugins.provider.EnglishPlugin;
import plugins.provider.FrenchPlugin;

module plugins.provider {

	requires kotlin.stdlib;
	requires plugins.service;

	provides plugins.service.LanguagePlugin with EnglishPlugin, FrenchPlugin;

}