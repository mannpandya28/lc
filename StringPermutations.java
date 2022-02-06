/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfg;

import java.util.ArrayList;

/**
 *
 * @author manan
 */
public class GFG {

    /**
     * @param args the command line arguments
     */
    public ArrayList<String> al = new ArrayList<>();
    
    public void permute(char[] a,int start, int end)
    {
        if(start==end-1)
        {
            if(!al.contains(String.valueOf(a)))
                al.add(String.valueOf(a));
        }
        
        else
        {
            for(int i=start;i<end;i++)
            {
                //swap
                char temp = a[i];
                a[i] = a[start];
                a[start] = temp;
                //permute
                permute(a,start+1,end);
                
                temp = a[i];
                a[i] = a[start];
                a[start] = temp;
            }
        }
       
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String s = "for";
        char[]ans = s.toCharArray();
        GFG test = new GFG();
        test.permute(ans,0,ans.length);
        
        for(int i=0;i<test.al.size();i++)
        {
            System.out.println(test.al.get(i));
        }
        
    }
    
}
