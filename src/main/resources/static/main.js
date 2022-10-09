Gerrit.install(plugin => {
  const endpoint = 'repo-command';
  plugin.hook(endpoint).onAttached(element => {
    const el = element.appendChild(document.createElement('div'));
    el.textContent = 'Ah, there it is. Lovely.';
    el.style = 'background: pink; line-height: 4em; text-align: center;';
  });
});
//Gerrit.install(plugin => {
// const domHook = plugin.hook('settings-menu');
//  domHook.onAttached(c => {
//    var f = c.textfield();
//    var t = c.checkbox();
//    var b = c.button('Say hello', {onclick: function(){
//      c.call(
//        {message: f.value, french: t.checked},
//        function(r) {
//          c.hide();
//          window.alert(r);
//          c.refresh();
//        });
//    }});
//    c.popup(c.div(
//      c.prependLabel('Greeting message', f),
//      c.br(),
//      c.label(t, 'french'),
//      c.br(),
//      b));
//    f.focus();
//  });
//  function onSayHello(c) {
//  }
//  // self.on('revision', 'say-hello', onSayHello);
//});
