package katas;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClosestToZeroFinderTest {
  @Test
  public void givenAListWithOneAndTwo_ReturnsOne() throws Exception {
    //Arrange
    ClosestToZeroFinder underTest = new ClosestToZeroFinder();
    List<Integer> testData = Arrays.asList(1,2);
    //Act
    int result = underTest.findClosestToZero(testData);
    //Assert
    assertEquals(1, result);

    //Try this out!  Look up AssertJ for a new way to write assertions! If this scares you stick to the assert as above.
    assertThat(result).isEqualTo(1);
  }
  @Test
  public void givenMoreThanTwoPositiveNumbers_ReturnLowest() {
	  ClosestToZeroFinder undertest = new ClosestToZeroFinder();
	  List<Integer> testData = Arrays.asList(4, 6, 5, 2, 9, 35);
	  
	  int result = undertest.findClosestToZero(testData);
	  
	  assertThat(result).isEqualTo(2);
  }
  @Test
  public void givenPositiveAndNegativeNumbers_ReturnClosestToZero() {
	  ClosestToZeroFinder undertest = new ClosestToZeroFinder();
	  List<Integer> testData = Arrays.asList(-4, 6, 5, -9, 35);

	  int result = undertest.findClosestToZero(testData);
	  
	  assertThat(result).isEqualTo(-4);
  }
  @Test
  public void givenPositiveAndNegativeNumberAreSameDistance_ReturnPositive() {
	  ClosestToZeroFinder undertest = new ClosestToZeroFinder();
	  List<Integer> testData = Arrays.asList(-4, 6, 5, -9, 35, 4);

	  int result = undertest.findClosestToZero(testData);
	  
	  assertThat(result).isEqualTo(4);
  }
  @Test
  public void givenListContainsZero() {
	  ClosestToZeroFinder undertest = new ClosestToZeroFinder();
	  List<Integer> testData = Arrays.asList(-4, 6, 5, -9, 35, 0);

	  int result = undertest.findClosestToZero(testData);
	  
	  assertThat(result).isEqualTo(0);
  }
}
