package org.example.array.sort;

import org.example.array.search.LinearSearch;
import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {

    @Test
    public void testSearch(){
        LinearSearch ls = new LinearSearch();
        int arr[] = {12, 34, 45, 11, 33, 3, 1};
        int index = ls.linearSearch(arr, 34);
        Assert.assertEquals(1, index);
    }
}
