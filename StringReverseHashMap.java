package pack1;

import java.util.HashMap;

public class StringReverseHashMap 
{
    public static void main(String[] args) 
    {
        String name = "Manoj";
        
        HashMap<Integer, Character> data = new HashMap<>();

        for(int i=0; i<name.length(); i++)
        {
            data.put(i,name.charAt(i));
        }

        for(int j=name.length()-1; j>=0; j--)
        {
            System.out.print(data.get(j));
        }
    }

    
}
