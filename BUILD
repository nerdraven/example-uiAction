load("//tools/bzl:plugin.bzl", "gerrit_plugin")

gerrit_plugin(
    name = "trigger",
    srcs = glob(["src/main/java/**/*.java"]),
    manifest_entries = [
        "Gerrit-PluginName: trigger",
        "Gerrit-HttpModule: dev.yungwarlock.gerrit.trigger.HttpModule",
        "Implementation-Title: Gerrit trigger",
    ],
    resources = glob(["src/main/resources/**/*"]),
)
