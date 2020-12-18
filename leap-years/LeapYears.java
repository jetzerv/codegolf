interface LeapYears {
    static void main(String[] a){
        for(int i =1800;i<2401;i++){
            if(i%4==0 && !(i%100==0&&i%400>1)) System.out.println(i);
        }
    }
}