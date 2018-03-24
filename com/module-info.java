module plugins.main {

	requires kotlin.stdlib;
	requires plugins.service;
	requires plugins.provider;

	uses plugins.service.LanguagePlugin;

}