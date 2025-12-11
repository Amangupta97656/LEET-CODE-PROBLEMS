class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer,TreeSet<Integer>>row=new HashMap<>();
        Map<Integer,TreeSet<Integer>>col=new HashMap<>();

        for(int []b:buildings){
            row.computeIfAbsent(b[0],k->new TreeSet<>()).add(b[1]);
            col.computeIfAbsent(b[1],k->new TreeSet<>()).add(b[0]);
        }
        int count=0;
        for(int []b:buildings){
            int x=b[0],y=b[1];
            TreeSet<Integer>rows=row.get(x);
            TreeSet<Integer>cols=col.get(y);

            Integer lt=rows.lower(y);
            Integer rt=rows.higher(y);
            Integer up=cols.lower(x);
            Integer dn=cols.higher(x);

            if(lt!=null && rt!=null && up!=null && dn!=null){
                count++;
            }
        }
        return count;
    }
}