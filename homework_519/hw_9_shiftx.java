package homework_519;

import java.util.ArrayList;
import java.util.Scanner;

public class hw_9_shiftx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
	System.out.println(endX(s));
			}

	public static String endX(String str) {
		  ArrayList<Character> track = new ArrayList<Character>();
		  return end(str,"",0,track);
		}

		public static String end(String str,String res,int index,ArrayList<Character> track)
		{
		  if(index==str.length() && track.size()==0)
		  {
		    return res;
		  }
		  else if(index==str.length() && track.size()!=0)
		  {

		    return end(str,res+String.valueOf(track.remove(0)),index,track);
		  }
		  else if(str.charAt(index)=='x')
		  {
		    track.add(str.charAt(index));
		    return end(str,res,index+1,track); 
		  }
		  else
		  {
		    return end(str,res+str.charAt(index),index+1,track);
		  }

		}}