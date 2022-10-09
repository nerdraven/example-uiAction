// Copyright (C) 2013 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.googlesource.gerrit.plugins.examples.topmenu;

import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;
import com.google.gerrit.extensions.restapi.Response;
import com.google.gerrit.extensions.restapi.RestModifyView;
import com.google.gerrit.extensions.webui.UiAction;
import com.google.gerrit.server.CurrentUser;
import com.google.gerrit.server.IdentifiedUser;
import com.google.gerrit.server.change.ChangeResource;
import com.google.inject.Inject;
import com.google.inject.Provider;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

class HelloRevisionAction implements UiAction<ChangeResource>,
    RestModifyView<ChangeResource, HelloRevisionAction.Input> {

  private Provider<CurrentUser> user;
  static class Input {
    boolean french;
    String message;
  }

  @Inject
  HelloRevisionAction(Provider<CurrentUser> user) {
    this.user = user;
  }

  @Override
  public Response<String> apply(ChangeResource change, Input input) {
    final String greeting = input.french ? "Bonjour" : "Hello";
    
//    String res = String.format("%s %s from change %s, patch set %d!",
//        greeting,
//        Strings.isNullOrEmpty(input.message)
//            ? MoreObjects.firstNonNull(user.get().getUserName(), "world")
//            : input.message,
//        change().getId().toString(),
   return Response.ok("Hello");
  }

  @Override
  public Description getDescription(ChangeResource resource) {
    return new Description()
        .setLabel("Say hello")
        .setTitle("Say hello in different languages")
    	.setVisible(true);
  }
}
