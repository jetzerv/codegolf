interface A{static void main(String[]s){for(int i=1;i<201;i++){int x=0;for(int j=1;j<i;j++){x+=(i%j<1)?j:0;}if(x>i)System.out.println(i);}}}
