import java.util.*;
class LinearString
{
    //method /function
    public static String Search(String menu[],String key)
    {
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return "Valid";
            }
        }
        return "invalid";
    }

    public static void main(String args[])
    {
        String menu[] = {"loni","dosa","uttapa","matan","chicken"};
        String key = "curry";
        String result = Search(menu,key);
        
        if(result  == "Valid "){
            System.out.println("Menu is available ");
        }else{
            System.out.println("Menu is not available");
        }
    }
}