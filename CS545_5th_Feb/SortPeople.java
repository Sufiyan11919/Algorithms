class SortPeople{
    public static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = 0; j < heights.length - i - 1; j++) {
                if (heights[j] < heights[j+1]) {
                    int tempHeight = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = tempHeight;
                    String tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"marry", "harry", "joy", "james", "jane"};
        int[] heights = new int[]{160, 170, 165, 165, 155};
        String[] results = sortPeople(names, heights);
        for(String name:results){
            System.out.println(name);
        }
        // System.out.println(results);
    }
}