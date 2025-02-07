package myjava.enums;

import java.util.EnumMap;
import java.util.Iterator;

public class EnumMapExample {

	public enum STATE {
		NEW, RUNNING, WAITING, FINISHED;
	}

	public static void main(String args[]) {
		EnumMap<STATE, String> stateMap = new EnumMap<STATE, String>(STATE.class);

		stateMap.put(STATE.RUNNING, "Program is running.");
		stateMap.put(STATE.WAITING, "Program is waiting.");
		stateMap.put(STATE.NEW, "Program is created.");
		stateMap.put(STATE.FINISHED, "Program has finished.");

		System.out.println("EnumMap size: " + stateMap.size());
		System.out.println("EnumMap: " + stateMap);

		Iterator<STATE> enumKeySet = stateMap.keySet().iterator();
		
		while (enumKeySet.hasNext()) {
			STATE currentState = enumKeySet.next();
			System.out.println("Key: " + currentState + " Value: " + stateMap.get(currentState));
		}

		System.out.println("Does stateMap have " + STATE.NEW + "? " + stateMap.containsKey(STATE.NEW));
	}
}
