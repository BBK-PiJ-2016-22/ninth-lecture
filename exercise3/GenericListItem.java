public class GenericListItem<T>{
	
	T item;
	GenericListItem<T> nextItem;
	GenericListItem<T> previousItem;
	
	
	public GenericListItem(T item){
		this.item = item;
	}
	
	public T getItem(){
		return item;
	}
	
	public GenericListItem<T> getNextItem(){
		return nextItem;
	}

	public GenericListItem<T> getPreviousItem(){
		return previousItem;
	}



}