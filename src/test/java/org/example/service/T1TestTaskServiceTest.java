package org.example.service;

import org.example.converter.EntityConverter;
import org.example.entity.Request;
import org.example.util.TestData;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class T1TestTaskServiceTest {

    @InjectMocks
    private T1TestTaskService t1TestTaskService;

    @Mock
    private EntityConverter entityConverter;

    private TestData testData = new TestData();

    @Test
    public void countEmptyString() {
        when(entityConverter.convertToResponseEntity(testData.emptyMap)).thenReturn(testData.emptyResponse);
        assertEquals(testData.emptyResponse, t1TestTaskService.count(new Request(testData.emptyString)));
        verify(entityConverter).convertToResponseEntity(testData.emptyMap);
    }

    @Test
    public void countStringWithOneSymbol() {
        when(entityConverter.convertToResponseEntity(testData.stringWithOneSymbolMap)).thenReturn(testData.stringWithOneSymbolResponse);
        assertEquals(testData.stringWithOneSymbolResponse, t1TestTaskService.count(new Request(testData.stringWithOneSymbol)));
    }

    @Test
    public void countExampleString() {
        when(entityConverter.convertToResponseEntity(testData.exampleMap)).thenReturn(testData.exampleResponse);
        assertEquals(testData.exampleResponse, t1TestTaskService.count(new Request(testData.exampleString)));
        verify(entityConverter).convertToResponseEntity(testData.exampleMap);
    }
}