package GenericsMax;

public class FloatMax {

	public static Float FindMaxNumber(Float inputOne, Float inputTwo, Float inputThree) {
		if (inputOne.compareTo(inputTwo) > 0 && inputOne.compareTo(inputThree) > 0) {
			return inputOne;
		} else if (inputTwo.compareTo(inputOne) > 0 && inputTwo.compareTo(inputThree) > 0) {
			return inputTwo;
		} else {
			return inputThree;
		}
	}
}
