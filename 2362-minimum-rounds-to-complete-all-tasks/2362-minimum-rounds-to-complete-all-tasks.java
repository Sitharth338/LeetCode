class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int count=0;
        int res=0;
        for(int i=0;i<tasks.length;i++){
            count++;
           // if(tasks[i] != tasks[i+1] || i == tasks.length-1){
               
               if (i == tasks.length - 1 || tasks[i] != tasks[i + 1]){

               if(count==1) return -1;

                res = res + count/3;
                if(count % 3 != 0)
                    res++;
                    count=0;
                
            }
        }
        return res;
    }
}