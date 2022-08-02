class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int len = firstList.length + secondList.length;
        int[] starts = new int[len];
        int[] ends = new int[len];
        for(int i = 0; i < firstList.length; i++){
            starts[i] = firstList[i][0];
            ends[i] = firstList[i][1];
        }
        for(int i = firstList.length; i < firstList.length + secondList.length; i++){
            starts[i] = secondList[i - firstList.length][0];
            ends[i] = secondList[i - firstList.length][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        List<int[]> res = new ArrayList<>();
        for(int i = 1; i < starts.length; i++){
            if(starts[i] <= ends[i - 1]){
                res.add(new int[]{starts[i], ends[i - 1]});
            }
        }
        int size = res.size();
        int[][] result = new int[size][2];
        for(int i = 0; i < size; i++){
            result[i] = res.get(i);
        }
        return result;
    }
}