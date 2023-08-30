package entity;

import lombok.Data;

@Data
public class Person {
	private String name;
	private Parrot parrot;
	@Override
	public String toString() {
		return "Person [name=" + name + ", parrot=" + parrot + "]";
	}
	
}
