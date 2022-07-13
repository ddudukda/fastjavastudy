package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer desktop = new DeskTop();
		NoteBook notebook = new MyNoteBook();
		
		desktop.display();
		desktop.turnOn();
		
		notebook.typing();
	}

}
