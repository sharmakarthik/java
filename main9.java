class main9{
public static void main(String[] args){
int s=9;
for (int i = 1; i< s; i++){
for (int j=1; j< s; j++){
if (i == 1 || i == s - 1) {
System.out.print("*");
}
else {
if (j == 1 || j == s - 1){
System.out.print("*");
}
else {
System.out.print(" ");
}
}
}
System.out.println();
}
}
}