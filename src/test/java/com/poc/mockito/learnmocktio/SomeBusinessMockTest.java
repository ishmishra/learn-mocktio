package com.poc.mockito.learnmocktio;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    public void testFindTheGreatestFromAllData() {
        //DataService dataServiceMock = Mockito.mock(DataService.class);
        //dataServiceMock.retrieveAllData()=> new int[]{25,15,2};

        Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24, 15, 5});
        //SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        int result = businessImpl.findGreatestFromAllData();
        Assert.assertEquals(3431, result);

    }


}
