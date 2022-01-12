package blatt10;

public class SysTextFile extends SysObjectBase {

	private String type;
	private String text;

	public SysTextFile(String name, String type) {
		super(name);
		this.type = type;
	}

	@Override
	public boolean isDirectory() {
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
		if (text != null) {
			textLength = text.length();
		}
		return "Class=SysTextFile, type=" + type + ", name=" + name + ", user=" + owner + ", length=" + textLength;
	}

}
