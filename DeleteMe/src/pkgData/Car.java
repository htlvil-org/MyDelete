package pkgData;

import java.io.Serializable;

public class Car implements Serializable {

	/**
	 * asdfadf
	 */
	private static final long serialVersionUID = 1L;

	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
