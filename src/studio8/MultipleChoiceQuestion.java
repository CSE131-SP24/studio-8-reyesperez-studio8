package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private String[] choices;

	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
		
		//Call the super class constructor, then create and set
		 super(prompt, answer, points);
		
		//instance variables for any values that aren't handled
		this.choices = choices;
		
		//by the base class
		
	}
	
	public void displayPrompt() {
		//FIXME
	super.displayPrompt();
		/*
		 * Use the method from the base class to display the prompt,
		 * Then write more code to display all of the choices like so:
		 * 
		 * 1. Choice1
		 * 2. Choice2
		 * 3. Choice3
		 * ...
		 * N. ChoiceN
		 */
		//
	for( int i = 0; i<choices.length; i++) {
		System.out.println( i+1 + ". "+ choices[i]);
	}
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
