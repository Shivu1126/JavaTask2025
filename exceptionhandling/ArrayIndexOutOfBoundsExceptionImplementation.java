package exceptionhandling;

class IndexOutOfBoundException extends Exception{
	IndexOutOfBoundException(String message) {
		super(message);
	}
}

public class ArrayIndexOutOfBoundsExceptionImplementation {

	public static void main(String[] args) {
		ArrayIndexOutOfBoundsExceptionImplementation boundObj = 
				new ArrayIndexOutOfBoundsExceptionImplementation();
		
		int arr[] = {1,2,3,24,22,4,5,6,6,7,8};
		int index = -1;
		try {
			System.out.println("Index "+index+" = "+boundObj.getValue(index, arr));
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getValue(int index, int arr[]) throws IndexOutOfBoundException{	
//		try {
			if(!isValidIndex(index, arr.length)){
				return arr[index];
			}
			else {
				throw new IndexOutOfBoundException("Index "+index+" out of bounds for length "+arr.length);
			}
//		}
//		catch (IndexOutOfBoundException e) {
//			System.out.println(e.getMessage());
//		}
	}
	public boolean isValidIndex(int index, int size) {
		return index < 0 || index>=size; 
	}
}