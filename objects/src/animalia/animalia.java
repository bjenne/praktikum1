package animalia;

public class animalia {

	private boolean isVertebrate;

	public animalia(boolean isVertebrate) {
		this.isVertebrate = isVertebrate;

	}

	@Override
	public String toString() {

		if (isVertebrate == true) {
			return "is vertebrate";
		} else
			return "is not vertebrate";
	}

}
