public class string_builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder(); // creates empty builder, capacity 16

		


		
		System.out.println("Before ensure capacity"+"method capacity"+str.capacity());
        str.ensureCapacity(18);
        System.out.println("after ensure capacity"+"method capacity="+str.capacity());


	}


}
    

