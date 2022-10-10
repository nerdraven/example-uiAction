Gerrit.install(self => {
  let key = null;

  self.on('showchange', params => {
    if (key === null) {
      const changeActions = self.changeActions();
      key = changeActions.add("revision", "Trigger CI");
      changeActions.addTapListener(key, () => {
        showMessage("Hello World");
      })
    }
  })
});


const showMessage = (message) => {
  const el = document.createElement("gr-alert");
  el.toast = true;
  el.showDismiss = true;
  el.show(message);

}