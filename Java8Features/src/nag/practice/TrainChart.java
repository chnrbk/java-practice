package nag.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.*;;

public class TrainChart {
	
	private static final int  totalSeats=36;
	private static final int  seatsPerCar=6;
	public static void main(String[] args) {
		int seatNumber =32;
	Map<Integer,Integer> pair =	populateSeatMap(totalSeats,false);
	System.out.println(pair);
	Map<Integer,Integer> reversePair =populateSeatMap(totalSeats,true);
	System.out.println(reversePair);
	int oppositeSeatNumber = getSeatDetails(seatNumber,pair,reversePair);
		System.out.println(oppositeSeatNumber);

	}

	private static Map<Integer, Integer> populateSeatMap(int totalSeats2, boolean isReverseOrder) {
		HashMap pair= new HashMap<>();
		
		if(isReverseOrder){
			IntStream.rangeClosed(1, totalSeats2).forEach(n->{
				pair.put(n+seatsPerCar+100, n);
			});
		}
		else{
		IntStream.rangeClosed(1, totalSeats2).forEach(n->{
			pair.put(n, n+seatsPerCar);
		});
		}
		
		return pair;
	}

	private static int getSeatDetails(int seatNumber, Map<Integer, Integer> pair, Map<Integer, Integer> reversePair) {
		
		return pair.get(seatNumber)==null?reversePair.get(seatNumber+100):pair.get(seatNumber);
							
	}
	
	/*
	 * 	int[][] board = new int[3][6];
		int k = 6;
		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < 6; j++) {

				board[i][j] = i+6;
				//System.out.println(v);
			}
		}
		System.out.println(board);
		System.out.println("board:"+Arrays.deepToString(board));
		
		int[][] board1 = IntStream.range(0, 3).mapToObj(i -> IntStream.range(i, 3).map(j -> i*3 ).toArray()).toArray(int[][]::new);
		System.out.println(Arrays.deepToString(board1));
	 */

}
