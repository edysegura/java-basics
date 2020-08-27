package br.edysegura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class App {

  public static void main(String[] args) throws JsonProcessingException {
    List<User> list = new ArrayList<>();
    list.add(new User("1", "edysegura", "edysegura@domain.com"));
    list.add(new User("2", "infoedy", "infoedy@domain.com"));

    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(list);

    System.out.println(json);
  }
}
