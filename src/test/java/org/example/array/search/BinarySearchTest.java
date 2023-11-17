package org.example.array.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void test1(){
        BinarySearch bs = new BinarySearch();
        int arr[] = {1, 34, 45, 111, 331, 3111, 11112};
        int index = bs.search(arr, 34);
        Assert.assertEquals(1, index);
    }

    @Test
    public void test2(){
        BinarySearch bs = new BinarySearch();
        int arr[] = {1, 34, 45, 111, 331, 3111, 11112};
        int index = bs.search(arr, 112);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void test3(){
        BinarySearch bs = new BinarySearch();
        int arr[] = {1, 34, 45, 111, 331, 3111, 11112};
        int index = bs.search(arr, 332);
        Assert.assertEquals(-1, index);
    }
}
