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
	
	 
	 public static int getPossiblePair(int[] ar)
		{
			int count=0;

			for(int i=0;i<ar.length;i++)
			{
				for(int j=0;j<ar.length;j++)
				{
					
					if(i!=j && ar[i]>ar[j]  )
					{
						
						int temp=ar[j];
						ar[j]=ar[i];
						ar[i]=temp;
					}
				}
			}
			
			

			for(int i=0;i<ar.length;i++)
			{
				
					int j=i+1;
					for(;j<ar.length;j++)
					{
						int k=j+1;
						for(;k<ar.length;k++)
						{
							if(!(k+1>ar.length-1) && ar[j] +ar[k]==ar[i])
							{
								count++;
								System.out.println("Count Possible By:"+ar[j]+","+ar[k]);
							}
						}
					}
				
						
							
				
			}
			return  count;
		}
	
	public static void checkPatterns(String[] patternsToBeChecked)
	 {
		 for(String pattern:patternsToBeChecked)
			{
//			 String pattern="xyxyzxyxyzxyxyz";
			 boolean isNotPattern=false;
			 boolean isPattern=false;
			 for(int i=1;i<=(pattern.length()/2);i++)
			 {
				String patternToCheck=pattern.substring(0,i);			
				int split=i;
				int prevSplit=i;			
				boolean stillCharLeft=false;
				for(int k=1;k<=(pattern.length()/split)-1;k++)
				{				
					
					if(!patternToCheck.equalsIgnoreCase(pattern.substring(prevSplit,prevSplit+split)))
					{					
						isNotPattern=true;
						System.out.println("Didnt match:"+pattern.substring(prevSplit,prevSplit+split));
						break;
						
					}
					prevSplit=prevSplit+split;
					if((pattern.length()/split)-1==k)
					{
						if(patternToCheck.length()==pattern.substring(prevSplit-split, pattern.length()).length())
						{
							stillCharLeft=true;
						}
						
					}

				}	
				
				if(!isNotPattern && stillCharLeft)
				{
					isPattern=true;
					System.out.println("Pattern Is:"+patternToCheck);
					break;
				}
				isNotPattern=false;
				
			 }
			 
			}
			 
	 }
	
	public static void getSumOfGreatestPairOfDigit(int[] a) {
		// TODO Auto-generated method stub
		
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=getSumOfDigit(a[i]);
			
		}
		HashMap<Integer,ArrayList<Integer>> pairs=new HashMap<Integer,ArrayList<Integer>>();
		for(int j=0;j<b.length;j++)
		{
			ArrayList<Integer> pair=new ArrayList<Integer>();
			pair.add(j);
			for(int k=j+1;k<b.length;k++)
			{
				if(b[j]==b[k])
				{
					pair.add(k);
					pairs.put(b[j], pair);
				}
			}
		}
		ArrayList<Integer> total=new ArrayList<Integer>();

		for(Integer key:pairs.keySet())
		{
			ArrayList<Integer> keyValue=pairs.get(key);
			int temp=0;
			for(int value:keyValue)
			{
				temp=temp+a[value];
			}
			total.add(temp);
		}
		System.out.println( Collections.max(total));
	}
	
	public static int  getSumOfDigit(int a)
	{
		int total=0;
		while(a!=0)
		{
			total=total+a%10;
			a=a/10;
		}
		return total;
	}

	
	

}
