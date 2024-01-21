package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.converter.EntityConverter;
import org.example.entity.Request;
import org.example.entity.Response;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class T1TestTaskService {

    private final EntityConverter entityConverter;

    public Response count(final Request request) {
        final String input = request.input();
        final Map<Character, Integer> charMap = getCharatecrMap(input);
        return entityConverter.convertToResponseEntity(charMap);
    }

    private Map<Character, Integer> getCharatecrMap(final String input) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        return charMap;
    }
}
