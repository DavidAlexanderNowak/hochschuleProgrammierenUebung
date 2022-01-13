package blatt10;

public class SysTextFile extends SysObjectBase {

	private String type;
	private String text;

	public SysTextFile(String name, String type) {
		super(name);
		this.type = type;
	}

	@Override
	protected boolean isDirectory() {
		return false;
	}

	public String getType() {
		return type;
	}

	public String getText() {
		return text;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setText(String text) {
		this.text = text;
	}

	/**
	 * toString method, that includes length of the field {@link #text} and prints
	 * '0' for it when {@link #text} is null
	 */
	@Override
	public String toString() {
		int textLength = 0;
		if (text != null) {// could have been in a getLength() method (also for sysDir)
			textLength = text.length();
		}
		return super.toString() + ", type=" + type + ", length=" + textLength;
	}

}
