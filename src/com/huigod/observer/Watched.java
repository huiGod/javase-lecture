package com.huigod.observer;

public interface Watched {

  void addWatcher(Watcher watcher);

  void removeWatcher(Watcher watcher);

  void notifyWatchers(String string);

}
