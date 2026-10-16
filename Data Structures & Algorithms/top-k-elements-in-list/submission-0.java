class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> mp = new HashMap<>();
        for(int num:nums){
            if(mp.containsKey(num)){
                mp.put(num , mp.get(num)+1);
            }else
            mp.put(num,1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(Integer a, Integer b){
                return mp.get(a) - mp.get(b);
            }
        });

        for(int n:mp.keySet()){
            pq.offer(n);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int result[] = new int[k];
        int idx =0;
        while(!pq.isEmpty()){
            result[idx] = pq.poll();
            idx++;
        }
        return result;

        

        }
        
    }

