package org.example.converter;

import org.example.entity.Response;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EntityConverter {

    public Response convertToResponseEntity(final Map<Character, Integer> input) {
        StringBuilder sb = new StringBuilder();

        if (!input.isEmpty()) {
            input.entrySet().stream()
                    .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                    .forEach(entry -> sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(", "));

            sb.delete(sb.length() - 2, sb.length());
        }

        return new Response(sb.toString());
    }
}
