
package dev.yungwarlock.gerrit.trigger;

import com.google.inject.servlet.ServletModule;
import com.google.gerrit.extensions.webui.WebUiPlugin;
import com.google.gerrit.extensions.webui.JavaScriptPlugin;
import com.google.gerrit.extensions.registration.DynamicSet;

public class HttpModule extends ServletModule {
  @Override
  protected void configureServlets() {
    DynamicSet.bind(binder(), WebUiPlugin.class)
        .toInstance(new JavaScriptPlugin("main.js"));
  }
}
