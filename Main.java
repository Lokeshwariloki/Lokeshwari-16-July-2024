public class Main {
    public static void main(String[] args) {
        int nums[]={13,-3,-5,-100,-1};
        int n=nums.length;
        int res[]=new int[n];
        int odd[]=new int[n/2+1];
        int even[]=new int[n/2];
        int j=0;
        for(int i=0;i<n;i=i+2){
            odd[j++]=nums[i];
        }
        int k=0;
        for(int i=1;i<n;i=i+2){
            even[k++]=nums[i];
        }
        for(int l=0;l<odd.length;l++){
            for(int m=l+1;m<odd.length;m++){
                if(odd[l]<odd[m]){
                    int temp=odd[l];
                    odd[l]=odd[m];
                    odd[m]=temp;
                }
            }
        }
        for(int l=0;l<even.length;l++){
            for(int m=l+1;m<even.length;m++){
                if(even[l]>even[m]){
                    int temp=even[l];
                    even[l]=even[m];
                    even[m]=temp;
                }
            }
        }
        int r=0,p=0,m=0;
        if(n%2==0){
            for(int l=0;l<n/2;l++){
                res[m++]=odd[p++];
                res[m++]=even[r++];
            }
        }
        if(n%1==0){
            for(int l=0;l<n/2;l++){
                res[m++]=odd[p++];
                res[m++]=even[r++];
            }
            res[m]=odd[p];
        }
        for(int l=0;l<res.length;l++){
            System.out.print(res[l]+" ");
        }

    }
}