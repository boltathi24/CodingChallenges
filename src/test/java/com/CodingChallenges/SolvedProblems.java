package com.CodingChallenges;

import java.util.ArrayList;
import java.util.List;

public class SolvedProblems {
	

	 public static boolean isPairPossible(int a,int b,int c,int d)
	 {
		 //		 int val=getPairs(5, 6)[1][0];
//		 System.out.println(val);
		 int[][] val=new int[10][10];
		 int[][] newval=new int[10][10];
		 
		 List<int[][]> temp=new ArrayList<int[][]>();
//		val[0][0]=1;
//		val[0][1]=1;
		val[1][0]=a;
		val[1][1]=b;
		temp.add(val);
//		int c=6;int d=4;
		int i=0;
		do {
			 if(i!=0)
			 {
			 temp.add(getPairs(temp.get(i)[0][0], temp.get(i)[0][1]));
			 }
			 temp.add(getPairs(temp.get(i)[1][0], temp.get(i)[1][1]));
			 i++;
//			 System.out.println(temp.get(temp.size()-1)[0][0]>c);
//			 System.out.println(temp.get(temp.size()-1)[0][0]>d);
//			 System.out.println(temp.get(temp.size()-1)[0][1]>c);
//			 System.out.println(temp.get(temp.size()-1)[0][1]>d);
//			 System.out.println(!((temp.get(temp.size()-1)[0][0]>c &&temp.get(temp.size()-1)[0][0]>d )&& (temp.get(temp.size()-1)[0][1]>c &&temp.get(temp.size()-1)[0][1]>d )));
		}
		while(!((temp.get(temp.size()-1)[0][0]>c &&temp.get(temp.size()-1)[0][0]>d )&& (temp.get(temp.size()-1)[0][1]>c &&temp.get(temp.size()-1)[0][1]>d ))) ;
		
//		for(int[][] t:temp)
//		{
//			System.out.print(t[0][0]);
//			System.out.println(t[0][1]);
//			System.out.print(t[1][0]);
//			System.out.println(t[1][1]);
//		}
		boolean possible=false;
		for(int[][] t:temp)
		{
			 if(t[1][0]==c && t[1][1]==d)
			 {
				 System.out.println(" Pair ("+t[1][0]+", "+t[1][1]+")is Possible ");
				 possible=true;
			 }
			 else if(t[0][0]==c && t[0][1]==d)
			 {
				 System.out.println("Yes Pair ("+t[0][0]+", "+t[0][1]+")is Possible ");
				 possible=true;
			 }
		}	 
		return possible;
		 
	 }
	 
	 public static int[][] getPairs(int a,int b)
	 {
		int c=a+b;
		int[][] result= {{a,c},{c,b}};
		
		return result;
		
	 }
	

}
