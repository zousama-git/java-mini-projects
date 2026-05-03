import java.util.Scanner;

public class QuizzGame{
	
	static int score, guess = 0;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		String questions[] = {
			"A. What is the main function of a router?", 
			"B. Which part of the computer is considered the brain?",
			"C. What year was facebook launched?",
			"D. Who is known as the father of computers?",
			"E. What was the first programming language?",
			"F. What does CPU stand for?",
			"G. Which device is used to input text?",
			"H. What does RAM stand for?",
			"I. Which company developed Windows?",
			"J. What is the main function of an operating system?",
			"K. Which of these is a programming language?",
			"L. What does HTML stand for?",
			"M. Which device displays output?",
			"N. What is the brain of the computer?",
			"O. Which storage is non-volatile?",
			"P. What does USB stand for?",
			"Q. Which one is an input device?",
			"R. What is used to browse the internet?",
			"S. Which company created the iPhone?",
			"T. What does GPU stand for?"
		};

		String options[][] = {
			{"1. Storing files", "2. Encrypting data","3. Directing internet traffic","4. Managing passwords"},
			{"1. CPU", "2. SSD","3. RAM","4. GPU"},
			{"1. 2000", "2. 2004","3. 2006","4. 2010"},
			{"1. Steve Jobs", "2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
			{"1. COBOL", "2. C","3. Fortran","4. Assembly"},
			{"1. Central Process Unit", "2. Central Processing Unit", "3. Computer Personal Unit", "4. Central Power Unit"},
			{"1. Monitor", "2. Keyboard", "3. Printer", "4. Speaker"},
			{"1. Read Access Memory", "2. Random Access Memory", "3. Run Access Memory", "4. Real Access Memory"},
			{"1. Apple", "2. Google", "3. Microsoft", "4. IBM"},
			{"1. Manage hardware and software", "2. Play games", "3. Browse internet", "4. Create documents"},
			{"1. Python", "2. HTML", "3. HTTP", "4. URL"},
			{"1. Hyperlinks and Text Markup Language", "2. Hyper Text Markup Language", "3. Home Tool Markup Language", "4. Hyper Tool Multi Language"},
			{"1. Keyboard", "2. Mouse", "3. Monitor", "4. Scanner"},
			{"1. RAM", "2. CPU", "3. SSD", "4. GPU"},
			{"1. RAM", "2. Cache", "3. ROM", "4. Register"},
			{"1. Universal Serial Bus", "2. United System Bus", "3. Universal System Backup", "4. Unique Serial Bus"},
			{"1. Monitor", "2. Printer", "3. Mouse", "4. Speaker"},
			{"1. Browser", "2. Compiler", "3. Editor", "4. OS"},
			{"1. Samsung", "2. Apple", "3. Microsoft", "4. Nokia"},
			{"1. General Processing Unit", "2. Graphics Processing Unit", "3. Global Processing Unit", "4. Graphic Performance Unit"}
		};

		int answers[] = {
			3,1,2,4,4,2, 2, 2, 3,1,1,2,3,2, 3, 1, 3, 1, 2, 2 
		};
		
		System.out.println("******************************");
		System.out.println("Welcome to the Java Quiz Game");
		System.out.println("******************************");
		
		
		for (int i = 0; i<questions.length;i++){
			System.out.println(questions[i]);
				for (int k = 0; k<options[i].length;k++){
					System.out.println(options[i][k]);
			}
			
			getAnswer();
		
			if (guess == answers[i]){
				correctMessage(); score+=1;
				} else wrongMessage();
		}
		
		scoreMessage();
	}
	
	static void correctMessage(){
		System.out.println("********");
		System.out.println("CORRECT!");
		System.out.println("********");
	}
	
	static void wrongMessage(){
		System.out.println("******");
		System.out.println("WRONG!");
		System.out.println("******");
	}
	
	static void scoreMessage(){
		System.out.println("");
		System.out.printf("Your final score is: %d out of 20", score);
		Scanner input = new Scanner(System.in);
		input.close();
		System.exit(0);
	}	
	
	static void getAnswer(){
		System.out.print("Your guess: ");
		guess = input.nextInt();
		input.nextLine();
		System.out.println("");
	}
}