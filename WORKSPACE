workspace(name = "triggerPlugin")

load("//:bazlets.bzl", "load_bazlets")

load_bazlets(
    commit = "a511f3c90129d7de7ae67c0637001162980c08d5",
)

# Release Plugin API
load(
    "@com_googlesource_gerrit_bazlets//:gerrit_api.bzl",
    "gerrit_api",
)

# Load release Plugin API
gerrit_api()
