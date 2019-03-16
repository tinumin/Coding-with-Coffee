package CodingEveryDay;

import java.util.Random;

public class RandomQuotePrinting {

	public static void main(String[] args) {
		 String[] quote = {"Success consists of going from failure to failure without loss of enthusiasm. – Winston Churchill",
				"If you can DREAM it, you can DO it – Walt Disney",
				"A person who never made a mistake never tried anything new. – Albert Einstein",
				"Take risks: if you win, you will be happy; if you lose, you will be wise. – Author Unknown",
				"Never put off till tomorrow what you can do today. – Thomas Jefferson",
				"If you spend too much time thinking about a thing, you’ll never get it done. – Bruce Lee",
				"Getting fired is nature’s way of telling you that you had the wrong job in the first place. – Hal Lancaster"
		};
		
		Random random = new Random();
		int index = random.nextInt(quote.length);
		System.out.println(quote[index]);
		
	}

}
