class Pair
{
    //method//function
    public static void getPair(int numbers[])
    {
        for(int i=0; i<numbers.length-1; i++){
            int current = numbers[i];    //2
            for(int j=i+1; j<=numbers.length-1; j++){   // i+1 = 1-index   =4
                System.out.print("("+current+","+numbers[j]+")");   //(2,4) (2,6) (2,8) (2,10)
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10};
        getPair(numbers);
    }
}