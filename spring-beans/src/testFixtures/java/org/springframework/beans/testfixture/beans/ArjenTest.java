package org.springframework.beans.testfixture.beans;


/**
 * @author Arjen10
 * @date 2022/10/13 0:15
 */
public class ArjenTest {

	private String name;

	private Integer age;

	public ArjenTest() {
	}

	public ArjenTest(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ArjenTest{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
