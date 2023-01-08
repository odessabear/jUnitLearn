package intermediate.lecture_11_BlackBoxWhiteBox;

public class WhiteBox {

	static int func(int arg) {
		int result = arg % 2 == 0 ? arg/2 : arg;
		return result;
	}
}
