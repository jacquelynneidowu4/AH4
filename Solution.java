import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> fiveSort(List<Integer> array) {
        //int size=array.size();
        for(int i=0;i<array.size();i++){
            if(array.get(i)==5){
                int count=i+1;
                //System.out.println(count);
                while(count<array.size()){
                    if(array.get(count)!=5){
                        array.set(i,array.get(count));
                        array.set(count, 5);
                        break;
                    }else{
                        count++;
                    }

                }

            }
        }
        // todo
        return array;
    }

    public static void main(String[] args) {
        // this function behaves as `main()` for the 'run' command
        List<Integer> array =new ArrayList<>(List.of(5,2,5,6,5,1,10,2,5,5));
        List<Integer> answer=new ArrayList<>(fiveSort(array));
        for(int i=0;i<array.size();i++){
            System.out.print(answer.get(i)+ " ");
        }
        //System.out.println("Hello World!");

    }

}