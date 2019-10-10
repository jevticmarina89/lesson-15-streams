package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AlgorithmsUsingStreams {

	public static long countGoodEggs(List<String> eggs) {
		return eggs.stream()				// 1. create stream
		.filter(egg -> egg.equals("whole")) // 2. intermediate filter operation
		.count();							// 3. terminal operation: reduce to an int
	}

	public static Object findTallest(List<Double> peeps) {
//		return Collections.max(peeps);
		return peeps.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	}

	public static long addStringOfNumbers(String numbers) {
		return numbers
		 	.chars()		
		 	.mapToObj(c -> Character.toString(c))	
			.mapToInt(num -> Integer.parseInt(num))
			.sum();
	}
	
	public static long countPearls(List<Boolean> neklace) {
		return neklace.stream().filter(pearl -> pearl == true).count();

	}

	public static Object findLongestWord(List<String> wordsList) {
		return wordsList.stream().max(Comparator.comparingInt(String::length)).get();

	}

	public static List<Double> sortScores(List<Double> scores) {
		return scores.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

	}

	public static List<String> sortDNA(List<String> dna) {
		return dna.stream().sorted((d1, d2) -> d1.length() - d2.length()).collect(Collectors.toList());

	}

	public static List<String> sortWords(List<String> words) {
		return words.stream().sorted().collect(Collectors.toList());
	}

	public static Object getDistinctSpellsInAlphabeticalOrder(List<String> spells) {
		return spells.stream().distinct().sorted().collect(Collectors.toList());

	}

	public static List<String> getBatPhrases(String[] batman) {
		List<String> listOfBatPhrases = Arrays.asList(batman);
		return listOfBatPhrases.stream().map(s -> s.replace(" ", ""))
				.filter(x -> x.equalsIgnoreCase("bam") || x.equalsIgnoreCase("pow")).map(String::toUpperCase)
				.collect(Collectors.toList());
	}


	public static long countXs(String xString) {
		return xString.chars().filter(x -> x == 'x').count();

	}

	public static Integer addEven(String str) {
		return str.chars().mapToObj(ch -> Character.toString(ch)).mapToInt(i -> Integer.parseInt(i))
				.filter(i -> i % 2 == 0).sum();

	}

	public static Double getAverage(int[] nums) {
		return Arrays.stream(nums).average().getAsDouble();

	}

	public static long countOccurrences(String[] stringArr, String s) {
		return Arrays.stream(stringArr).filter(w -> w.equalsIgnoreCase(s)).count();

	}

}



