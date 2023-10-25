class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> pathList = new ArrayList<>();
        if(n == 0){
            return pathList;
        }
        if(m[0][0] == 0){
            return pathList;
        }
        int [][]visitedArray = new int[n][n];
        String currentPath = "";
        helper(pathList,currentPath,0,0,m,visitedArray,n);
        return pathList;
    }
    
    public static void helper(List<String> pathList, String currentPath, int currentI, 
    int currentJ, int [][]m, int[][]visitedArray, int n){
        if(currentI == n-1 && currentJ == n-1){
            pathList.add(currentPath);
            return;
        }
        if(currentI < n-1){
            if(visitedArray[currentI+1][currentJ] != 1 && m[currentI+1][currentJ] == 1){
                visitedArray[currentI][currentJ] = 1;
                currentI++;
                currentPath = currentPath + "D";
                helper(pathList,currentPath,currentI,currentJ,m,visitedArray,n);
                currentPath = currentPath.substring(0,currentPath.length()-1);
                currentI--;
                visitedArray[currentI][currentJ] = 0;
            }
        }
        if(currentJ < n-1){
            if(visitedArray[currentI][currentJ+1] != 1 && m[currentI][currentJ+1] == 1){
                visitedArray[currentI][currentJ] = 1;
                currentJ++;
                currentPath = currentPath + "R";
                helper(pathList,currentPath,currentI,currentJ,m,visitedArray,n);
                currentPath = currentPath.substring(0,currentPath.length()-1);
                currentJ--;
                visitedArray[currentI][currentJ] = 0;
            }
        }
        if(currentI > 0){
            if(visitedArray[currentI-1][currentJ] != 1 && m[currentI-1][currentJ] == 1){
                visitedArray[currentI][currentJ] = 1;
                currentI--;
                currentPath = currentPath + "U";
                helper(pathList,currentPath,currentI,currentJ,m,visitedArray,n);
                currentPath = currentPath.substring(0,currentPath.length()-1);
                currentI++;
                visitedArray[currentI][currentJ] = 0;
            }
        }
        if(currentJ > 0){
            if(visitedArray[currentI][currentJ-1] != 1 && m[currentI][currentJ-1] == 1){
                visitedArray[currentI][currentJ] = 1;
                currentJ--;
                currentPath = currentPath + "L";
                helper(pathList,currentPath,currentI,currentJ,m,visitedArray,n);
                currentPath = currentPath.substring(0,currentPath.length()-1);
                currentJ++;
                visitedArray[currentI][currentJ] = 0;
            }
        }
        return;
    }
}

