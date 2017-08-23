package com.huigod.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWatched implements Watched {

  private List<Watcher> list = new ArrayList<>();

  @Override
  public void addWatcher(Watcher watcher) {
    list.add(watcher);
  }

  @Override
  public void removeWatcher(Watcher watcher) {
    list.remove(watcher);
  }

  @Override
  public void notifyWatchers(String str) {
    list.forEach(item -> item.update(str));
  }
}
