package myjava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PeakBitrate {

	// track the total bit rate usage at each point in time and determine the max total bit rate
	
	// positive bitrateChange is the start of a stream (adding bit rate) 
	// negative bitrateChange is the end of a stream (subtracting bit rate)
	record Event(int timestamp, int bitrateChange) { }

	public static int findPeakTotalBitrate(List<int[]> streams) {
		
		List<Event> events = new ArrayList<>();

		// generate events for each stream
		for (int[] stream : streams) {
			
			var start = stream[0];
			var end = stream[1];
			var bitrate = stream[2];

			// add start and end events
			events.add(new Event(start, bitrate));
			events.add(new Event(end, -bitrate));
		}

		// sort events: First by times, then by bitrateChange (end events before start events)
		Collections.sort(events, (a, b) -> {
			if (a.timestamp == b.timestamp) {
				return Integer.compare(b.bitrateChange, a.bitrateChange); // end event before start event
			}
			return Integer.compare(a.timestamp, b.timestamp);
		});

		var maxBitrate = 0;
		var currentBitrate = 0;

		// process the events and track the max bit rate
		for (Event event : events) {
			currentBitrate += event.bitrateChange;
			maxBitrate = Math.max(maxBitrate, currentBitrate);
		}

		return maxBitrate;
	}

	public static void main(String... args) {
		
		// example stream log: {start, end, bit rate}
		List<int[]> streams = Arrays.asList(
			new int[] { 1, 4, 100 }, // stream 1 starts at 1, ends at 4, bit rate 100
			new int[] { 2, 5, 150 }, 
			new int[] { 3, 6, 200 }, 
			new int[] { 4, 7, 50 } 
		);

		var peakBitrate = findPeakTotalBitrate(streams);
		System.out.println("Peak Total Bitrate: " + peakBitrate);
	}
}
