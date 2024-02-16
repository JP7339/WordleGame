public class WordleLetter {



	private char letter;
	private String color;

	public WordleLetter(char letter){
		this.letter = letter;
	}

	public void setColor(String color){
		this.color = color;
	}


	public boolean isColorSet() {
		if(this.color == null){
			return false;
		}
		return true;
	}

	public boolean isGreen(){
		if(this.color == null){
			return false;
		}else if(this.color.equals("green")){
			return true;
		}	
		return false;
	}

	public String toString() {
		String colorCode;
		if(this.color.equals("green")) {
			colorCode = "\u001B[32m";
		} else if(this.color.equals("yellow")) {
			colorCode = "\u001B[33m";
		} else {
			colorCode = "\u001B[31m";
		}
	
		
		String resetCode = "\u001B[0m";
	
		return String.format(
			"%s %s %s",
			colorCode, letter, resetCode);
	}
}
