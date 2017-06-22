package frequency;

import java.io.*;
class frequency
{
		

	void check()throws Exception
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any string: ");
        String s = br.readLine();
  
        s=s.toLowerCase();
        int l=s.length(); 
        char ch;
        System.out.println("Output:");
      
        System.out.println("Alphabet\tFrequency");
        
  
        int count=0;
        for(char i='a'; i<='z'; i++)
        {
                count = 0;
                for(int j=0; j<l; j++)
                {
                    ch=s.charAt(j); 
                    if(ch==i) 
                        count++; 
                }
                if(count!=0)
                {
                    System.out.println(i+"\t\t"+count);
                }
        }
	}
    public static void main(String[]args)throws Exception
    {
        
            frequency o1 = new frequency();
            	o1.check();
    }
}