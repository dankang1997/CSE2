import java.util.Scanner;

public class MineSweeper {

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.println("How big do you want the board to be?");
		System.out.println("(It has to be between 2 and 30)");
		
		// N and N2 will decide the dimensions of the board according to the user input
		int N = input.nextInt();
		int N2 = N;
		
		// If the user input is greater than 30 or less than 2, it will not work
		if(N>30 || N<2)
		{
			System.out.println("Invalid input Please restart the program");
			System.exit(0);
		}

		System.out.println("How many Mines do you want?");
		System.out.println("(It has to be between 1 and (N*N)*Size of the board)");
		
		// M will decide how many mines will be placed
		int M = input.nextInt();

		if(M>(N*N2) || M<1)
		{
			System.out.println("Invalid input Please restart the program");
			System.exit(0);		
		}

		String[][] board = new String[N][N];		
		
//		 This will set up the board		
		for (int x = 0; x < board.length; x++)
		{
			for (int y = 0; y < board.length; y++)
			{ 
				// In the beginning, every cell will be "0"
				if(board[x][y] == null)
				{
					board[x][y] = "|0|";
				}
			}
		}

		// This will set up the mines
		for(int x = 0; x<M; x++)
		{
			int randomX = (int)(Math.random()*N);
			int randomY = (int)(Math.random()*N);

			// The "0" will be set to "M" according to random numbers
			if(board[randomX][randomY] == "|0|" && board[randomX][randomY] != "|M|")
			{
				board[randomX][randomY] = "|M|";
			}
			// If there is already a "M" there, it will look for more spots
			else if(board[randomX][randomY] == "|M|")
			{
				board[(int)(Math.random()*N)][(int)(Math.random()*N)] = "|M|";
			}
		}
		
		// This will set up the numbers
		for(int h = 0; h<N-1; h++)
		{
			for(int w = 0; w<N-1; w++)
			{
				if(board[0][0] == "|M|") //Top Left Corner
				{
					board[1][1] = "|1|";
					board[1][0] = "|1|";
					board[0][1] = "|1|";
				}
				else if(board[0][N-1] == "|M|") //Top Right Corner
				{
					board[1][N-1] = "|1|";
					board[1][N-1] = "|1|";
					board[0][N-2] = "|1|";
					
					
				}
				else if(board[N-1][0] == "|M|") //Bottom Left Corner
				{
					board[N-2][1] = "|1|";
					board[N-2][0] = "|1|";
					board[N-1][1] = "|1|";
					
				}
				else if(board[N-1][N-1] == "|M|") //Bottom Right Corner
				{
					board[N-2][N-2] = "|1|";
					board[N-2][N-1] = "|1|";
					board[N-1][N-2] = "|1|";
				}
				else if((h==0) && (board[h][w] == "|M|")) // Top wall
				{
					board[0][w-1] = "|1|";
					board[0][w+1] = "|1|";
					board[1][w-1] = "|1|";
					board[1][w+1] = "|1|";
					board[1][w] = "|1|";
				}
				else if((w==0) && (board[h][w] == "|M|")) // Left wall
				{
					board[h+1][0] = "|1|";
					board[h-1][0] = "|1|";
					board[h+1][1] = "|1|";
					board[h-1][1] = "|1|";
					board[h][1] = "|1|";
				}
				else if((h == N-1) && (board[h][w] == "|M|")) // Bottom wall
				{
					board[h][w-1] = "|1|";
					board[h][w+1] = "|1|";
					board[(h-1)][w-1] = "|1|";
					board[(h-1)][w+1] = "|1|";
					board[(h-1)][w] = "|1|";
				}
				else if((w == N-1) && (board[h][w] == "|M|")) // Right wall
				{
					board[h+1][w] = "|1|";
					board[h-1][w] = "|1|";
					board[h+1][w-1] = "|1|";
					board[h-1][w-1] = "|1|";
					board[h][w-1] = "|1|";
				}
				else if((board[h][w]) == "|M|" && h>0 && w>0 && h<N-1 && w<N-1) // All else
				{
					board[h-1][w-1] = "|1|";
					board[h-1][w] = "|1|";
					board[h-1][w+1] = "|1|";
					board[h][w-1] = "|1|";
					board[h][w+1] = "|1|";
					board[h+1][w-1] = "|1|";
					board[h+1][w] = "|1|";
					board[h+1][w+1] = "|1|";
				}
			}
		}

				
		// This will print the board
		for (int x = 0; x < board.length; x++)
		{
			for (int y = 0; y < board.length; y++)
			{ 
				System.out.print(board[x][y] + " "); 
			}
			System.out.println(" ");
			System.out.println(" ");
		}
	}

}
