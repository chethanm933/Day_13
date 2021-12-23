package GenericsMax;

public class IntMax {

	public static int FindMaxNumber(Integer firstNum, Integer secondNum, Integer thirdNum) {
		if (firstNum.compareTo(secondNum) > 0 && firstNum.compareTo(thirdNum) > 0) {
			return firstNum;
		} else if (secondNum.compareTo(firstNum) > 0 && secondNum.compareTo(thirdNum) > 0) {
			return secondNum;
		} else {
			return thirdNum;
		}
	}
}
