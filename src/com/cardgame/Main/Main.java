package com.cardgame.Main;

import com.cardgame.Util.KeyboardUtil;

public class Main {
      
	 static String Player1;
	 static String Player2;
     static int ss;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              System.out.println("----------Card Game--------");
              String Player1 = KeyboardUtil.getString("Enter the name for Player1: ");
              String Player2 = KeyboardUtil.getString("Enter the name for Player2: ");
              
              while(Player1 != null){
              ss = KeyboardUtil.getint("Continue/Exit the game---- Press 1 to continue or 2 to Exit");
              if(ss == 2){
            	  System.out.println("Game has exited. Thank you!");
            	  System.exit(0);
              }
              else{
              int player = KeyboardUtil.getint("Who wants to start the game:\n Press 1 for "+Player1+ "\n Press 2 for " +Player2+" ");
              if(player == 1){
            	  startgame(Player1);
            	  continue;
              }
              else{
            	  startgame(Player2);
            	  continue;
              }
              }
	}
	}
	private static void chosencard(int cs) {
		// TODO Auto-generated method stub
		    switch(cs){
		    case 1: System.out.println("You have a got an wonderful life ahead\n");
		            break;
		    case 2: System.out.println("whatever you're aiming for, that will become success\n");
		            break;
		    case 3: System.out.println("You will become a doc\n");       
		            break;
		    case 4: System.out.println("You'll buy your own car soon\n");
		            break;
		    case 5: System.out.println("You'll become fat soon\n");
		            break;
		    case 6: System.out.println("You'll be always slim\n");
                    break;
		    case 7: System.out.println("You look Gorgeous\n");
                    break;
		    case 8: System.out.println("You'll get married soon\n");
                    break;
		    case 9: System.out.println("You'll be going for Out of India trip\n");
                    break;
		    case 10: System.out.println("You will be having a lot of fans\n");
                    break;        
		    default:System.out.println("Invalid card: Try other number\n"); 
		            break;
	}

	}

	private static void startgame(String a) {
		// TODO Auto-generated method stub
		System.out.println(" "+a+" to start the game");
		int Cardselect = KeyboardUtil.getint("Select any one card: 1 2 3 4 5 6 7 8 9 10");
		chosencard(Cardselect);
		
	}

}
