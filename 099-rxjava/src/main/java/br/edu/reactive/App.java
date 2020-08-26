package br.edu.reactive;

import java.util.Arrays;
import java.util.List;

import io.reactivex.rxjava3.core.Flowable;

public class App {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Davi", "Lidy", "Edy", "Douglas");

    Flowable
      .fromArray(list)
      .subscribe(System.out::println);
  }
}
