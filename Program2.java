public class Program2 {
    public static void main(String args[]) {
        String arr[][]={{"Paari","Karikalan"},
                {"Udhiran","Sendhan"},
                {"Sendhan","Arulmozhi"},
                {"Karikalan","Sendhan"}};
        String input="Arulmozhi";
        int count=0;
        String str="";
        for(int i=0;i<4;i++){
            if(arr[i][1].equals(input)){
                str=arr[i][0];
            }
        }
        for(int i=0;i<4;i++){
            if(arr[i][1].equals(str)){
                count++;
            }
        }
        System.out.print(count);

    }

}
