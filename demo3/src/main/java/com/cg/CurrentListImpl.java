package com.cg;

import java.util.ArrayList;

public class CurrentListImpl implements CurrencyList {
	
	private ArrayList<String> currList;

	public ArrayList<String> getCurrList() {
		
		return currList;
	}

	public void setCurrList(ArrayList<String> currList) {
		this.currList = currList;
	}

}
