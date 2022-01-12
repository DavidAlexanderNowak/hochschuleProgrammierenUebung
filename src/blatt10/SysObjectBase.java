package blatt10;

public abstract class SysObjectBase {

	protected String name;
	protected String owner;

	/**
	 * 
	 * @param name name of the resource
	 */
	public SysObjectBase(String name) {
		this.name = name;
		owner = System.getenv("USERNAME");
	}

	/**
	 * Method to differentiate subclasses easily
	 */
	public abstract boolean isDirectory();
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Class=SysObjectBase, name=" + name + ", user=" + owner;
	};

}
