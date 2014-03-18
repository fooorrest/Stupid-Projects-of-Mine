class fibonacci
{
	public static void main(String args[])
	{
		int[] fibonacci;
		fibonacci = new int[20];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		fibonacci[2] = 2;
		fibonacci[3] = 3;
		fibonacci[4] = 5;
		fibonacci[5] = 8;
		fibonacci[6] = 13;
		fibonacci[7] = 21;
		fibonacci[8] = 34;
		fibonacci[9] = 55;
		fibonacci[10] = 89;
		fibonacci[11] = 144;
		fibonacci[12] = 233;
		fibonacci[13] = 337;
		fibonacci[14] = 610;
		fibonacci[15] = 987;
		fibonacci[16] = 1597;
		fibonacci[17] = 2584;
		fibonacci[18] = 4181;
		fibonacci[19] = 6765;
		//To find the Fibonacci number, make sure you subtract one for the number you want. 
		// ex) if you wanted to find 20th number, use 19. 
		System.out.println("The Fibonacci number in that number in the squence is... " + fibonacci[x]);
	}
}
