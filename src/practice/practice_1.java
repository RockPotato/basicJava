package practice;

import java.util.Arrays;
import java.util.Stack;



public class practice_1 {

	public static void main(String[] args) {
		/*String[] str={"abce", "abcd", "cdx"};
		int n=2;
		char[] idx=new char[str.length];
		int[] rank=new int[str.length];
		String[] answer=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			idx[i]=str[i].charAt(n);
		}
		for(int i=0;i<rank.length;i++)
		{
			rank[i] = 1;
		}
		
		for(int i=0;i<rank.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{
				if(idx[i]-'a'>idx[j]-'a')
				{
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
		
		for(int i=0;i<answer.length;i++)
		{
			for(int j=i+1;j<idx.length;j++)
			{
				if(rank[i]==rank[j])
				{
					n++;
					idx[i]=str[i].charAt(n);
					idx[j]=str[j].charAt(n);
					if(idx[i]>idx[j])
					{
						rank[i]++;
					}
				}
			}
		}
		System.out.println(Arrays.toString(rank));
		for(int i=0;i<answer.length;i++)
		{
			answer[i]=str[rank[i]-1];
		}
		
		System.out.println(Arrays.toString(answer));*/
		  String s="z";
		  String answer=null;
		  int n=25;
		  char[] c = s.toCharArray();
	      for(int i=0;i<c.length;i++)
	      {
              int temp=0;
              if(c[i]!=32)
              {
                  temp=(int)c[i]+n;
                  System.out.println(temp+" "+(int)'z');
                  if(temp<126)
                  {
                      if(temp-'a'<0&&temp-'Z'>0)
                      {
                          c[i]=(char) (temp-26);
                      }
                      else if(temp-'z'>0)
                      {
                          c[i]=(char)(temp-26);
                      }
                      else
                      {
                    	  c[i]=(char)temp;
                      }
                  }
                  else
                  {
                      c[i]=(char)(temp-26);
                  }
              }
	          
	      }
	     for(int i=0;i<c.length;i++)
	     {
	         answer+=c[i];
	     }			
	     System.out.println(answer+" "+-'z');
	}

}
