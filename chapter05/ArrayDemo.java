class ArrayDemo{
	public static void main(String[] args){
		int sample[] = new int [10];
		int i;
		for (i = 1;  i < 10; i++) sample[i] = i;
		for (int num: sample)
			System.out.println("This is sample[" + num + "]: "
			+ sample[num]);
	}
}