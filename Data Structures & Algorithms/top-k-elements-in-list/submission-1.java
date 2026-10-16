class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<>();
        for(int num:nums){
            if(mp.containsKey(num)){
                mp.put(num , mp.get(num)+1);
            }else
            mp.put(num,1);
        }


        List<Integer> [] bucket = new List[nums.length+1];
        for(int n:mp.keySet()){
            int freq = mp.get(n);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();

            }
            bucket[freq].add(n);

        }

        int result[] = new int[k];
        int idx =0;
        for(int i=nums.length;i>=1;i--){
            if(bucket[i]!=null){
                for(int n:bucket[i]){
                    result[idx] = n;
                    idx++;
                }
                if(idx == k){
                    return result;
                }
            }

        }
        return result;

   

        

        }
        
    }

