package br.edu.reactive;

import io.reactivex.rxjava3.core.Flowable;

public class App {
  public static void main(String[] args) {
    String[] list = { "Davi", "Lidy", "Edy", "Douglas" };

    Flowable<String> flow = Flowable.fromArray(list);

    flow
      .map(name -> name.toUpperCase())
      .sorted()
      .subscribe(System.out::println);
  }
}
