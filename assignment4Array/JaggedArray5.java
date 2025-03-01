package assignment4Array;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter the number of rows : ");
			int n = scanner.nextInt();
			double[][] weightPersons = new double[n][]; 
			int option ;
			do {
				System.out.println("1 .Add Weight ");
				System.out.println("2 .Get Minimum Weight ");
				System.out.print("Enter the option : ");
				option =scanner.nextInt();
				switch(option) {
				case 1:
					System.out.print("Enter row : ");
					int row = scanner.nextInt();
					System.out.print("Enter the new weight : ");
					double weight = scanner.nextDouble();
					if(row >= n)
							System.out.println("Wrong row");
					else {
						weightPersons[row]=addWeight(weightPersons[row],weight);
						System.out.println("New Weight added successfully : "+Arrays.toString(weightPersons[row]));
					}
					break;
				case 2:
					System.out.print("Enter row : ");
					int index = scanner.nextInt();
					System.out.println("Minimum weight of person in a row: " + getMinimumWeight(weightPersons[index]));
					break;
				default:
					System.out.println("Invalid Option");
				}
			}while(option==1||option==2);
		}
	
		private static double getMinimumWeight(double[] personWeightsArr) {
			if (personWeightsArr.length > 0) {
	            double min = personWeightsArr[0];
	            for (double weight : personWeightsArr) {
	                if (weight < min) {
	                    min = weight;
	                }
	            }
	            return min;
	        } else {
	            System.out.println("No weights available");
	            return 0.0;
	        }
			
		}

		private static double[] addWeight(double[] personWeightsArr, double weight) {
			double[] newWeightsArr ;
			if(personWeightsArr != null) {
				newWeightsArr = new double[personWeightsArr.length+1];
				for(int i=0;i<personWeightsArr.length;i++)
						newWeightsArr[i]=personWeightsArr[i];
		        newWeightsArr[personWeightsArr.length] = weight;
			}
			else {
				newWeightsArr = new double[1];
				newWeightsArr[0]=weight;
			}
	        return newWeightsArr;
		}	
}
