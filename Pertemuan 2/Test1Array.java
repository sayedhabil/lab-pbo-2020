public class Test1Array{

	public static void main(String[] args) {
		int  nilai[] = new int[3];
		nilai[0] = 70;
		nilai[1] = 80;
		nilai[2] = 65;
		double ratarata = 0.0;

		for(int i=0; i<nilai.length; i++)
			ratarata+=nilai[i];

		ratarata/=nilai.length;
		System.out.println("Nilai rata-rata = " +ratarata);
	}
}

/*
Kode di atas digunakan untuk menghasilkan output brupa rata-rata dari array nilai.
yang rata-ratanya bertipe double
*/