import java.util.Scanner;
public class Project {
			public static void main(String[] args) {
				System.out.println("Which vegetable you  want to purchase: ");
				System.out.println("Enter 1 for Lemon");
				System.out.println("Enter 2 for cauliflower");
				System.out.println("Enter 3 for Ladyfinger");
				System.out.println("Enter 4 for Broccoli");
				System.out.println("Enter 5 for cabbage");
				System.out.println("Enter 6 for Tomato");
				System.out.println("Enter 7 for Potato");
				System.out.println("Enter 8 for Green beans");
				System.out.println("Enter 9 for Kidney beans");
				System.out.println("Enter 10 for lentils");
				System.out.println("Enter your choice : ");
				Scanner scan = new Scanner(System.in);
				int n=scan.nextInt();
				
				switch(n){
				case 1: 
				System.out.println("Enter how many Kg's you want :");
				float a=scan.nextFloat();
				a=a*40;
				System.out.println("Your Total amount is Rs "+a);
				break;
				case 2: 
					System.out.println("Enter how many Kg's you want :");
					float b=scan.nextFloat();
					b=b*45;
					System.out.println("Your Total amount is Rs "+b);
					break;
				case 3: 
					System.out.println("Enter how many Kg's you want :");
					float c=scan.nextFloat();
					c=c*55;
					System.out.println("Your Total amount is Rs "+c);
					break;
				case 4: 
					System.out.println("Enter how many Kg's you want :");
					float d=scan.nextFloat();
					d=d*48;
					System.out.println("Your Total amount is Rs "+d);
					break;
				case 5: 
					System.out.println("Enter how many Kg's you want :");
					float e=scan.nextFloat();
					e=e*50;
					System.out.println("Your Total amount is Rs "+e);
					break;
				case 6: 
					System.out.println("Enter how many Kg's you want :");
					float f=scan.nextFloat();
					f=f*60;
					System.out.println("Your Total amount is Rs "+f);
					break;
				case 7: 
					System.out.println("Enter how many Kg's you want :");
					float g=scan.nextFloat();
					g=g*65;
					System.out.println("Your Total amount is Rs "+g);
					break;
				case 8: 
					System.out.println("Enter how many Kg's you want :");
					float h=scan.nextFloat();
					h=h*70;
					System.out.println("Your Total amount is Rs "+h);
					break;
				case 9: 
					System.out.println("Enter how many Kg's you want :");
					float i=scan.nextFloat();
					i=i*75;
					System.out.println("Your Total amount is Rs "+i);
					break;
				case 10: 
					System.out.println("Enter how many Kg's you want :");
					float j=scan.nextFloat();
					j=j*40;
					System.out.println("Your Total amount is Rs "+j);
					break;
					
					default:
						System.out.println("Entered choice is wrong");
						break;
				}

			}
}
