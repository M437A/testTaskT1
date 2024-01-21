package org.example.converter;

import org.example.util.TestData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EntityConverterTest {

    private TestData testData = new TestData();
    private EntityConverter entityConverter = new EntityConverter();

    @Test
    void testConvertToResponseEntity() {
        assertEquals(testData.emptyResponse, entityConverter.convertToResponseEntity(testData.emptyMap));
        assertEquals(testData.stringWithOneSymbolResponse, entityConverter.convertToResponseEntity(testData.stringWithOneSymbolMap));
        assertEquals(testData.exampleResponse, entityConverter.convertToResponseEntity(testData.exampleMap));
    }
}