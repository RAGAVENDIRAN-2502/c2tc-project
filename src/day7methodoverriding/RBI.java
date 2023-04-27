package day7methodoverriding;

public class RBI {

	public float getRateOfIntrest() {
		return 6.7f;
	}
}
class SBI extends RBI{
	@Override
	public float getRateOfIntrest() {
		return 7.0f;
	}
}
class HDFC extends RBI{
	public float getRateOfIntrest() {
		return 6.3f;
	}
}
class ICICI extends RBI{
	public float getRateOfIntrest() {
		return 7.2f;
	}

}
