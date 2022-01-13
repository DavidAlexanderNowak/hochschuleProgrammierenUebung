package blatt10;

public class SysDirectory extends SysObjectBase {

	private static final String INDENT = "| - ";

	private SysObjectBase[] sysObjects;

	public SysDirectory(String name, SysObjectBase... sysObjects) {
		super(name);
		this.sysObjects = sysObjects;
	}

	/**
	 * Struktur des Verzeichnisses ermitteln
	 *
	 * @param indent Einrückung links (wird durch Rekursion verbreitert)
	 * @return Struktur des Verzeichnisses als String
	 */
	public String dirStructure(String indent) {
		String result = indent + this.toString() + "\n";
		for (SysObjectBase sysObject : sysObjects) {
			if (sysObject.isDirectory()) {
				result += ((SysDirectory) sysObject).dirStructure(indent + INDENT);
			} else {
				result += (indent + indent + sysObject.toString() + "\n");
			}
		}
		return result;
	}

	public SysObjectBase[] getSysObjects() {
		return sysObjects;
	}

	public void setSysObjects(SysObjectBase[] sysObjects) {
		this.sysObjects = sysObjects;
	}

	@Override
	protected boolean isDirectory() {
		return true;
	}

	/**
	 * toString method, that includes length of the field {@link #sysObjects}
	 */
	@Override
	public String toString() {
		return super.toString() + ", numberOfObjects=" + sysObjects.length;
	}

}
