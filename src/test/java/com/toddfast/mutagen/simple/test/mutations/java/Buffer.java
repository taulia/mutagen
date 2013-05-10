package com.toddfast.mutagen.simple.test.mutations.java;

import com.toddfast.mutagen.State;
import com.toddfast.mutagen.Subject;
import com.toddfast.mutagen.simple.SimpleState;

/**
 *
 * @author Todd Fast
 */
public class Buffer implements Subject<String> {

	public Buffer(String state) {
		super();
		this.state=new SimpleState<String>(state);
	}

	@Override
	public State<String> getCurrentState() {
		return state;
	}

	@Override
	public boolean accept(State<String> state) {

		boolean result=state.compareTo(getCurrentState()) > 0;

		if (result) {
			System.out.println("Accepting state "+state);
		}
		else {
			System.out.println("Rejecting state "+state);
		}

		return result;
	}


	public void append(String value) {
		state=new SimpleState<String>(state.getID()+value);
	}

	private State<String> state;
}