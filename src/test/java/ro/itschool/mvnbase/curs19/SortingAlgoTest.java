package ro.itschool.mvnbase.curs19;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ro.itschool.mvnbase.curs19.sort.BubbleSort;
import ro.itschool.mvnbase.curs19.sort.SelectionSort;
import ro.itschool.mvnbase.curs19.sort.SortingAlgo;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortingAlgoTest {
    private SortingAlgo sortingAlgo;

   private static Stream<Arguments> sortAlgos(){
       return Stream.of(
               Arguments.of(new BubbleSort()),
               Arguments.of(new SelectionSort())
       );
   }


    @DisplayName("Simply array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void simpleArray(SortingAlgo sortingAlgo) {
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, sortingAlgo.sort(new int[]{3, 4, 2, 1})));
    }


    @DisplayName("Null array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void nullArray(SortingAlgo sortingAlgo) {
        assertTrue(Arrays.equals(null, sortingAlgo.sort(null)));
    }


    @DisplayName("Single element array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void singleElement(SortingAlgo sortingAlgo){
        assertTrue(Arrays.equals(new int[]{3},sortingAlgo.sort(new int[]{3})));
    }


    @DisplayName("Emty array")
    void EmtyArray(SortingAlgo sortingAlgo){
        assertTrue(Arrays.equals(new int[]{},sortingAlgo.sort(new int[]{})));
    }


    @DisplayName("Already sorted array")
    @MethodSource("sortAlgos")
    @ParameterizedTest
    void alreadySortArray(SortingAlgo sortingAlgo){
        assertTrue(Arrays.equals(new int[]{1,2,3,4,5},sortingAlgo.sort(new int[]{1,2,3,4,5})));
    }


}