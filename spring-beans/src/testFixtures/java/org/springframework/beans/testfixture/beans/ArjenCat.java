package org.springframework.beans.testfixture.beans;


import java.util.List;

/**
 * @author Arjen10
 * @date 2022/10/19 21:57
 */
public class ArjenCat {

	private String catName;

	private String catColor;

	private List<Integer> testSub;

	public ArjenCat() {
	}

	public ArjenCat(String catName, String catColor, List<Integer> testSub) {
		this.catName = catName;
		this.catColor = catColor;
		this.testSub = testSub;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatColor() {
		return catColor;
	}

	public void setCatColor(String catColor) {
		this.catColor = catColor;
	}

	@Override
	public String toString() {
		return "ArjenCat{" +
				"catName='" + catName + '\'' +
				", catColor='" + catColor + '\'' +
				'}';
	}

}
