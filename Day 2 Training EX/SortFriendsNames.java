import java.util.Arrays;
import java.util.Scanner;

public class SortFriendsNames {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[]{"Anirudh", "Ramesh", "Sridhar", "Suresh", "Zarina", "Anirudh", "Raju", "Mukesh"};

        FriendsNames friendsNames = new FriendsNames(names);
        friendsNames.sort();

        for(String name: friendsNames.getNames()){
            System.out.println(name);
        }

    }
}

class FriendsNames{
    private String[] names;

    public FriendsNames(String[] names) {
        this.names = names;
    }

    protected void sort(){

        for(int i=0;i<names.length-1;i++){
            for(int j=i+1;j<names.length;j++){
                if(names[i].charAt(0)>names[j].charAt(0)){
                    String t = names[i];
                    names[i] = names[j];
                    names[j] = t;
                }
            }
        }

    }

    public String[] getNames() {
        return names;
    }
}