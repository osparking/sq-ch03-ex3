package entity;

import lombok.Data;

@Data
public class Parrot {
	private String name;

	@Override
	public String toString() {
		return "Parrot [name=" + name + "]";
	}
	
}
