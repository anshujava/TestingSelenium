package SelenieumProject;

public class LevenshteinDistance
{
	public static int levenshteinDistance(
		CharSequence string1, CharSequence string2)
	{
//		System.out.println("string1="+string1);
//		System.out.println("string2"+string2);
		final int length1 = string1.length();
		final int length2 = string2.length();
		int[][] distance = new int[length1 + 1][length2 + 1];

		for (int i=0; i<=length1; i++)
		{
			distance[i][0] = i;
		}
		for (int j = 0; j <= length2; j++)
		{
			distance[0][j] = j;
		}
		
		for (int i = 1; i <= length1; i++)
		{
			for (int j = 1; j <= length2; j++)
			{
				final char char1 = string1.charAt(i - 1);
				final char char2 = string2.charAt(j - 1);
				final int offset = (char1 == char2) ? 0 : 1;
				distance[i][j] = Math.min(Math.min(
				        distance[i - 1][j] + 1,
				        distance[i][j - 1] + 1),
				        distance[i - 1][j - 1] + offset);
			}
		}
		return distance[length1][length2];
	}
}
