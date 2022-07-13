package ch15;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		
		return shelf.remove(0); //맨 앞에꺼 꺼내면서 제거
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
