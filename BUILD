load("//tools/bzl:plugin.bzl", "gerrit_plugin")

gerrit_plugin(
    name = "example-topMenu",
    srcs = glob(["src/main/java/**/*.java"]),
    manifest_entries = [
        "Gerrit-PluginName: example-topMenu",
        "Gerrit-Module: com.googlesource.gerrit.plugins.examples.topmenu.Module",
	'Gerrit-HttpModule: com.googlesource.gerrit.plugins.examples.topmenu.HttpModule',
        "Implementation-Title: Example Top Menu",
    ],
    resources = glob(["src/main/resources/**/*"]),
)
