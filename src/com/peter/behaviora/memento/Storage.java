package com.peter.behaviora.memento;

import java.util.ArrayList;
import java.util.List;

public class Storage {

	List<Memento> memos = new ArrayList<Memento>();

	public void push(Memento memo) {

		if (memos != null) {
			memos.add(memo);
		}
	}

	public boolean isContainsOf(Memento memo) {

		if ((memos != null) && (memos.size() > 0)) {
			if (memos.contains(memo)) {
				return true;
			}
		}

		return false;
	}
	public Memento pull() {
		if ((memos != null) && (memos.size() > 0)) {
			Memento memo = memos.get(memos.size()-1);
			memos.remove(memo);
			return memo;
		}
		return null;
	}
}
