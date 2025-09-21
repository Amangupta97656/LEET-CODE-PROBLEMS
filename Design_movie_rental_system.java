class MovieRentingSystem {

    class Movie{
        int shop, movie, price;
        Movie(int s, int m, int p){
            shop=s;
            movie=m;
            price=p;
        }
        @Override
        public String toString(){
            return shop+" - "+movie+" - "+price;
        }
    }
    HashMap<Integer, TreeSet<Movie>> nonRented;
    HashMap<String, Movie> shopMovie;
    TreeSet<Movie> rented;


    public MovieRentingSystem(int n, int[][] entries) {
        shopMovie=new HashMap<>();
        nonRented=new HashMap<>();
        rented = new TreeSet<>((m1, m2) -> {
            int s1=m1.shop, s2=m2.shop;
            int p1=m1.price, p2=m2.price;
            int mv1=m1.movie, mv2=m2.movie;
            if(p1==p2) {
                if(s1==s2) return mv1-mv2;
                return s1-s2;
            }
            return p1-p2;
        });
        for(var v:entries){
            if(nonRented.containsKey(v[1])) continue;
            nonRented.put(v[1], new TreeSet<>((m1, m2) -> {
                int s1=m1.shop, s2=m2.shop;
                int p1=m1.price, p2=m2.price;
                if(p1==p2) return s1-s2;
                return p1-p2;
            }));
        }
        for(var v:entries){
            Movie temp=new Movie(v[0], v[1], v[2]);
            nonRented.get(v[1]).add(temp);
            shopMovie.put(v[0]+"-"+v[1], temp);
        }
    }
    
    public List<Integer> search(int movie) {

        if(!nonRented.containsKey(movie) || nonRented.get(movie).isEmpty()) return new ArrayList<>();
        int counter=0;
        List<Integer> ans=new ArrayList<>();

        for(var v:nonRented.get(movie)){
            ans.add(v.shop);
            counter++;
            if(counter==5) break;
        }       
        return ans;

    }
    
    public void rent(int shop, int movie) {

        Movie mov=shopMovie.get(shop+"-"+movie);

        nonRented.get(movie).remove(mov);
        rented.add(mov);
        
    }
    
    public void drop(int shop, int movie) {
        
        Movie mov=shopMovie.get(shop+"-"+movie);

        rented.remove(mov);
        nonRented.get(movie).add(mov);


    }
    
    public List<List<Integer>> report() {

        if(rented.isEmpty()) return new ArrayList<>();

        List<List<Integer>> ans=new ArrayList<>();
        int counter=0;
        for(var v:rented){
            List<Integer> temp=new ArrayList<>();
            temp.add(v.shop);
            temp.add(v.movie);
            ans.add(temp);
            counter++;
            if(counter==5) break;
        }

        return ans;
    }
}
