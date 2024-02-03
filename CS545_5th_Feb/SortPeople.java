import java.util.HashMap;

class SortPeople{
    public static String[] sortPeople(String[] name, int[] heights){

        HashMap<Integer,String> map = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            map.put(heights[i], name[i]);
        }
        for(int i = 0; i < heights.length; i++){
            int maxIndex = i;
            for(int j = i+1; j< heights.length; j++){
                if(heights[i]>heights[j]){
                    maxIndex = j;
                }
            }
            int temp = heights[maxIndex];
            heights[maxIndex] = heights[i];
            heights[i] = temp;

        }
        // for (int i = 0; i < heights.length; i++) {
        //     for (int j = 0; j < heights.length - i - 1; j++) {
        //         if (heights[j] > heights[j+1]) {
        //             int temp = heights[j];
        //             heights[j] = heights[j+1];
        //             heights[j+1] = temp;
        //         }
        //     }
        // }
        return name;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"marry", "harry", "joy", "james", "jane"};
        int[] heights = new int[]{160, 170, 165, 165, 155};
        String[] results = sortPeople(names, heights);
        for(String name:results){
            System.out.println(name);
        }
    }
}