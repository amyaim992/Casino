package com.sparcs.casino.game;

import java.util.ArrayList;
import java.util.List;

import com.sparcs.casino.Casino;
import com.sparcs.casino.Customer;

/**
 * The base implementation of a game within the {@link Casino}.
 * Subclass this to build your own game!
 * 
 * @author Lee Newfeld
 */
public abstract class GameImpl implements Game {

	private List<Customer> players;
	
	/**
	 * Constructor
	 */
    protected GameImpl() {

        players = new ArrayList<>();
    }

	@Override
	public List<Customer> getPlayers() {

		return players;
	}

	@Override
	public boolean isRunning() {

		return false;
	}

	/**
	 * Reset the game state to the point prior to game start
	 *  
	 * @param room
	 */
	protected abstract void onReset(RoomImpl room);

	/**
	 * Update the game state
	 *  
	 * @param room
	 * @return true if the game is running
	 */
	protected abstract boolean onUpdate(RoomImpl room);
}
