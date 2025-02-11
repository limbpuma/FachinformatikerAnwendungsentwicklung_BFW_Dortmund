package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel40_U3
{
	public static void main(String[] args) throws IOException
	{

		System.out.println("Wochetag!!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String input;
		int note;

		System.out.println("Geben Sie die Ziffer eines Wochentages an: ");
		input = scan.readLine();
		note = Integer.parseInt(input);

		switch (note) {
		case 0:
			System.out.println("Sonntag");
			break;
		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3:
			System.out.println("Mittwoch");
			break;
		case 4:
			System.out.println("Donnerstag");
			break;
		case 5:
			System.out.println("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		default:
			System.out.println("Geben Sie die Ziffer eines Wochentages an zwischen '1 und 6'");
		}
	}
}
