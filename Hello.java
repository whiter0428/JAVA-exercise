package hello;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Hello {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int SIZE;
		SIZE=3;
		int x=0;
		int y=0;
		boolean jud1=false;
		boolean jud0=false;
		int [][]board=new int [SIZE][SIZE];
		System.out.println("请输入九个数字:");
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length ;j++)
			{
				board[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length ;j++)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println("");
		}
		for(int i=0;i<board.length;i++)
		{
			x=0;
			y=0;
			for(int j=0;j<board[0].length;j++)
			{
				if(board[i][j]==1)
				{
					x++;
				}
				else {
					y++;
				}
				if(x==3)
				{
					jud1=true;
				}
				if(y==3)
				{
					jud0=true;
				}
			}
		}
		for(int j=0;j<board[0].length;j++)
		{
			x=0;
			y=0;
			for(int i=0;i<board.length;i++)
			{
				if(board[i][j]==1)
				{
					x++;
				}
				else
				{
					y++;
				}
				if(x==3)
				{
					jud1=true;
				}
				if(y==3)
				{
					jud0=true;
				}
			}
			
		}
		for(int i=0,j=0;i<board.length;i++,j++)
		{
			x=0;
			y=0;
			if(board[i][j]==0)
			{
				y++;
			}
			if(board[i][j]==1)
			{
				x++;
			}
			if(x==3)
			{
				jud1=true;
			}
			if(y==3)
			{
				jud0=true;
			}
		}
		for(int i=0;i<board.length;i++)
		{
			x=0;
			y=0;
			int j=board[i].length-i-1;
			if(board[i][j]==1)
			{
				x++;
			}
			else
			{
				y++;
			}
			if(x==3)
			{
				jud1=true;
			}
			if(y==3)
			{
				jud0=true;
			}
		}
		if(jud1)
		{
			System.out.println("数字1的一方获胜。");
		}
		if(jud0)
		{
			System.out.println("数字0的一方获胜。");
		}
		if(!(jud1||jud0))
		{
			System.out.println("没有一方获胜。");
		}
	}
	}


