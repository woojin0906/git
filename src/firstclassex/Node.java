package firstclassex;

public class Node <E>{
//	String data;
//	Node link;
//	
//	public Node(String data, Node link) {
//		super();
//		this.data = data;
//		this.link = link;
//	}
//
//	public String getData() {
//		return data;
//	}
//
//	public void setData(String data) {
//		this.data = data;
//	}
//
//	public Node getLink() {
//		return link;
//	}
//
//	public void setLink(Node link) {
//		this.link = link;
//	}
//	

	private E data;
	private Node<E> link;
	public Node(E newData, Node<E> n) {
		data = newData;
		link = n;
	}
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node<E> getLink() {
		return link;
	}
	public void setLink(Node<E> link) {
		this.link = link;
	}
	
	
	
}
