package com.toddfast.mutagen;

/**
 *
 * 
 * @author Todd Fast
 */
public interface Subject<I extends Comparable<I>> {

	/**
	 *
	 *
	 */
	public State<I> getCurrentState();


	/**
	 *
	 *
	 */
	public boolean accept(State<I> state);
}