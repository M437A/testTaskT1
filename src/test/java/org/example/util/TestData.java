package org.example.util;

import org.example.entity.Response;

import java.util.HashMap;
import java.util.Map;

public class TestData {

    public String emptyString = "";
    public Map<Character, Integer> emptyMap = new HashMap<>();
    public Response emptyResponse = new Response("");

    public String stringWithOneSymbol = "a";
    public Map<Character, Integer> stringWithOneSymbolMap = Map.of('a', 1);
    public Response stringWithOneSymbolResponse = new Response("a: 1");

    public String exampleString = "aaaaabcccc";
    public Map<Character, Integer> exampleMap = Map.of('a', 5, 'b', 1, 'c', 4);
    public Response exampleResponse = new Response("a: 5, c: 4, b: 1");
}
