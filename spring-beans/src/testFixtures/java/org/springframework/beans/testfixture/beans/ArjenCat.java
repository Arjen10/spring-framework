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

	private ArjenCat cat;

	public ArjenCat() {
	}

	public ArjenCat(String catName, String catColor, List<Integer> testSub, ArjenCat cat) {
		this.catName = catName;
		this.catColor = catColor;
		this.testSub = testSub;
		this.cat = cat;
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

	public List<Integer> getTestSub() {
		return testSub;
	}

	public void setTestSub(List<Integer> testSub) {
		this.testSub = testSub;
	}

	public ArjenCat getCat() {
		return cat;
	}

	public void setCat(ArjenCat cat) {
		this.cat = cat;
	}

	@Override
	public String toString() {
		return "ArjenCat{" +
				"catName='" + catName + '\'' +
				", catColor='" + catColor + '\'' +
				", testSub=" + testSub +
				", cat=" + cat +
				'}';
	}
}
