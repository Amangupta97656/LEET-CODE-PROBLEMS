class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottlesDrunk = 0;
        int emptyBottles = 0;
        
        bottlesDrunk += numBottles;
        emptyBottles += numBottles;

        while(emptyBottles>=numExchange){
            emptyBottles-=numExchange;
            numExchange++;

            bottlesDrunk ++;
            emptyBottles ++;
        }
        return bottlesDrunk;
    }
}