import java.util.Scanner;
import java.util.Random;

class OddsAndEvens{
Scanner input = new Scanner(System.in);

public static String[] intro(){
Scanner input = new Scanner(System.in);
System.out.print("What is your name? ");
String[] ch= new String[2];
ch[0] = input.nextLine();
System.out.print("Hi "+ch[0]+", Which do you choose? (O)dds or (E)vens ");
ch[1] = input.next();
if(ch[1].equals("O")){
System.out.println(ch[0]+" has picked odds! The computer will be evens");
}
else if(ch[1].equals("E")){
System.out.println(ch[0]+" has picked evens! The computer will be odds");
}
return ch;
}

public static void game(String[] choice){
Scanner input = new Scanner(System.in);
System.out.print("\nHow many \"fingers\" do you put out?");
int fngr = input.nextInt();
Random rand = new Random();
int comp = rand.nextInt(6);
System.out.println("The computer plays "+comp+" \"fingers.\"");
for(int j=0; j<15;j++)
System.out.print("-");
int result=fngr+comp;
System.out.println("\n"+fngr+" + "+comp+" = "+result);
if(result%2==0){
System.out.println(result+" is ...even!");
if(choice[1].equals("E")){
System.out.println("That means "+choice[0]+" wins! :)");
}
else{
System.out.println("That means computer wins! :)");
}
}
else{
System.out.println(result+"is ...odd!");
if(choice[1].equals("O")){
System.out.println("That means "+choice[0]+" wins! :)");
}
else{
System.out.println("That means computer wins! :)");
}
}

}


public static void main(String []args){
System.out.println("Let's play a game called \"Odds and Evens\"");

String []ans = intro();
int i;
for(i=0; i<15;i++)
System.out.print("-");
game(ans);

for(i=0; i<15;i++)
System.out.print("-");
}
}