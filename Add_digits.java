 int count=0;
        int i=0;
        while(i<m){
            if((i==0 || seats[i-1] == 0) && 
            seats[i] == 0 && 
            (i==m-1 || seats[i+1] == 0)){
                count++;
                i+=2;
            }else if(seats[i] == 1) i+=2;
            else i++;
        }
        if(count >= n)  return true; 
        return false; 
    }
}