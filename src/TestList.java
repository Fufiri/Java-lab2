import myutil.*;

public class TestList {
	
	
	public static void main(String[] args) {
				
		
		MyList<String> list = new MyList<>();
		MyList<Integer> intList = new MyList<>();
		MyList<Double> dList = new MyList<>();
		
		
	
		list.add("katt");
		list.getSize();
		System.out.println(list.getSize());
		System.out.println(" ");

		list.add("get");
		System.out.println(list.getSize());
		System.out.println(" ");
		
		list.add("kyckling");
		list.getSize();
		System.out.println(list.getSize());
		System.out.println(" ");
		
		
		intList.add(1);
		
		dList.add(22.45);
		
		getElement(list, -3);
		getElement(list, 2);
		getElement(list, 10);
		//getElement(intList, 0);
		
		
		
		}


	private static <E> void getElement(MyList<E> testList, int index) {
		{ try {
			System.out.println(testList.getElementAt(index)); 
		}
		catch (IntArrayOutofBoundsError e) {
			System.out.println(e);
		}
		}
		
	}
	}


